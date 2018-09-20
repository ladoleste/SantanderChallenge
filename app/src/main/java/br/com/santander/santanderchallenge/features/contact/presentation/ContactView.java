package br.com.santander.santanderchallenge.features.contact.presentation;

import java.util.List;

import br.com.santander.santanderchallenge.features.contact.model.CellsItem;

public interface ContactView {
    void onCellsReady(List<CellsItem> cellsItems);

    void onCellsError(String msg);
}
