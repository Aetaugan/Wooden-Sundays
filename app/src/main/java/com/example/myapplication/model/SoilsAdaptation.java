
package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SoilsAdaptation {

    @SerializedName("medium")
    @Expose
    private Object medium;
    @SerializedName("fine")
    @Expose
    private Object fine;
    @SerializedName("coarse")
    @Expose
    private Boolean coarse;

    public Object getMedium() {
        return medium;
    }

    public void setMedium(Object medium) {
        this.medium = medium;
    }

    public Object getFine() {
        return fine;
    }

    public void setFine(Object fine) {
        this.fine = fine;
    }

    public Boolean getCoarse() {
        return coarse;
    }

    public void setCoarse(Boolean coarse) {
        this.coarse = coarse;
    }

}
