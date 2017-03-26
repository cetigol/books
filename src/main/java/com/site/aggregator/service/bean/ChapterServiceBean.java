package com.site.aggregator.service.bean;

import com.site.aggregator.dao.ChapterDao;
import com.site.aggregator.entities.Chapter;
import com.site.aggregator.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by cetig on 19.03.2017.
 */
@Service
public class ChapterServiceBean implements ChapterService{

    @Autowired
    private ChapterDao chapterDao;

    @Override
    @Transactional
    public Chapter saveOrUpdate(Chapter chapter) {
        return chapterDao.save(chapter);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Chapter> getAll() {
        return chapterDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Chapter getById(Integer id) {
        return chapterDao.findOne(id);
    }
}
