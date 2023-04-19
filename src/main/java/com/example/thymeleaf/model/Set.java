package com.example.thymeleaf.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Set{
    @JsonProperty("id")
    public String getId() {
        return this.id; }
    public void setId(String id) {
        this.id = id; }
    String id;
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("series")
    public String getSeries() {
        return this.series; }
    public void setSeries(String series) {
        this.series = series; }
    String series;
    @JsonProperty("printedTotal")
    public int getPrintedTotal() {
        return this.printedTotal; }
    public void setPrintedTotal(int printedTotal) {
        this.printedTotal = printedTotal; }
    int printedTotal;
    @JsonProperty("total")
    public int getTotal() {
        return this.total; }
    public void setTotal(int total) {
        this.total = total; }
    int total;
    @JsonProperty("legalities")
    public Legalities getLegalities() {
        return this.legalities; }
    public void setLegalities(Legalities legalities) {
        this.legalities = legalities; }
    Legalities legalities;
    @JsonProperty("ptcgoCode")
    public String getPtcgoCode() {
        return this.ptcgoCode; }
    public void setPtcgoCode(String ptcgoCode) {
        this.ptcgoCode = ptcgoCode; }
    String ptcgoCode;
    @JsonProperty("releaseDate")
    public String getReleaseDate() {
        return this.releaseDate; }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate; }
    String releaseDate;
    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return this.updatedAt; }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt; }
    String updatedAt;

    @Override
    public String toString() {
        return "Set{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", series='" + series + '\'' +
                ", printedTotal=" + printedTotal +
                ", total=" + total +
                ", legalities=" + legalities +
                ", ptcgoCode='" + ptcgoCode + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", images=" + images +
                '}';
    }

    @JsonProperty("images")
    public Images getImages() {
        return this.images; }
    public void setImages(Images images) {
        this.images = images; }
    Images images;
}
