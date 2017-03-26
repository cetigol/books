package com.site.aggregator.service;

import com.site.aggregator.entities.Book;
import com.site.aggregator.entities.Chapter;

import java.util.List;

/**
 * Created by cetig on 19.03.2017.
 */
public interface ChapterService {

    Chapter saveOrUpdate(Chapter chapter);

    List<Chapter> getAll();

    Chapter getById(Integer id);
}
