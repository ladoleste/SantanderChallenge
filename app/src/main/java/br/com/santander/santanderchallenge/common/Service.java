package br.com.santander.santanderchallenge.common;

import br.com.santander.santanderchallenge.features.contact.model.CellsResponse;
import br.com.santander.santanderchallenge.features.investment.model.ScreenResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("cells.json")
    Call<CellsResponse> fetchCells();

    @GET("fund.json")
    Call<ScreenResponse> fetchScreen();
}
