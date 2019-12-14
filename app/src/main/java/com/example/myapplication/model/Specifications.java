
package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Specifications {

    @SerializedName("toxicity")
    @Expose
    private String toxicity;
    @SerializedName("shape_and_orientation")
    @Expose
    private Object shapeAndOrientation;
    @SerializedName("regrowth_rate")
    @Expose
    private Object regrowthRate;
    @SerializedName("nitrogen_fixation")
    @Expose
    private String nitrogenFixation;
    @SerializedName("max_height_at_base_age")
    @Expose
    private MaxHeightAtBaseAge maxHeightAtBaseAge;
    @SerializedName("mature_height")
    @Expose
    private MatureHeight matureHeight;
    @SerializedName("low_growing_grass")
    @Expose
    private Object lowGrowingGrass;
    @SerializedName("lifespan")
    @Expose
    private String lifespan;
    @SerializedName("leaf_retention")
    @Expose
    private Boolean leafRetention;
    @SerializedName("known_allelopath")
    @Expose
    private Object knownAllelopath;
    @SerializedName("growth_rate")
    @Expose
    private String growthRate;
    @SerializedName("growth_period")
    @Expose
    private String growthPeriod;
    @SerializedName("growth_habit")
    @Expose
    private String growthHabit;
    @SerializedName("growth_form")
    @Expose
    private String growthForm;
    @SerializedName("fire_resistance")
    @Expose
    private Object fireResistance;
    @SerializedName("fall_conspicuous")
    @Expose
    private Object fallConspicuous;
    @SerializedName("coppice_potential")
    @Expose
    private Object coppicePotential;
    @SerializedName("c_n_ratio")
    @Expose
    private String cNRatio;
    @SerializedName("bloat")
    @Expose
    private String bloat;

    public String getToxicity() {
        return toxicity;
    }

    public void setToxicity(String toxicity) {
        this.toxicity = toxicity;
    }

    public Object getShapeAndOrientation() {
        return shapeAndOrientation;
    }

    public void setShapeAndOrientation(Object shapeAndOrientation) {
        this.shapeAndOrientation = shapeAndOrientation;
    }

    public Object getRegrowthRate() {
        return regrowthRate;
    }

    public void setRegrowthRate(Object regrowthRate) {
        this.regrowthRate = regrowthRate;
    }

    public String getNitrogenFixation() {
        return nitrogenFixation;
    }

    public void setNitrogenFixation(String nitrogenFixation) {
        this.nitrogenFixation = nitrogenFixation;
    }

    public MaxHeightAtBaseAge getMaxHeightAtBaseAge() {
        return maxHeightAtBaseAge;
    }

    public void setMaxHeightAtBaseAge(MaxHeightAtBaseAge maxHeightAtBaseAge) {
        this.maxHeightAtBaseAge = maxHeightAtBaseAge;
    }

    public MatureHeight getMatureHeight() {
        return matureHeight;
    }

    public void setMatureHeight(MatureHeight matureHeight) {
        this.matureHeight = matureHeight;
    }

    public Object getLowGrowingGrass() {
        return lowGrowingGrass;
    }

    public void setLowGrowingGrass(Object lowGrowingGrass) {
        this.lowGrowingGrass = lowGrowingGrass;
    }

    public String getLifespan() {
        return lifespan;
    }

    public void setLifespan(String lifespan) {
        this.lifespan = lifespan;
    }

    public Boolean getLeafRetention() {
        return leafRetention;
    }

    public void setLeafRetention(Boolean leafRetention) {
        this.leafRetention = leafRetention;
    }

    public Object getKnownAllelopath() {
        return knownAllelopath;
    }

    public void setKnownAllelopath(Object knownAllelopath) {
        this.knownAllelopath = knownAllelopath;
    }

    public String getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(String growthRate) {
        this.growthRate = growthRate;
    }

    public String getGrowthPeriod() {
        return growthPeriod;
    }

    public void setGrowthPeriod(String growthPeriod) {
        this.growthPeriod = growthPeriod;
    }

    public String getGrowthHabit() {
        return growthHabit;
    }

    public void setGrowthHabit(String growthHabit) {
        this.growthHabit = growthHabit;
    }

    public String getGrowthForm() {
        return growthForm;
    }

    public void setGrowthForm(String growthForm) {
        this.growthForm = growthForm;
    }

    public Object getFireResistance() {
        return fireResistance;
    }

    public void setFireResistance(Object fireResistance) {
        this.fireResistance = fireResistance;
    }

    public Object getFallConspicuous() {
        return fallConspicuous;
    }

    public void setFallConspicuous(Object fallConspicuous) {
        this.fallConspicuous = fallConspicuous;
    }

    public Object getCoppicePotential() {
        return coppicePotential;
    }

    public void setCoppicePotential(Object coppicePotential) {
        this.coppicePotential = coppicePotential;
    }

    public String getCNRatio() {
        return cNRatio;
    }

    public void setCNRatio(String cNRatio) {
        this.cNRatio = cNRatio;
    }

    public String getBloat() {
        return bloat;
    }

    public void setBloat(String bloat) {
        this.bloat = bloat;
    }

}
