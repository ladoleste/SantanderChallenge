package br.com.santander.santanderchallenge.features.investment.repository;

import br.com.santander.santanderchallenge.features.investment.model.ScreenResponse;

public interface ScreenCallback {
    void onSuccess(ScreenResponse cells);

    void onError(String msg);
}
