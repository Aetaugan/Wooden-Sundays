package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Genuses {

    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("kingdom")
    @Expose
    private Kingdom kingdom;
    @SerializedName("subkingdom")
    @Expose
    private SubKingdom subKingdom;
    @SerializedName("division")
    @Expose
    private Division division;
    @SerializedName("class")
    @Expose
    private ClassD classD;
    @SerializedName("order")
    @Expose
    private Order order;
    @SerializedName("family")
    @Expose
    private Family family;
   /* @SerializedName("id")
    @Expose*/
    // private Integer id;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getGenName() {
        return name;
    }

    public void setGenName(String name) {        this.name = name;    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Kingdom getKingdom() {
        return kingdom;
    }

    public void setKingdom(Kingdom kingdom) {
        this.kingdom = kingdom;
    }

    public SubKingdom getSubKingdom() {
        return subKingdom;
    }

    public void setSubKingdom(SubKingdom subKingdom) {
        this.subKingdom = subKingdom;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public ClassD getClassD() {
        return classD;
    }

    public void setClassD(ClassD classD) {
        this.classD = classD;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    /*public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }*/
}
