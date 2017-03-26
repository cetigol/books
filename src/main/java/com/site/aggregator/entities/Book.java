package com.site.aggregator.entities;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 * Created by cetig on 19.03.2017.
 */
@Entity
@Table(name = "book")
public class Book extends BaseEntity{

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "created_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "updated_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;

    @Column(name = "description", length=500)
    private String description;

    @Column(name = "image")
    private String image;

    @OneToMany(fetch = FetchType.LAZY, cascade = javax.persistence.CascadeType.ALL, mappedBy = "book")
    private List<Chapter> chapters;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "book_categorie", joinColumns = {
            @JoinColumn(name = "book_id", nullable = false) },
            inverseJoinColumns = { @JoinColumn(name = "categorie_id",
                    nullable = false) })
    @Cascade(value = CascadeType.SAVE_UPDATE)
    private List<Categorie> categories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }
}
