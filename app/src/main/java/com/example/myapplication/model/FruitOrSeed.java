
package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FruitOrSeed {

    @SerializedName("seed_persistence")
    @Expose
    private Boolean seedPersistence;
    @SerializedName("seed_period_end")
    @Expose
    private String seedPeriodEnd;
    @SerializedName("seed_period_begin")
    @Expose
    private String seedPeriodBegin;
    @SerializedName("seed_abundance")
    @Expose
    private Object seedAbundance;
    @SerializedName("conspicuous")
    @Expose
    private Boolean conspicuous;
    @SerializedName("color")
    @Expose
    private String color;

    public Boolean getSeedPersistence() {
        return seedPersistence;
    }

    public void setSeedPersistence(Boolean seedPersistence) {
        this.seedPersistence = seedPersistence;
    }

    public String getSeedPeriodEnd() {
        return seedPeriodEnd;
    }

    public void setSeedPeriodEnd(String seedPeriodEnd) {
        this.seedPeriodEnd = seedPeriodEnd;
    }

    public String getSeedPeriodBegin() {
        return seedPeriodBegin;
    }

    public void setSeedPeriodBegin(String seedPeriodBegin) {
        this.seedPeriodBegin = seedPeriodBegin;
    }

    public Object getSeedAbundance() {
        return seedAbundance;
    }

    public void setSeedAbundance(Object seedAbundance) {
        this.seedAbundance = seedAbundance;
    }

    public Boolean getConspicuous() {
        return conspicuous;
    }

    public void setConspicuous(Boolean conspicuous) {
        this.conspicuous = conspicuous;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
