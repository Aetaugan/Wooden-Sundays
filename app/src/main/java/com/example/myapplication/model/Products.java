
package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Products {

    @SerializedName("veneer")
    @Expose
    private Object veneer;
    @SerializedName("pulpwood")
    @Expose
    private Object pulpwood;
    @SerializedName("protein_potential")
    @Expose
    private Object proteinPotential;
    @SerializedName("post")
    @Expose
    private Object post;
    @SerializedName("palatable_human")
    @Expose
    private Boolean palatableHuman;
    @SerializedName("palatable_graze_animal")
    @Expose
    private String palatableGrazeAnimal;
    @SerializedName("palatable_browse_animal")
    @Expose
    private String palatableBrowseAnimal;
    @SerializedName("nursery_stock")
    @Expose
    private Object nurseryStock;
    @SerializedName("naval_store")
    @Expose
    private Object navalStore;
    @SerializedName("lumber")
    @Expose
    private Object lumber;
    @SerializedName("fuelwood")
    @Expose
    private Object fuelwood;
    @SerializedName("fodder")
    @Expose
    private Object fodder;
    @SerializedName("christmas_tree")
    @Expose
    private Object christmasTree;
    @SerializedName("berry_nut_seed")
    @Expose
    private Object berryNutSeed;

    public Object getVeneer() {
        return veneer;
    }

    public void setVeneer(Object veneer) {
        this.veneer = veneer;
    }

    public Object getPulpwood() {
        return pulpwood;
    }

    public void setPulpwood(Object pulpwood) {
        this.pulpwood = pulpwood;
    }

    public Object getProteinPotential() {
        return proteinPotential;
    }

    public void setProteinPotential(Object proteinPotential) {
        this.proteinPotential = proteinPotential;
    }

    public Object getPost() {
        return post;
    }

    public void setPost(Object post) {
        this.post = post;
    }

    public Boolean getPalatableHuman() {
        return palatableHuman;
    }

    public void setPalatableHuman(Boolean palatableHuman) {
        this.palatableHuman = palatableHuman;
    }

    public String getPalatableGrazeAnimal() {
        return palatableGrazeAnimal;
    }

    public void setPalatableGrazeAnimal(String palatableGrazeAnimal) {
        this.palatableGrazeAnimal = palatableGrazeAnimal;
    }

    public String getPalatableBrowseAnimal() {
        return palatableBrowseAnimal;
    }

    public void setPalatableBrowseAnimal(String palatableBrowseAnimal) {
        this.palatableBrowseAnimal = palatableBrowseAnimal;
    }

    public Object getNurseryStock() {
        return nurseryStock;
    }

    public void setNurseryStock(Object nurseryStock) {
        this.nurseryStock = nurseryStock;
    }

    public Object getNavalStore() {
        return navalStore;
    }

    public void setNavalStore(Object navalStore) {
        this.navalStore = navalStore;
    }

    public Object getLumber() {
        return lumber;
    }

    public void setLumber(Object lumber) {
        this.lumber = lumber;
    }

    public Object getFuelwood() {
        return fuelwood;
    }

    public void setFuelwood(Object fuelwood) {
        this.fuelwood = fuelwood;
    }

    public Object getFodder() {
        return fodder;
    }

    public void setFodder(Object fodder) {
        this.fodder = fodder;
    }

    public Object getChristmasTree() {
        return christmasTree;
    }

    public void setChristmasTree(Object christmasTree) {
        this.christmasTree = christmasTree;
    }

    public Object getBerryNutSeed() {
        return berryNutSeed;
    }

    public void setBerryNutSeed(Object berryNutSeed) {
        this.berryNutSeed = berryNutSeed;
    }

}
