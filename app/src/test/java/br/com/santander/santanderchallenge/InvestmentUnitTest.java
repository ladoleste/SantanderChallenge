package br.com.santander.santanderchallenge;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import br.com.santander.santanderchallenge.features.investment.interactor.InvestmentInteractor;
import br.com.santander.santanderchallenge.features.investment.model.ScreenResponse;
import br.com.santander.santanderchallenge.features.investment.presenter.InvestmentPresenter;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class InvestmentUnitTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    @Mock
    InvestmentInteractor interactor;
    @Mock
    InvestmentPresenter presenter;

    @Test
    public void addition_isCorrect() {
        interactor.fetchScreen();
        verify(interactor).fetchScreen();
        verify(presenter).onSuccess(any(ScreenResponse.class));
    }
}