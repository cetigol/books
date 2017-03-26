package com.site.aggregator.dao;

import com.site.aggregator.entities.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by cetig on 19.03.2017.
 */
public interface ChapterDao extends JpaRepository<Chapter, Integer>{
}
