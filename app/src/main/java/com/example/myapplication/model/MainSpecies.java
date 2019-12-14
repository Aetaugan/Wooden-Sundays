
package com.example.myapplication.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainSpecies {

    @SerializedName("year")
    @Expose
    private Object year;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("synonym")
    @Expose
    private Boolean synonym;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("specifications")
    @Expose
    private Specifications specifications;
    @SerializedName("sources")
    @Expose
    private List<Source__> sources = null;
    @SerializedName("soils_adaptation")
    @Expose
    private SoilsAdaptation soilsAdaptation;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("seed")
    @Expose
    private Seed seed;
    @SerializedName("scientific_name")
    @Expose
    private String scientificName;
    @SerializedName("propagation")
    @Expose
    private Propagation propagation;
    @SerializedName("products")
    @Expose
    private Products products;
    @SerializedName("native_status")
    @Expose
    private String nativeStatus;
    @SerializedName("main_species_id")
    @Expose
    private Object mainSpeciesId;
    @SerializedName("is_main_species")
    @Expose
    private Boolean isMainSpecies;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("growth")
    @Expose
    private Growth growth;
    @SerializedName("fruit_or_seed")
    @Expose
    private FruitOrSeed fruitOrSeed;
    @SerializedName("foliage")
    @Expose
    private Foliage foliage;
    @SerializedName("flower")
    @Expose
    private Flower flower;
    @SerializedName("family_common_name")
    @Expose
    private String familyCommonName;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("complete_data")
    @Expose
    private Boolean completeData;
    @SerializedName("common_name")
    @Expose
    private String commonName;
    @SerializedName("bibliography")
    @Expose
    private Object bibliography;
    @SerializedName("author")
    @Expose
    private Object author;

    public Object getYear() {
        return year;
    }

    public void setYear(Object year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSynonym() {
        return synonym;
    }

    public void setSynonym(Boolean synonym) {
        this.synonym = synonym;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Specifications getSpecifications() {
        return specifications;
    }

    public void setSpecifications(Specifications specifications) {
        this.specifications = specifications;
    }

    public List<Source__> getSources() {
        return sources;
    }

    public void setSources(List<Source__> sources) {
        this.sources = sources;
    }

    public SoilsAdaptation getSoilsAdaptation() {
        return soilsAdaptation;
    }

    public void setSoilsAdaptation(SoilsAdaptation soilsAdaptation) {
        this.soilsAdaptation = soilsAdaptation;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Seed getSeed() {
        return seed;
    }

    public void setSeed(Seed seed) {
        this.seed = seed;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public Propagation getPropagation() {
        return propagation;
    }

    public void setPropagation(Propagation propagation) {
        this.propagation = propagation;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public String getNativeStatus() {
        return nativeStatus;
    }

    public void setNativeStatus(String nativeStatus) {
        this.nativeStatus = nativeStatus;
    }

    public Object getMainSpeciesId() {
        return mainSpeciesId;
    }

    public void setMainSpeciesId(Object mainSpeciesId) {
        this.mainSpeciesId = mainSpeciesId;
    }

    public Boolean getIsMainSpecies() {
        return isMainSpecies;
    }

    public void setIsMainSpecies(Boolean isMainSpecies) {
        this.isMainSpecies = isMainSpecies;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Growth getGrowth() {
        return growth;
    }

    public void setGrowth(Growth growth) {
        this.growth = growth;
    }

    public FruitOrSeed getFruitOrSeed() {
        return fruitOrSeed;
    }

    public void setFruitOrSeed(FruitOrSeed fruitOrSeed) {
        this.fruitOrSeed = fruitOrSeed;
    }

    public Foliage getFoliage() {
        return foliage;
    }

    public void setFoliage(Foliage foliage) {
        this.foliage = foliage;
    }

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public String getFamilyCommonName() {
        return familyCommonName;
    }

    public void setFamilyCommonName(String familyCommonName) {
        this.familyCommonName = familyCommonName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Boolean getCompleteData() {
        return completeData;
    }

    public void setCompleteData(Boolean completeData) {
        this.completeData = completeData;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public Object getBibliography() {
        return bibliography;
    }

    public void setBibliography(Object bibliography) {
        this.bibliography = bibliography;
    }

    public Object getAuthor() {
        return author;
    }

    public void setAuthor(Object author) {
        this.author = author;
    }

}
