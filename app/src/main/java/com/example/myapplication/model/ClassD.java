package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClassD {

    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("link")
    @Expose
    private String link;

    public String getCSlug() {
        return slug;
    }

    public void setCSlug(String slug) {
        this.slug = slug;
    }

    public String getCName() {
        return name;
    }

    public void setCName(String name) {        this.name = name;    }

    public String getCLink() {
        return link;
    }

    public void setCLink(String link) {
        this.link = link;
    }
}
