package br.com.santander.santanderchallenge.features.investment.repository;

import android.support.annotation.NonNull;

import java.io.IOException;

import br.com.santander.santanderchallenge.common.ServiceImpl;
import br.com.santander.santanderchallenge.features.investment.model.ScreenResponse;
import br.com.santander.santanderchallenge.util.Logger;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InvestmentRepository {

    public void fetchScreen(final ScreenCallback callback) {
        ServiceImpl.getInstance().fetchScreen().enqueue(new Callback<ScreenResponse>() {
            @Override
            public void onResponse(@NonNull Call<ScreenResponse> call, @NonNull Response<ScreenResponse> response) {
                if (response.isSuccessful()) {
                    ScreenResponse cellsResponse = response.body();
                    callback.onSuccess(cellsResponse);
                } else {
                    try {
                        callback.onError(response.errorBody().string());
                    } catch (IOException e) {
                        Logger.e(e);
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<ScreenResponse> call, @NonNull Throwable t) {
                Logger.e(t);
                callback.onError(t.getMessage());
            }
        });
    }
}
