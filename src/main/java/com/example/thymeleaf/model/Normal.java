package com.example.thymeleaf.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Normal{
    @JsonProperty("low")
    public double getLow() {
        return this.low; }
    public void setLow(double low) {
        this.low = low; }
    double low;
    @JsonProperty("mid")
    public double getMid() {
        return this.mid; }
    public void setMid(double mid) {
        this.mid = mid; }
    double mid;
    @JsonProperty("high")
    public double getHigh() {
        return this.high; }
    public void setHigh(double high) {
        this.high = high; }
    double high;

    @Override
    public String toString() {
        return "Normal{" +
                "low=" + low +
                ", mid=" + mid +
                ", high=" + high +
                ", market=" + market +
                ", directLow=" + directLow +
                '}';
    }

    @JsonProperty("market")
    public double getMarket() {
        return this.market; }
    public void setMarket(double market) {
        this.market = market; }
    double market;
    @JsonProperty("directLow")
    public double getDirectLow() {
        return this.directLow; }
    public void setDirectLow(double directLow) {
        this.directLow = directLow; }
    double directLow;
}
