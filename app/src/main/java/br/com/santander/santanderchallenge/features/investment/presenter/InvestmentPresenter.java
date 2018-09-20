package br.com.santander.santanderchallenge.features.investment.presenter;


import br.com.santander.santanderchallenge.features.investment.model.ScreenResponse;

public interface InvestmentPresenter {
    void onSuccess(ScreenResponse response);

    void onError(String msg);
}
