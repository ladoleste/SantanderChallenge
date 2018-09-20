package br.com.santander.santanderchallenge.features.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import br.com.santander.santanderchallenge.R;
import br.com.santander.santanderchallenge.features.contact.presentation.ContactFragment;
import br.com.santander.santanderchallenge.features.investment.presentation.InvestmentFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(new ContactFragment(), "a").commit();
        getSupportFragmentManager().beginTransaction().add(new InvestmentFragment(), "b").commit();
    }
}
