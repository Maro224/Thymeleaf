package com.example.thymeleaf.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tcgplayer{
    @JsonProperty("url")
    public String getUrl() {
        return this.url; }
    public void setUrl(String url) {
        this.url = url; }
    String url;
    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return this.updatedAt; }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt; }
    String updatedAt;

    @Override
    public String toString() {
        return "Tcgplayer{" +
                "url='" + url + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", prices=" + prices +
                '}';
    }

    @JsonProperty("prices")
    public Prices getPrices() {
        return this.prices; }
    public void setPrices(Prices prices) {
        this.prices = prices; }
    Prices prices;
}
