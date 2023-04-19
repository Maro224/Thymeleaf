package com.example.thymeleaf.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Images{
    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol; }
    public void setSymbol(String symbol) {
        this.symbol = symbol; }
    String symbol;
    @JsonProperty("logo")
    public String getLogo() {
        return this.logo; }
    public void setLogo(String logo) {
        this.logo = logo; }
    String logo;
    @JsonProperty("small")
    public String getSmall() {
        return this.small; }
    public void setSmall(String small) {
        this.small = small; }
    String small;

    @Override
    public String toString() {
        return "Images{" +
                "symbol='" + symbol + '\'' +
                ", logo='" + logo + '\'' +
                ", small='" + small + '\'' +
                ", large='" + large + '\'' +
                '}';
    }

    @JsonProperty("large")
    public String getLarge() {
        return this.large; }
    public void setLarge(String large) {
        this.large = large; }
    String large;
}
