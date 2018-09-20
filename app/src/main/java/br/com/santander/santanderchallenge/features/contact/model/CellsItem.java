package br.com.santander.santanderchallenge.features.contact.model;

import com.google.gson.annotations.SerializedName;

public class CellsItem {

    @SerializedName("typefield")
    private Object typefield;

    @SerializedName("hidden")
    private boolean hidden;

    @SerializedName("show")
    private Object show;

    @SerializedName("id")
    private int id;

    @SerializedName("type")
    private int type;

    @SerializedName("message")
    private String message;

    @SerializedName("topSpacing")
    private double topSpacing;

    @SerializedName("required")
    private boolean required;

    public Object getTypefield() {
        return typefield;
    }

    public void setTypefield(Object typefield) {
        this.typefield = typefield;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public Object getShow() {
        return show;
    }

    public void setShow(Object show) {
        this.show = show;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getTopSpacing() {
        return topSpacing;
    }

    public void setTopSpacing(double topSpacing) {
        this.topSpacing = topSpacing;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    @Override
    public String toString() {
        return
                "CellsItem{" +
                        "typefield = '" + typefield + '\'' +
                        ",hidden = '" + hidden + '\'' +
                        ",show = '" + show + '\'' +
                        ",id = '" + id + '\'' +
                        ",type = '" + type + '\'' +
                        ",message = '" + message + '\'' +
                        ",topSpacing = '" + topSpacing + '\'' +
                        ",required = '" + required + '\'' +
                        "}";
    }
}