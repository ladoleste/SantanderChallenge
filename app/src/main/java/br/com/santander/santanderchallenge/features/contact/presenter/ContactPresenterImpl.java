package br.com.santander.santanderchallenge.features.contact.presenter;

import java.util.List;

import br.com.santander.santanderchallenge.features.contact.model.CellsItem;
import br.com.santander.santanderchallenge.features.contact.presentation.ContactView;

public class ContactPresenterImpl implements ContactPresenter {

    private ContactView view;

    public ContactPresenterImpl(ContactView view) {
        this.view = view;
    }

    @Override
    public void onSuccess(List<CellsItem> cells) {
        view.onCellsReady(cells);
    }

    @Override
    public void onError(String msg) {
        view.onCellsError(msg);
    }
}
