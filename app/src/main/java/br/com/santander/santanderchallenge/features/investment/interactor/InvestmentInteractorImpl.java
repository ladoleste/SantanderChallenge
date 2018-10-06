package br.com.santander.santanderchallenge.features.investment.interactor;

import br.com.santander.santanderchallenge.features.investment.model.ScreenResponse;
import br.com.santander.santanderchallenge.features.investment.presenter.InvestmentPresenter;
import br.com.santander.santanderchallenge.features.investment.repository.InvestmentRepository;
import br.com.santander.santanderchallenge.features.investment.repository.ScreenCallback;

public class InvestmentInteractorImpl implements InvestmentInteractor {

    private final InvestmentPresenter presenter;
    private final InvestmentRepository investmentRepository;

    public InvestmentInteractorImpl(InvestmentPresenter presenter) {
        this.presenter = presenter;
        investmentRepository = new InvestmentRepository();
    }

    @Override
    public void fetchScreen() {
        investmentRepository.fetchScreen(new ScreenCallback() {
            @Override
            public void onSuccess(ScreenResponse response) {
                presenter.onSuccess(response);
            }

            @Override
            public void onError(String msg) {
                presenter.onError(msg);
            }
        });
    }
}