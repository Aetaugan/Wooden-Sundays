
package com.example.myapplication.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Variety {

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
    @SerializedName("sources")
    @Expose
    private List<Source> sources = null;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("scientific_name")
    @Expose
    private static String scientificName;
    @SerializedName("main_species_id")
    @Expose
    private Integer mainSpeciesId;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("is_main_species")
    @Expose
    private Boolean isMainSpecies;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("family_common_name")
    @Expose
    private String familyCommonName;
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

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public Integer getMainSpeciesId() {
        return mainSpeciesId;
    }

    public void setMainSpeciesId(Integer mainSpeciesId) {
        this.mainSpeciesId = mainSpeciesId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Boolean getIsMainSpecies() {
        return isMainSpecies;
    }

    public void setIsMainSpecies(Boolean isMainSpecies) {
        this.isMainSpecies = isMainSpecies;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFamilyCommonName() {
        return familyCommonName;
    }

    public void setFamilyCommonName(String familyCommonName) {
        this.familyCommonName = familyCommonName;
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
