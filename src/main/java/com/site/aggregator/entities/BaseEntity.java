package com.site.aggregator.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by cetig on 19.03.2017.
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
