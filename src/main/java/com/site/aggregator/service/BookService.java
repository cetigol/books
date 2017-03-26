package com.site.aggregator.service;

import com.site.aggregator.entities.Book;
import com.site.aggregator.vo.BookVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cetig on 19.03.2017.
 */
public interface BookService {

    Book saveOrUpdate(Book book);

    List<Book> getAll();

    Book getById(Integer id);

    Book parseSamlibPage(String url);

    List<BookVO> getAllVOBook();
}
