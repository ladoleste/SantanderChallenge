package br.com.santander.santanderchallenge.features.contact.presenter;

import java.util.List;

import br.com.santander.santanderchallenge.features.contact.model.CellsItem;

public interface ContactPresenter {
    void onSuccess(List<CellsItem> cells);

    void onError(String msg);
}
