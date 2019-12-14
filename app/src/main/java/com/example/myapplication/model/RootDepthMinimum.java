
package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RootDepthMinimum {

    @SerializedName("inches")
    @Expose
    private Double inches;
    @SerializedName("cm")
    @Expose
    private Double cm;

    public Double getInches() {
        return inches;
    }

    public void setInches(Double inches) {
        this.inches = inches;
    }

    public Double getCm() {
        return cm;
    }

    public void setCm(Double cm) {
        this.cm = cm;
    }

}
