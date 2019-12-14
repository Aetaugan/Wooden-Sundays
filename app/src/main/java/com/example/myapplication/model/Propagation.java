
package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Propagation {

    @SerializedName("tubers")
    @Expose
    private Object tubers;
    @SerializedName("sprigs")
    @Expose
    private Boolean sprigs;
    @SerializedName("sod")
    @Expose
    private Object sod;
    @SerializedName("seed")
    @Expose
    private Boolean seed;
    @SerializedName("cuttings")
    @Expose
    private Boolean cuttings;
    @SerializedName("corms")
    @Expose
    private Object corms;
    @SerializedName("container")
    @Expose
    private Boolean container;
    @SerializedName("bulbs")
    @Expose
    private Object bulbs;
    @SerializedName("bare_root")
    @Expose
    private Boolean bareRoot;

    public Object getTubers() {
        return tubers;
    }

    public void setTubers(Object tubers) {
        this.tubers = tubers;
    }

    public Boolean getSprigs() {
        return sprigs;
    }

    public void setSprigs(Boolean sprigs) {
        this.sprigs = sprigs;
    }

    public Object getSod() {
        return sod;
    }

    public void setSod(Object sod) {
        this.sod = sod;
    }

    public Boolean getSeed() {
        return seed;
    }

    public void setSeed(Boolean seed) {
        this.seed = seed;
    }

    public Boolean getCuttings() {
        return cuttings;
    }

    public void setCuttings(Boolean cuttings) {
        this.cuttings = cuttings;
    }

    public Object getCorms() {
        return corms;
    }

    public void setCorms(Object corms) {
        this.corms = corms;
    }

    public Boolean getContainer() {
        return container;
    }

    public void setContainer(Boolean container) {
        this.container = container;
    }

    public Object getBulbs() {
        return bulbs;
    }

    public void setBulbs(Object bulbs) {
        this.bulbs = bulbs;
    }

    public Boolean getBareRoot() {
        return bareRoot;
    }

    public void setBareRoot(Boolean bareRoot) {
        this.bareRoot = bareRoot;
    }

}
