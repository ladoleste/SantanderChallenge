package br.com.santander.santanderchallenge.features.contact.repository;

import java.util.List;

import br.com.santander.santanderchallenge.features.contact.model.CellsItem;

public interface CellsCallback {
    void onSuccess(List<CellsItem> cells);

    void onError(String msg);
}
