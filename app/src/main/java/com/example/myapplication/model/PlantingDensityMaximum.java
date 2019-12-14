
package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlantingDensityMaximum {

    @SerializedName("sqm")
    @Expose
    private Double sqm;
    @SerializedName("acre")
    @Expose
    private Double acre;

    public Double getSqm() {
        return sqm;
    }

    public void setSqm(Double sqm) {
        this.sqm = sqm;
    }

    public Double getAcre() {
        return acre;
    }

    public void setAcre(Double acre) {
        this.acre = acre;
    }

}
