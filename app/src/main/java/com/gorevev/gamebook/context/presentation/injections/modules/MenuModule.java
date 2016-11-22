package com.gorevev.gamebook.context.presentation.injections.modules;

import android.content.Context;

import com.gorevev.gamebook.context.presentation.injections.scopes.MenuScope;
import com.gorevev.gamebook.context.presentation.main_menu.menu.IMenuPresenter;
import com.gorevev.gamebook.context.presentation.main_menu.menu.IMenuView;
import com.gorevev.gamebook.context.presentation.main_menu.menu.MenuFragment;
import com.gorevev.gamebook.context.presentation.main_menu.menu.MenuPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ginko on 18.11.2016.
 */

@Module
public class MenuModule {

    IMenuPresenter menuPresenter;

    //вероятно не надо т.к. есть Inject в самом классе презентера
    @Provides
    @MenuScope
    public IMenuPresenter providesMenuPresenter() {
        return new MenuPresenter();
    }

    @Provides
    @MenuScope
    public IMenuView providesMenuView() {
        return new MenuFragment();
    }
}
