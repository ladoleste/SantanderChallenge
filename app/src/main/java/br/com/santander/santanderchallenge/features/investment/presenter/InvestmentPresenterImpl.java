package br.com.santander.santanderchallenge.features.investment.presenter;

import br.com.santander.santanderchallenge.features.investment.model.ScreenResponse;
import br.com.santander.santanderchallenge.features.investment.presentation.IInvestmentView;

public class InvestmentPresenterImpl implements InvestmentPresenter {

    private IInvestmentView view;

    public InvestmentPresenterImpl(IInvestmentView view) {
        this.view = view;
    }

    @Override
    public void onSuccess(ScreenResponse response) {
        view.onScreenReady(response);
    }

    @Override
    public void onError(String msg) {
        view.onScreenError(msg);
    }
}
