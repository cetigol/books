package com.site.aggregator.entities;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by cetig on 19.03.2017.
 */
@Entity
@Table(name = "categorie")
public class Categorie extends BaseEntity{

    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "book_categorie", joinColumns = {
            @JoinColumn(name = "categorie_id", nullable = false) },
            inverseJoinColumns = { @JoinColumn(name = "book_id",
                    nullable = false) })
    @Cascade(value = org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<Book> books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
