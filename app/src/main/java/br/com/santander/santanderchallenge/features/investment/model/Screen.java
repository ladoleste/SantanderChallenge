package br.com.santander.santanderchallenge.features.investment.model;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Screen {

    @SerializedName("riskTitle")
    private String riskTitle;

    @SerializedName("infoTitle")
    private String infoTitle;

    @SerializedName("whatIs")
    private String whatIs;

    @SerializedName("definition")
    private String definition;

    @SerializedName("risk")
    private int risk;

    @SerializedName("downInfo")
    private List<DownInfoItem> downInfo;

    @SerializedName("title")
    private String title;

    @SerializedName("fundName")
    private String fundName;

    @SerializedName("moreInfo")
    private MoreInfo moreInfo;

    @SerializedName("info")
    private List<InfoItem> info;

    public String getRiskTitle() {
        return riskTitle;
    }

    public void setRiskTitle(String riskTitle) {
        this.riskTitle = riskTitle;
    }

    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }

    public String getWhatIs() {
        return whatIs;
    }

    public void setWhatIs(String whatIs) {
        this.whatIs = whatIs;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public List<DownInfoItem> getDownInfo() {
        return downInfo;
    }

    public void setDownInfo(List<DownInfoItem> downInfo) {
        this.downInfo = downInfo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public MoreInfo getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(MoreInfo moreInfo) {
        this.moreInfo = moreInfo;
    }

    public List<InfoItem> getInfo() {
        return info;
    }

    public void setInfo(List<InfoItem> info) {
        this.info = info;
    }

    @NonNull
    @Override
    public String toString() {
        return
                "Screen{" +
                        "riskTitle = '" + riskTitle + '\'' +
                        ",infoTitle = '" + infoTitle + '\'' +
                        ",whatIs = '" + whatIs + '\'' +
                        ",definition = '" + definition + '\'' +
                        ",risk = '" + risk + '\'' +
                        ",downInfo = '" + downInfo + '\'' +
                        ",title = '" + title + '\'' +
                        ",fundName = '" + fundName + '\'' +
                        ",moreInfo = '" + moreInfo + '\'' +
                        ",info = '" + info + '\'' +
                        "}";
    }
}