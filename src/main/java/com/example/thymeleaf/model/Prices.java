package com.example.thymeleaf.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Prices{
    @JsonProperty("holofoil")
    public Holofoil getHolofoil() {
        return this.holofoil; }
    public void setHolofoil(Holofoil holofoil) {
        this.holofoil = holofoil; }
    Holofoil holofoil;
    @JsonProperty("reverseHolofoil")
    public ReverseHolofoil getReverseHolofoil() {
        return this.reverseHolofoil; }
    public void setReverseHolofoil(ReverseHolofoil reverseHolofoil) {
        this.reverseHolofoil = reverseHolofoil; }
    ReverseHolofoil reverseHolofoil;
    @JsonProperty("normal")
    public Normal getNormal() {
        return this.normal; }
    public void setNormal(Normal normal) {
        this.normal = normal; }
    Normal normal;
    @JsonProperty("1stEdition")
    public _1stEdition get_1stEdition() {
        return this._1stEdition; }
    public void set_1stEdition(_1stEdition _1stEdition) {
        this._1stEdition = _1stEdition; }
    _1stEdition _1stEdition;
    @JsonProperty("unlimited")
    public Unlimited getUnlimited() {
        return this.unlimited; }
    public void setUnlimited(Unlimited unlimited) {
        this.unlimited = unlimited; }
    Unlimited unlimited;
    @JsonProperty("averageSellPrice")
    public double getAverageSellPrice() {
        return this.averageSellPrice; }
    public void setAverageSellPrice(double averageSellPrice) {
        this.averageSellPrice = averageSellPrice; }
    double averageSellPrice;
    @JsonProperty("lowPrice")
    public double getLowPrice() {
        return this.lowPrice; }
    public void setLowPrice(double lowPrice) {
        this.lowPrice = lowPrice; }
    double lowPrice;
    @JsonProperty("trendPrice")
    public double getTrendPrice() {
        return this.trendPrice; }
    public void setTrendPrice(double trendPrice) {
        this.trendPrice = trendPrice; }
    double trendPrice;
    @JsonProperty("germanProLow")
    public double getGermanProLow() {
        return this.germanProLow; }
    public void setGermanProLow(double germanProLow) {
        this.germanProLow = germanProLow; }
    double germanProLow;
    @JsonProperty("suggestedPrice")
    public double getSuggestedPrice() {
        return this.suggestedPrice; }
    public void setSuggestedPrice(double suggestedPrice) {
        this.suggestedPrice = suggestedPrice; }
    double suggestedPrice;
    @JsonProperty("reverseHoloSell")
    public double getReverseHoloSell() {
        return this.reverseHoloSell; }
    public void setReverseHoloSell(double reverseHoloSell) {
        this.reverseHoloSell = reverseHoloSell; }
    double reverseHoloSell;
    @JsonProperty("reverseHoloLow")
    public double getReverseHoloLow() {
        return this.reverseHoloLow; }
    public void setReverseHoloLow(double reverseHoloLow) {
        this.reverseHoloLow = reverseHoloLow; }
    double reverseHoloLow;
    @JsonProperty("reverseHoloTrend")
    public double getReverseHoloTrend() {
        return this.reverseHoloTrend; }
    public void setReverseHoloTrend(double reverseHoloTrend) {
        this.reverseHoloTrend = reverseHoloTrend; }
    double reverseHoloTrend;
    @JsonProperty("lowPriceExPlus")
    public double getLowPriceExPlus() {
        return this.lowPriceExPlus; }
    public void setLowPriceExPlus(double lowPriceExPlus) {
        this.lowPriceExPlus = lowPriceExPlus; }
    double lowPriceExPlus;
    @JsonProperty("avg1")
    public double getAvg1() {
        return this.avg1; }
    public void setAvg1(double avg1) {
        this.avg1 = avg1; }
    double avg1;
    @JsonProperty("avg7")
    public double getAvg7() {
        return this.avg7; }
    public void setAvg7(double avg7) {
        this.avg7 = avg7; }
    double avg7;
    @JsonProperty("avg30")
    public double getAvg30() {
        return this.avg30; }
    public void setAvg30(double avg30) {
        this.avg30 = avg30; }
    double avg30;
    @JsonProperty("reverseHoloAvg1")
    public double getReverseHoloAvg1() {
        return this.reverseHoloAvg1; }
    public void setReverseHoloAvg1(double reverseHoloAvg1) {
        this.reverseHoloAvg1 = reverseHoloAvg1; }
    double reverseHoloAvg1;
    @JsonProperty("reverseHoloAvg7")
    public double getReverseHoloAvg7() {
        return this.reverseHoloAvg7; }
    public void setReverseHoloAvg7(double reverseHoloAvg7) {
        this.reverseHoloAvg7 = reverseHoloAvg7; }
    double reverseHoloAvg7;
    @JsonProperty("reverseHoloAvg30")
    public double getReverseHoloAvg30() {
        return this.reverseHoloAvg30; }
    public void setReverseHoloAvg30(double reverseHoloAvg30) {
        this.reverseHoloAvg30 = reverseHoloAvg30; }
    double reverseHoloAvg30;

    @Override
    public String toString() {
        return "Prices{" +
                "holofoil=" + holofoil +
                ", reverseHolofoil=" + reverseHolofoil +
                ", normal=" + normal +
                ", _1stEdition=" + _1stEdition +
                ", unlimited=" + unlimited +
                ", averageSellPrice=" + averageSellPrice +
                ", lowPrice=" + lowPrice +
                ", trendPrice=" + trendPrice +
                ", germanProLow=" + germanProLow +
                ", suggestedPrice=" + suggestedPrice +
                ", reverseHoloSell=" + reverseHoloSell +
                ", reverseHoloLow=" + reverseHoloLow +
                ", reverseHoloTrend=" + reverseHoloTrend +
                ", lowPriceExPlus=" + lowPriceExPlus +
                ", avg1=" + avg1 +
                ", avg7=" + avg7 +
                ", avg30=" + avg30 +
                ", reverseHoloAvg1=" + reverseHoloAvg1 +
                ", reverseHoloAvg7=" + reverseHoloAvg7 +
                ", reverseHoloAvg30=" + reverseHoloAvg30 +
                '}';
    }
}