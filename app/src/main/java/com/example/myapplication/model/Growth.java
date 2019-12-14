
package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Growth {

    @SerializedName("temperature_minimum")
    @Expose
    private TemperatureMinimum temperatureMinimum;
    @SerializedName("shade_tolerance")
    @Expose
    private String shadeTolerance;
    @SerializedName("salinity_tolerance")
    @Expose
    private String salinityTolerance;
    @SerializedName("root_depth_minimum")
    @Expose
    private RootDepthMinimum rootDepthMinimum;
    @SerializedName("resprout_ability")
    @Expose
    private Boolean resproutAbility;
    @SerializedName("precipitation_minimum")
    @Expose
    private PrecipitationMinimum precipitationMinimum;
    @SerializedName("precipitation_maximum")
    @Expose
    private PrecipitationMaximum precipitationMaximum;
    @SerializedName("planting_density_minimum")
    @Expose
    private PlantingDensityMinimum plantingDensityMinimum;
    @SerializedName("planting_density_maximum")
    @Expose
    private PlantingDensityMaximum plantingDensityMaximum;
    @SerializedName("ph_minimum")
    @Expose
    private Double phMinimum;
    @SerializedName("ph_maximum")
    @Expose
    private Double phMaximum;
    @SerializedName("moisture_use")
    @Expose
    private Object moistureUse;
    @SerializedName("hedge_tolerance")
    @Expose
    private String hedgeTolerance;
    @SerializedName("frost_free_days_minimum")
    @Expose
    private Double frostFreeDaysMinimum;
    @SerializedName("fire_tolerance")
    @Expose
    private String fireTolerance;
    @SerializedName("fertility_requirement")
    @Expose
    private String fertilityRequirement;
    @SerializedName("drought_tolerance")
    @Expose
    private String droughtTolerance;
    @SerializedName("cold_stratification_required")
    @Expose
    private Boolean coldStratificationRequired;
    @SerializedName("caco_3_tolerance")
    @Expose
    private Object caco3Tolerance;
    @SerializedName("anaerobic_tolerance")
    @Expose
    private String anaerobicTolerance;

    public TemperatureMinimum getTemperatureMinimum() {
        return temperatureMinimum;
    }

    public void setTemperatureMinimum(TemperatureMinimum temperatureMinimum) {
        this.temperatureMinimum = temperatureMinimum;
    }

    public String getShadeTolerance() {
        return shadeTolerance;
    }

    public void setShadeTolerance(String shadeTolerance) {
        this.shadeTolerance = shadeTolerance;
    }

    public String getSalinityTolerance() {
        return salinityTolerance;
    }

    public void setSalinityTolerance(String salinityTolerance) {
        this.salinityTolerance = salinityTolerance;
    }

    public RootDepthMinimum getRootDepthMinimum() {
        return rootDepthMinimum;
    }

    public void setRootDepthMinimum(RootDepthMinimum rootDepthMinimum) {
        this.rootDepthMinimum = rootDepthMinimum;
    }

    public Boolean getResproutAbility() {
        return resproutAbility;
    }

    public void setResproutAbility(Boolean resproutAbility) {
        this.resproutAbility = resproutAbility;
    }

    public PrecipitationMinimum getPrecipitationMinimum() {
        return precipitationMinimum;
    }

    public void setPrecipitationMinimum(PrecipitationMinimum precipitationMinimum) {
        this.precipitationMinimum = precipitationMinimum;
    }

    public PrecipitationMaximum getPrecipitationMaximum() {
        return precipitationMaximum;
    }

    public void setPrecipitationMaximum(PrecipitationMaximum precipitationMaximum) {
        this.precipitationMaximum = precipitationMaximum;
    }

    public PlantingDensityMinimum getPlantingDensityMinimum() {
        return plantingDensityMinimum;
    }

    public void setPlantingDensityMinimum(PlantingDensityMinimum plantingDensityMinimum) {
        this.plantingDensityMinimum = plantingDensityMinimum;
    }

    public PlantingDensityMaximum getPlantingDensityMaximum() {
        return plantingDensityMaximum;
    }

    public void setPlantingDensityMaximum(PlantingDensityMaximum plantingDensityMaximum) {
        this.plantingDensityMaximum = plantingDensityMaximum;
    }

    public Double getPhMinimum() {
        return phMinimum;
    }

    public void setPhMinimum(Double phMinimum) {
        this.phMinimum = phMinimum;
    }

    public Double getPhMaximum() {
        return phMaximum;
    }

    public void setPhMaximum(Double phMaximum) {
        this.phMaximum = phMaximum;
    }

    public Object getMoistureUse() {
        return moistureUse;
    }

    public void setMoistureUse(Object moistureUse) {
        this.moistureUse = moistureUse;
    }

    public String getHedgeTolerance() {
        return hedgeTolerance;
    }

    public void setHedgeTolerance(String hedgeTolerance) {
        this.hedgeTolerance = hedgeTolerance;
    }

    public Double getFrostFreeDaysMinimum() {
        return frostFreeDaysMinimum;
    }

    public void setFrostFreeDaysMinimum(Double frostFreeDaysMinimum) {
        this.frostFreeDaysMinimum = frostFreeDaysMinimum;
    }

    public String getFireTolerance() {
        return fireTolerance;
    }

    public void setFireTolerance(String fireTolerance) {
        this.fireTolerance = fireTolerance;
    }

    public String getFertilityRequirement() {
        return fertilityRequirement;
    }

    public void setFertilityRequirement(String fertilityRequirement) {
        this.fertilityRequirement = fertilityRequirement;
    }

    public String getDroughtTolerance() {
        return droughtTolerance;
    }

    public void setDroughtTolerance(String droughtTolerance) {
        this.droughtTolerance = droughtTolerance;
    }

    public Boolean getColdStratificationRequired() {
        return coldStratificationRequired;
    }

    public void setColdStratificationRequired(Boolean coldStratificationRequired) {
        this.coldStratificationRequired = coldStratificationRequired;
    }

    public Object getCaco3Tolerance() {
        return caco3Tolerance;
    }

    public void setCaco3Tolerance(Object caco3Tolerance) {
        this.caco3Tolerance = caco3Tolerance;
    }

    public String getAnaerobicTolerance() {
        return anaerobicTolerance;
    }

    public void setAnaerobicTolerance(String anaerobicTolerance) {
        this.anaerobicTolerance = anaerobicTolerance;
    }

}
