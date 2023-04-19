package com.example.thymeleaf.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weakness{
    @JsonProperty("type")
    public String getType() {
        return this.type; }
    public void setType(String type) {
        this.type = type; }
    String type;
    @JsonProperty("value")
    public String getValue() {
        return this.value; }
    public void setValue(String value) {
        this.value = value; }
    String value;

    @Override
    public String toString() {
        return "Weakness{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
