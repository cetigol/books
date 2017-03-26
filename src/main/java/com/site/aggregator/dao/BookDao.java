package com.site.aggregator.dao;

import com.site.aggregator.entities.Book;
import com.site.aggregator.vo.BookVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by cetig on 19.03.2017.
 */
public interface BookDao extends JpaRepository<Book, Integer>{

    @Query("select new com.site.aggregator.vo.BookVO(b.id,b.name,b.image,b.author) from Book as b")
    List<BookVO> getAllBookVO();
}
