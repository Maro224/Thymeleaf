package com.example.thymeleaf.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Datum{
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
    @JsonProperty("supertype")
    public String getSupertype() {
        return this.supertype; }
    public void setSupertype(String supertype) {
        this.supertype = supertype; }
    String supertype;
    @JsonProperty("subtypes")
    public ArrayList<String> getSubtypes() {
        return this.subtypes; }
    public void setSubtypes(ArrayList<String> subtypes) {
        this.subtypes = subtypes; }
    ArrayList<String> subtypes;
    @JsonProperty("hp")
    public String getHp() {
        return this.hp; }
    public void setHp(String hp) {
        this.hp = hp; }
    String hp;
    @JsonProperty("types")
    public ArrayList<String> getTypes() {
        return this.types; }
    public void setTypes(ArrayList<String> types) {
        this.types = types; }
    ArrayList<String> types;
    @JsonProperty("evolvesTo")
    public ArrayList<String> getEvolvesTo() {
        return this.evolvesTo; }
    public void setEvolvesTo(ArrayList<String> evolvesTo) {
        this.evolvesTo = evolvesTo; }
    ArrayList<String> evolvesTo;
    @JsonProperty("attacks")
    public ArrayList<Attack> getAttacks() {
        return this.attacks; }
    public void setAttacks(ArrayList<Attack> attacks) {
        this.attacks = attacks; }
    ArrayList<Attack> attacks;
    @JsonProperty("weaknesses")
    public ArrayList<Weakness> getWeaknesses() {
        return this.weaknesses; }
    public void setWeaknesses(ArrayList<Weakness> weaknesses) {
        this.weaknesses = weaknesses; }
    ArrayList<Weakness> weaknesses;
    @JsonProperty("retreatCost")
    public ArrayList<String> getRetreatCost() {
        return this.retreatCost; }
    public void setRetreatCost(ArrayList<String> retreatCost) {
        this.retreatCost = retreatCost; }
    ArrayList<String> retreatCost;
    @JsonProperty("convertedRetreatCost")
    public int getConvertedRetreatCost() {
        return this.convertedRetreatCost; }
    public void setConvertedRetreatCost(int convertedRetreatCost) {
        this.convertedRetreatCost = convertedRetreatCost; }
    int convertedRetreatCost;
    @JsonProperty("set")
    public Set getSet() {
        return this.set; }
    public void setSet(Set set) {
        this.set = set; }
    Set set;
    @JsonProperty("number")
    public String getNumber() {
        return this.number; }
    public void setNumber(String number) {
        this.number = number; }
    String number;
    @JsonProperty("artist")
    public String getArtist() {
        return this.artist; }
    public void setArtist(String artist) {
        this.artist = artist; }
    String artist;
    @JsonProperty("rarity")
    public String getRarity() {
        return this.rarity; }
    public void setRarity(String rarity) {
        this.rarity = rarity; }
    String rarity;
    @JsonProperty("flavorText")
    public String getFlavorText() {
        return this.flavorText; }
    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText; }
    String flavorText;
    @JsonProperty("nationalPokedexNumbers")
    public ArrayList<Integer> getNationalPokedexNumbers() {
        return this.nationalPokedexNumbers; }
    public void setNationalPokedexNumbers(ArrayList<Integer> nationalPokedexNumbers) {
        this.nationalPokedexNumbers = nationalPokedexNumbers; }
    ArrayList<Integer> nationalPokedexNumbers;
    @JsonProperty("legalities")
    public Legalities getLegalities() {
        return this.legalities; }
    public void setLegalities(Legalities legalities) {
        this.legalities = legalities; }
    Legalities legalities;
    @JsonProperty("images")
    public Images getImages() {
        return this.images; }
    public void setImages(Images images) {
        this.images = images; }
    Images images;
    @JsonProperty("tcgplayer")
    public Tcgplayer getTcgplayer() {
        return this.tcgplayer; }
    public void setTcgplayer(Tcgplayer tcgplayer) {
        this.tcgplayer = tcgplayer; }
    Tcgplayer tcgplayer;
    @JsonProperty("cardmarket")
    public Cardmarket getCardmarket() {
        return this.cardmarket; }
    public void setCardmarket(Cardmarket cardmarket) {
        this.cardmarket = cardmarket; }
    Cardmarket cardmarket;
    @JsonProperty("regulationMark")
    public String getRegulationMark() {
        return this.regulationMark; }
    public void setRegulationMark(String regulationMark) {
        this.regulationMark = regulationMark; }
    String regulationMark;
    @JsonProperty("level")
    public String getLevel() {
        return this.level; }
    public void setLevel(String level) {
        this.level = level; }
    String level;
    @JsonProperty("abilities")
    public ArrayList<Ability> getAbilities() {
        return this.abilities; }
    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities; }
    ArrayList<Ability> abilities;


    @Override
    public String toString() {
        return "Datum{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", supertype='" + supertype + '\'' +
                ", subtypes=" + subtypes +
                ", hp='" + hp + '\'' +
                ", types=" + types +
                ", evolvesTo=" + evolvesTo +
                ", attacks=" + attacks +
                ", weaknesses=" + weaknesses +
                ", retreatCost=" + retreatCost +
                ", convertedRetreatCost=" + convertedRetreatCost +
                ", set=" + set +
                ", number='" + number + '\'' +
                ", artist='" + artist + '\'' +
                ", rarity='" + rarity + '\'' +
                ", flavorText='" + flavorText + '\'' +
                ", nationalPokedexNumbers=" + nationalPokedexNumbers +
                ", legalities=" + legalities +
                ", images=" + images +
                ", tcgplayer=" + tcgplayer +
                ", cardmarket=" + cardmarket +
                ", regulationMark='" + regulationMark + '\'' +
                ", level='" + level + '\'' +
                ", abilities=" + abilities +
                '}';
    }
}
