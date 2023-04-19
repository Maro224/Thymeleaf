package com.example.thymeleaf.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Ability{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("text")
    public String getText() {
        return this.text; }
    public void setText(String text) {
        this.text = text; }
    String text;
    @JsonProperty("type")
    public String getType() {
        return this.type; }
    public void setType(String type) {
        this.type = type; }
    String type;

    @Override
    public String toString() {
        return "Ability{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
