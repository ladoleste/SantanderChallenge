package br.com.santander.santanderchallenge.features.investment.model;

import com.google.gson.annotations.SerializedName;

public class InfoItem {

    @SerializedName("data")
    private String data;

    @SerializedName("name")
    private String name;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "InfoItem{" +
                        "data = '" + data + '\'' +
                        ",name = '" + name + '\'' +
                        "}";
    }
}