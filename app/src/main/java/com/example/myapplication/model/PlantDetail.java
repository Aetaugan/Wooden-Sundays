
package com.example.myapplication.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.example.myapplication.model.Variety;

public class PlantDetail {

    @SerializedName("varieties")
    @Expose
    private List<Variety> varieties = null;
    @SerializedName("VarietiesName")
    @Expose
    private String varietiesName;
    @SerializedName("sub_species")
    @Expose
    private List<SubSpecy> subSpecies = null;
    @SerializedName("scientific_name")
    @Expose
    private String scientificName;
    @SerializedName("order")
    @Expose
    private Object order;
    @SerializedName("native_status")
    @Expose
    private String nativeStatus;
    @SerializedName("main_species")
    @Expose
    private MainSpecies mainSpecies;
    @SerializedName("images")
    @Expose
    private List<Image_> images = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("hybrids")
    @Expose
    private List<Object> hybrids = null;
    @SerializedName("genus")
    @Expose
    private Genus genus;
    @SerializedName("forms")
    @Expose
    private List<Object> forms = null;
    @SerializedName("family_common_name")
    @Expose
    private String familyCommonName;
    @SerializedName("family")
    @Expose
    private Family family;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("division")
    @Expose
    private Division  division;
    @SerializedName("cultivars")
    @Expose
    private List<Object> cultivars = null;
    @SerializedName("common_name")
    @Expose
    private String commonName;
    @SerializedName("class")
    @Expose
    private Object _class;

    public PlantDetail(List<Variety> varieties, String varietiesName, List<SubSpecy> subSpecies, String scientificName, Object order, String nativeStatus, MainSpecies mainSpecies, List<Image_> images, Integer id, List<Object> hybrids, Genus genus, List<Object> forms, String familyCommonName, Family family, String duration, Division division, List<Object> cultivars, String commonName, Object _class) {
        this.varieties = varieties;
        this.varietiesName = varietiesName;
        this.subSpecies = subSpecies;
        this.scientificName = scientificName;
        this.order = order;
        this.nativeStatus = nativeStatus;
        this.mainSpecies = mainSpecies;
        this.images = images;
        this.id = id;
        this.hybrids = hybrids;
        this.genus = genus;
        this.forms = forms;
        this.familyCommonName = familyCommonName;
        this.family = family;
        this.duration = duration;
        this.division = division;
        this.cultivars = cultivars;
        this.commonName = commonName;
        this._class = _class;
    }

    public List<Variety> getVarieties() {
        return varieties;
    }

    public String getVarietiesName()
    {
        return varietiesName;
    }


    public void setVarieties(List<Variety> varieties) {
        this.varieties = varieties;
    }

    public List<SubSpecy> getSubSpecies() {
        return subSpecies;
    }

    public void setSubSpecies(List<SubSpecy> subSpecies) {
        this.subSpecies = subSpecies;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public Object getOrder() {
        return order;
    }

    public void setOrder(Object order) {
        this.order = order;
    }

    public String getNativeStatus() {
        return nativeStatus;
    }

    public void setNativeStatus(String nativeStatus) {
        this.nativeStatus = nativeStatus;
    }

    public MainSpecies getMainSpecies() {
        return mainSpecies;
    }

    public void setMainSpecies(MainSpecies mainSpecies) {
        this.mainSpecies = mainSpecies;
    }

    public List<Image_> getImages() {
        return images;
    }

    public void setImages(List<Image_> images) {
        this.images = images;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Object> getHybrids() {
        return hybrids;
    }

    public void setHybrids(List<Object> hybrids) {
        this.hybrids = hybrids;
    }

    public Genus getGenus() {
        return genus;
    }

    public void setGenus(Genus genus) {
        this.genus = genus;
    }

    public List<Object> getForms() {
        return forms;
    }

    public void setForms(List<Object> forms) {
        this.forms = forms;
    }

    public String getFamilyCommonName() {
        return familyCommonName;
    }

    public void setFamilyCommonName(String familyCommonName) {
        this.familyCommonName = familyCommonName;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public List<Object> getCultivars() {
        return cultivars;
    }

    public void setCultivars(List<Object> cultivars) {
        this.cultivars = cultivars;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public Object getClass_() {
        return _class;
    }

    public void setClass_(Object _class) {
        this._class = _class;
    }

}
