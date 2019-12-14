package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class RetroPhoto {

    @SerializedName("slug")
    private String slug;
    @SerializedName("id")
    private Integer id;
    @SerializedName("scientific_name")
    private String scientific_name;
    @SerializedName("url")
    private String url;
    @SerializedName("common_name")
    private String common_name;

    public RetroPhoto(String slug, Integer id, String scientific_name, String url, String common_name) {
        this.slug = slug;
        this.id = id;
        this.scientific_name = scientific_name;
        this.url = url;
        this.common_name = common_name;
    }

    public String getslug() {
        return slug;
    }

    public void setslug(String slug) {
        this.slug = slug;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getscientific_name() {
        return scientific_name;
    }

    public void setscientific_name(String scientific_name) {
        this.scientific_name = scientific_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getcommon_name() {
        return common_name;
    }

    public void setcommon_name(String common_name) {
        this.common_name = common_name;
    }
}
