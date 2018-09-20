package br.com.santander.santanderchallenge.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.santander.santanderchallenge.BuildConfig;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceImpl {
    private static Retrofit retrofit;

    private static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            Gson gson = new GsonBuilder().create();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BuildConfig.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }

    public static Service getInstance() {
        return ServiceImpl.getRetrofitInstance().create(Service.class);
    }
}
