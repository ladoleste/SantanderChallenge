package br.com.santander.santanderchallenge.features.investment.model;

import com.google.gson.annotations.SerializedName;

public class Year {

    @SerializedName("fund")
    private double fund;

    @SerializedName("CDI")
    private double cDI;

    public double getFund() {
        return fund;
    }

    public void setFund(double fund) {
        this.fund = fund;
    }

    public double getCDI() {
        return cDI;
    }

    public void setCDI(double cDI) {
        this.cDI = cDI;
    }

    @Override
    public String toString() {
        return
                "Year{" +
                        "fund = '" + fund + '\'' +
                        ",cDI = '" + cDI + '\'' +
                        "}";
    }
}