
package com.example.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Foliage {

    @SerializedName("texture")
    @Expose
    private String texture;
    @SerializedName("porosity_winter")
    @Expose
    private Object porosityWinter;
    @SerializedName("porosity_summer")
    @Expose
    private Object porositySummer;
    @SerializedName("color")
    @Expose
    private String color;

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public Object getPorosityWinter() {
        return porosityWinter;
    }

    public void setPorosityWinter(Object porosityWinter) {
        this.porosityWinter = porosityWinter;
    }

    public Object getPorositySummer() {
        return porositySummer;
    }

    public void setPorositySummer(Object porositySummer) {
        this.porositySummer = porositySummer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
