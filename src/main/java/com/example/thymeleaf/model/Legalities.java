package com.example.thymeleaf.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Legalities{
    @JsonProperty("unlimited")
    public String getUnlimited() {
        return this.unlimited; }
    public void setUnlimited(String unlimited) {
        this.unlimited = unlimited; }
    String unlimited;
    @JsonProperty("expanded")
    public String getExpanded() {
        return this.expanded; }
    public void setExpanded(String expanded) {
        this.expanded = expanded; }
    String expanded;

    @Override
    public String toString() {
        return "Legalities{" +
                "unlimited='" + unlimited + '\'' +
                ", expanded='" + expanded + '\'' +
                ", standard='" + standard + '\'' +
                '}';
    }

    @JsonProperty("standard")
    public String getStandard() {
        return this.standard; }
    public void setStandard(String standard) {
        this.standard = standard; }
    String standard;
}
