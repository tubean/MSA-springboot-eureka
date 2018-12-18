package io.github.tubean.eureka.gallery.entity;

import java.util.List;

public class Gallery {
    private Integer id;
    private List<Object> images;

    public Gallery(Integer id, List<Object> images) {
        this.id = id;
        this.images = images;
    }

    public Gallery() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Object> getImages() {
        return images;
    }

    public void setImages(List<Object> images) {
        this.images = images;
    }
}
