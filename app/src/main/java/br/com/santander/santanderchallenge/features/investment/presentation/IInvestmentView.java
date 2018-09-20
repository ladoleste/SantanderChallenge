package br.com.santander.santanderchallenge.features.investment.presentation;


import br.com.santander.santanderchallenge.features.investment.model.ScreenResponse;

public interface IInvestmentView {
    void onScreenReady(ScreenResponse cellsItems);

    void onScreenError(String msg);
}
