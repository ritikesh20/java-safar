package com.example.weatherapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText etCity;
    Button btnGetWeather;
    TextView tvResult;

    String BASE_URL = "https://api.openweathermap.org/data/2.5/";
    String API_KEY = "d4f89a278f449917407116ed2c070315";  // yahan apni key dalna

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCity = findViewById(R.id.etCity);
        btnGetWeather = findViewById(R.id.btnGetWeather);
        tvResult = findViewById(R.id.tvResult);

        btnGetWeather.setOnClickListener(view -> {
            String city = etCity.getText().toString().trim();
            if (!city.isEmpty()) {
                getWeatherData(city);
            }
        });
    }

    private void getWeatherData(String city) {

        WeatherApi api = RetrofitClient.getClient(BASE_URL).create(WeatherApi.class);

        Call<WeatherResponse> call = api.getWeather(city, API_KEY, "metric");

        call.enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    WeatherResponse data = response.body();
                    String info = "City: " + data.getName() +
                            "\nTemp: " + data.getMain().getTemp() + "°C" +
                            "\nHumidity: " + data.getMain().getHumidity() + "%" +
                            "\nMinimum" + data.getMain().getTemp_min() +
                            "\nMix Temp" + data.getMain().getTemp_max() +
                            "\nWind Speed" + data.getWind().getSpeed();

                    tvResult.setText(info);
                } else {
                    tvResult.setText("City not found!");
                }
            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {
                tvResult.setText("Error: " + t.getMessage());
            }
        });

    }
}

