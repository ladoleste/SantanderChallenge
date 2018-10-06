package br.com.santander.santanderchallenge.features.investment.model;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class DownInfoItem {

    @SerializedName("data")
    private Object data;

    @SerializedName("name")
    private String name;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return
                "DownInfoItem{" +
                        "data = '" + data + '\'' +
                        ",name = '" + name + '\'' +
                        "}";
    }
}