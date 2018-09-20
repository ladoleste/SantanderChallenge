package br.com.santander.santanderchallenge.features.contact.repository;

import android.support.annotation.NonNull;

import java.io.IOException;

import br.com.santander.santanderchallenge.common.ServiceImpl;
import br.com.santander.santanderchallenge.features.contact.model.CellsResponse;
import br.com.santander.santanderchallenge.util.Logger;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ContactsRepository {

    public void fetchCells(final CellsCallback callback) {
        ServiceImpl.getInstance().fetchCells().enqueue(new Callback<CellsResponse>() {
            @Override
            public void onResponse(@NonNull Call<CellsResponse> call, @NonNull Response<CellsResponse> response) {
                if (response.isSuccessful()) {
                    CellsResponse cellsResponse = response.body();
                    callback.onSuccess(cellsResponse.getCells());
                } else {
                    try {
                        callback.onError(response.errorBody().string());
                    } catch (IOException e) {
                        Logger.e(e);
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<CellsResponse> call, @NonNull Throwable t) {
                Logger.e(t);
                callback.onError(t.getMessage());
            }
        });
    }

}
