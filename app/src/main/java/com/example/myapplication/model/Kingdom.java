package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Kingdom {

    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("link")
    @Expose
    private String link;

    public String getKSlug() {
        return slug;
    }

    public void setKSlug(String slug) {
        this.slug = slug;
    }

    public String getKName() {
        return name;
    }

    public void setKName(String name) {        this.name = name;    }

    public String getKLink() {
        return link;
    }

    public void setKLink(String link) {
        this.link = link;
    }
}
