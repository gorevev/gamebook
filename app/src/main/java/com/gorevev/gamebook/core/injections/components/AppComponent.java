package com.gorevev.gamebook.core.injections.components;

import com.gorevev.gamebook.context.presentation.injections.components.MenuComponent;
import com.gorevev.gamebook.context.presentation.injections.modules.MenuModule;
import com.gorevev.gamebook.core.injections.modules.AppModule;
import com.gorevev.gamebook.core.injections.modules.RepositoryModule;
import com.gorevev.gamebook.core.injections.modules.SerializerModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Ginko on 17.11.2016.
 */

@Singleton
@Component(modules = {AppModule.class, RepositoryModule.class, SerializerModule.class})
public interface AppComponent {

    MenuComponent plus(MenuModule menuModule);
}
