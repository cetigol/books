package com.site.aggregator.dao;

import com.site.aggregator.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by cetig on 19.03.2017.
 */
public interface CategorieDao  extends JpaRepository<Categorie, Integer> {
}
