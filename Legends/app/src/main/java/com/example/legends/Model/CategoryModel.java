package com.example.legends.Model;

import java.io.Serializable;

public class CategoryModel implements Serializable {
    private long id;
    private String name;
    private int imageId;

    public CategoryModel() {
    }

    public CategoryModel(long id, String name, int imageId) {
        this.id = id;
        this.name = name;
        this.imageId = imageId;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getIcon() {
        return imageId;
    }
}
