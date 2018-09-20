package br.com.santander.santanderchallenge.features.contact.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CellsResponse {

    @SerializedName("cells")
    private List<CellsItem> cells;

    public List<CellsItem> getCells() {
        return cells;
    }

    public void setCells(List<CellsItem> cells) {
        this.cells = cells;
    }

    @Override
    public String toString() {
        return
                "Response{" +
                        "cells = '" + cells + '\'' +
                        "}";
    }
}