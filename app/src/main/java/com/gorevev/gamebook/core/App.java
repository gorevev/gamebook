package com.gorevev.gamebook.core;

import android.app.Application;

import com.gorevev.gamebook.context.presentation.injections.components.MenuComponent;
import com.gorevev.gamebook.context.presentation.injections.modules.MenuModule;
import com.gorevev.gamebook.core.injections.components.AppComponent;
import com.gorevev.gamebook.core.injections.components.DaggerAppComponent;
import com.gorevev.gamebook.core.injections.modules.AppModule;

/**
 * Created by Ginko on 17.11.2016.
 */

public class App extends Application {

    private static App instance;

    private AppComponent appComponent;
    private MenuComponent menuComponent;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(instance))
                .build();
    }

    public MenuComponent getMenuComponent() {

        if (menuComponent == null)
            menuComponent = appComponent.plus(new MenuModule());

        return menuComponent;
    }

    public void releaseMenuComponent() {
        menuComponent = null;
    }
}
