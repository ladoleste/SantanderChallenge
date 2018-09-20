package br.com.santander.santanderchallenge.features.contact.interactor;

import java.util.List;

import br.com.santander.santanderchallenge.features.contact.model.CellsItem;
import br.com.santander.santanderchallenge.features.contact.presentation.ContactView;
import br.com.santander.santanderchallenge.features.contact.presenter.ContactPresenter;
import br.com.santander.santanderchallenge.features.contact.presenter.ContactPresenterImpl;
import br.com.santander.santanderchallenge.features.contact.repository.CellsCallback;
import br.com.santander.santanderchallenge.features.contact.repository.ContactsRepository;

public class ContactInteractorImpl implements ContactInteractor {

    private ContactPresenter presenter;

    public ContactInteractorImpl(ContactView view) {
        presenter = new ContactPresenterImpl(view);
    }

    @Override
    public void fetchCells() {
        new ContactsRepository().fetchCells(new CellsCallback() {
            @Override
            public void onSuccess(List<CellsItem> cells) {
                presenter.onSuccess(cells);
            }

            @Override
            public void onError(String msg) {
                presenter.onError(msg);
            }
        });
    }
}