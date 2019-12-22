package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Order {

    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("link")
    @Expose
    private String link;

    public String getOSlug() {
        return slug;
    }

    public void setOSlug(String slug) {
        this.slug = slug;
    }

    public String getOName() {
        return name;
    }

    public void setOName(String name) {        this.name = name;    }

    public String getOLink() {
        return link;
    }

    public void setOLink(String link) {
        this.link = link;
    }
}
