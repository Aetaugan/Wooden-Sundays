
package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TemperatureMinimum {

    @SerializedName("deg_f")
    @Expose
    private Double degF;
    @SerializedName("deg_c")
    @Expose
    private Double degC;

    public Double getDegF() {
        return degF;
    }

    public void setDegF(Double degF) {
        this.degF = degF;
    }

    public Double getDegC() {
        return degC;
    }

    public void setDegC(Double degC) {
        this.degC = degC;
    }

}
