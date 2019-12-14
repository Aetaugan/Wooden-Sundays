
package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Seed {

    @SerializedName("vegetative_spread_rate")
    @Expose
    private String vegetativeSpreadRate;
    @SerializedName("small_grain")
    @Expose
    private Object smallGrain;
    @SerializedName("seeds_per_pound")
    @Expose
    private Double seedsPerPound;
    @SerializedName("seedling_vigor")
    @Expose
    private String seedlingVigor;
    @SerializedName("seed_spread_rate")
    @Expose
    private Object seedSpreadRate;
    @SerializedName("commercial_availability")
    @Expose
    private String commercialAvailability;
    @SerializedName("bloom_period")
    @Expose
    private String bloomPeriod;

    public String getVegetativeSpreadRate() {
        return vegetativeSpreadRate;
    }

    public void setVegetativeSpreadRate(String vegetativeSpreadRate) {
        this.vegetativeSpreadRate = vegetativeSpreadRate;
    }

    public Object getSmallGrain() {
        return smallGrain;
    }

    public void setSmallGrain(Object smallGrain) {
        this.smallGrain = smallGrain;
    }

    public Double getSeedsPerPound() {
        return seedsPerPound;
    }

    public void setSeedsPerPound(Double seedsPerPound) {
        this.seedsPerPound = seedsPerPound;
    }

    public String getSeedlingVigor() {
        return seedlingVigor;
    }

    public void setSeedlingVigor(String seedlingVigor) {
        this.seedlingVigor = seedlingVigor;
    }

    public Object getSeedSpreadRate() {
        return seedSpreadRate;
    }

    public void setSeedSpreadRate(Object seedSpreadRate) {
        this.seedSpreadRate = seedSpreadRate;
    }

    public String getCommercialAvailability() {
        return commercialAvailability;
    }

    public void setCommercialAvailability(String commercialAvailability) {
        this.commercialAvailability = commercialAvailability;
    }

    public String getBloomPeriod() {
        return bloomPeriod;
    }

    public void setBloomPeriod(String bloomPeriod) {
        this.bloomPeriod = bloomPeriod;
    }

}
