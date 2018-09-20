package br.com.santander.santanderchallenge.features.investment.model;

import com.google.gson.annotations.SerializedName;

public class Month {

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
                "Month{" +
                        "fund = '" + fund + '\'' +
                        ",cDI = '" + cDI + '\'' +
                        "}";
    }
}