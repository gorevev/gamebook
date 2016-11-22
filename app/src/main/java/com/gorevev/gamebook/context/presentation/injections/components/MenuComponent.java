package com.gorevev.gamebook.context.presentation.injections.components;

import com.gorevev.gamebook.context.presentation.injections.modules.MenuModule;
import com.gorevev.gamebook.context.presentation.injections.scopes.MenuScope;
import com.gorevev.gamebook.context.presentation.main_menu.menu.MenuFragment;

import dagger.Subcomponent;

/**
 * Created by Ginko on 17.11.2016.
 */

@MenuScope
@Subcomponent(modules = MenuModule.class)
public interface MenuComponent {

    void inject(MenuFragment menuFragment);
}
