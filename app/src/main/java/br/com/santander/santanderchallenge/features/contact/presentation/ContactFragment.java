package br.com.santander.santanderchallenge.features.contact.presentation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.com.santander.santanderchallenge.features.contact.interactor.ContactInteractor;
import br.com.santander.santanderchallenge.features.contact.interactor.ContactInteractorImpl;
import br.com.santander.santanderchallenge.features.contact.model.CellsItem;
import br.com.santander.santanderchallenge.features.contact.presenter.ContactPresenter;
import br.com.santander.santanderchallenge.features.contact.presenter.ContactPresenterImpl;
import br.com.santander.santanderchallenge.util.Logger;

public class ContactFragment extends Fragment implements ContactView {

    ContactPresenter presenter;
    ContactInteractor interactor;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        presenter = new ContactPresenterImpl(this);
        interactor = new ContactInteractorImpl(presenter);
        interactor.fetchCells();

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onCellsReady(List<CellsItem> cellsItems) {
        for (CellsItem cellsItem : cellsItems) {
            Logger.d(cellsItem.getMessage());
        }
    }

    @Override
    public void onCellsError(String msg) {
        Logger.e(msg);
    }
}
