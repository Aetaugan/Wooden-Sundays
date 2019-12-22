package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Family {

    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("link")
    @Expose
    private String link;
   /* @SerializedName("id")
    @Expose*/
    // private Integer id;

    public String getFSlug() {
        return slug;
    }

    public void setFSlug(String slug) {
        this.slug = slug;
    }

    public String getFName() {
        return name;
    }

    public void setFName(String name) {        this.name = name;    }

    public String getFLink() {
        return link;
    }

    public void setFLink(String link) {
        this.link = link;
    }

    /*public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }*/
}
