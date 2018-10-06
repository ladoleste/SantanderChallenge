package br.com.santander.santanderchallenge.features.investment.presentation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import br.com.santander.santanderchallenge.features.investment.interactor.InvestmentInteractor;
import br.com.santander.santanderchallenge.features.investment.interactor.InvestmentInteractorImpl;
import br.com.santander.santanderchallenge.features.investment.model.ScreenResponse;
import br.com.santander.santanderchallenge.features.investment.presenter.InvestmentPresenterImpl;
import br.com.santander.santanderchallenge.util.Logger;

public class InvestmentFragment extends Fragment implements InvestmentView {

    private final InvestmentInteractor interactor = new InvestmentInteractorImpl(new InvestmentPresenterImpl(this));

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        interactor.fetchScreen();
        return view;
    }

    @Override
    public void onScreenReady(ScreenResponse response) {
        Logger.d(response.getScreen().getFundName());
        Toast toast = Toast.makeText(requireContext(), response.getScreen().getFundName(), Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    @Override
    public void onScreenError(String msg) {
        Logger.e(msg);
        Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
