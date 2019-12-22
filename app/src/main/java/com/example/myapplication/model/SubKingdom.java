package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubKingdom {

    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("link")
    @Expose
    private String link;

    public String getSKSlug() {
        return slug;
    }

    public void setSKSlug(String slug) {
        this.slug = slug;
    }

    public String getSKName() {
        return name;
    }

    public void setSKName(String name) {        this.name = name;    }

    public String getSKLink() {
        return link;
    }

    public void setSKLink(String link) {
        this.link = link;
    }
}
