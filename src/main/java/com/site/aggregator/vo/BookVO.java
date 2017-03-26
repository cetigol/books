package com.site.aggregator.vo;

/**
 * Created by cetig on 20.03.2017.
 */
public class BookVO {

    private Integer id;

    private String name;

    private String image;

    private String author;

    public BookVO() {
    }

    public BookVO(Integer id, String name, String image, String author) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
