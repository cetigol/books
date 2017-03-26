package com.site.aggregator.service.bean;

import com.site.aggregator.dao.BookDao;
import com.site.aggregator.dao.CategorieDao;
import com.site.aggregator.dao.ChapterDao;
import com.site.aggregator.entities.Book;
import com.site.aggregator.entities.Chapter;
import com.site.aggregator.service.BookService;
import com.site.aggregator.vo.BookVO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by cetig on 19.03.2017.
 */
@Service
public class BookServiceBean implements BookService{

    @Autowired
    private BookDao bookDao;

    @Autowired
    private ChapterDao chapterDao;

    @Autowired
    private CategorieDao categorieDao;

    @Override
    @Transactional
    public Book saveOrUpdate(Book book) {
        return bookDao.save(book);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Book> getAll() {
        return bookDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Book getById(Integer id) {
        return bookDao.findOne(id);
    }

    @Override
    public Book parseSamlibPage(String page) {

        Book book = new Book();
        book.setAuthor("Палий Инна");
        book.setCreatedDate(new Date());
        book.setUpdatedDate(new Date());

        Document document = getRequestedPage(page);
        Elements parent = document.select("body");
        String header = parent.select("center>h2").text();
        book.setName(header);
        book = bookDao.save(book);
        Elements headers = parent.select("center");
        Elements div = parent.select("div");
        Elements delimiter = parent.select("hr");
        headers.remove();
        delimiter.remove();
        div.remove();
        String body = parent.text();
        body = body.substring(body.indexOf("Глава "));
        String[] chapters = body.split("Глава [0-9]+");
        Integer chapterCount = 1;
        List<Chapter> chapterList = new ArrayList<>();
        for(String item:chapters){
            if(!item.isEmpty()) {
                Chapter chapter = new Chapter();
                chapter.setBook(book);
                chapter.setContent(item);
                chapter.setChapterNumber(chapterCount);
                chapterCount++;
                chapterList.add(chapter);
            }
        }
        chapterDao.save(chapterList);
        book.setChapters(chapterList);
        book = bookDao.save(book);
        return book;
    }

    @Override
    public List<BookVO> getAllVOBook() {
        return bookDao.getAllBookVO();
    }

    private Document getRequestedPage(String href){
        Document doc = null;
        try {
            doc = Jsoup.connect(href).validateTLSCertificates(false).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }
}
