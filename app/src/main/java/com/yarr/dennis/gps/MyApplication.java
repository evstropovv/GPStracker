package com.yarr.dennis.gps;

import android.app.Application;
//
//import com.yandex.metrica.YandexMetrica;
//import com.yandex.metrica.YandexMetricaConfig;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //tryToLog();
//        YandexMetricaConfig.Builder configBuilder = YandexMetricaConfig.newConfigBuilder("5d9b25fe-392c-4753-bdad-b9dac8b43712");
//        YandexMetrica.activate(getApplicationContext(), configBuilder.build());
//        // Отслеживание активности пользователей
//        YandexMetrica.enableActivityAutoTracking(this);

    }
}
