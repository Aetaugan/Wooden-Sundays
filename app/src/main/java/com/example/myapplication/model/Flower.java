
package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Flower {

    @SerializedName("conspicuous")
    @Expose
    private Boolean conspicuous;
    @SerializedName("color")
    @Expose
    private String color;

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
