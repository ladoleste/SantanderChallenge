package br.com.santander.santanderchallenge.features.investment.model;

import com.google.gson.annotations.SerializedName;

public class ScreenResponse {

    @SerializedName("screen")
    private Screen screen;

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return
                "ScreenResponse{" +
                        "screen = '" + screen + '\'' +
                        "}";
    }
}