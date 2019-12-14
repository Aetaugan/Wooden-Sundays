
package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MaxHeightAtBaseAge {

    @SerializedName("ft")
    @Expose
    private Double ft;
    @SerializedName("cm")
    @Expose
    private Double cm;

    public Double getFt() {
        return ft;
    }

    public void setFt(Double ft) {
        this.ft = ft;
    }

    public Double getCm() {
        return cm;
    }

    public void setCm(Double cm) {
        this.cm = cm;
    }

}
