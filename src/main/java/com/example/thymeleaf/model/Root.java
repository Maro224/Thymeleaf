package com.example.thymeleaf.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Root{
    @JsonProperty("data")
    public ArrayList<Datum> getData() {
        return this.data; }
    public void setData(ArrayList<Datum> data) {
        this.data = data; }
    ArrayList<Datum> data;
    @JsonProperty("page")
    public int getPage() {
        return this.page; }
    public void setPage(int page) {
        this.page = page; }
    int page;
    @JsonProperty("pageSize")
    public int getPageSize() {
        return this.pageSize; }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize; }
    int pageSize;
    @JsonProperty("count")
    public int getCount() {
        return this.count; }
    public void setCount(int count) {
        this.count = count; }
    int count;

    @Override
    public String toString() {
        return "Root{" +
                "data=" + data +
                ", page=" + page +
                ", pageSize=" + pageSize +
                ", count=" + count +
                ", totalCount=" + totalCount +
                '}';
    }

    @JsonProperty("totalCount")
    public int getTotalCount() {
        return this.totalCount; }
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount; }
    int totalCount;
}
