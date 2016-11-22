package com.gorevev.gamebook.context.presentation.main_menu.menu;

import com.gorevev.gamebook.context.presentation.common.BasePresenter;
import com.gorevev.gamebook.context.presentation.main_menu.IMainMenuRouter;

import javax.inject.Inject;

/**
 * Created by Ginko on 17.11.2016.
 */

public class MenuPresenter extends BasePresenter<IMenuView, IMainMenuRouter> implements IMenuPresenter {

    @Inject
    public MenuPresenter() { }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onNewGameClick() {
        getRouter().newGame();
    }

    @Override
    public void onLoadGameClick() {
        getRouter().loadGame();
    }

    @Override
    public void onRulesClick() {
        getRouter().showRules();
    }

    @Override
    public void onSettingsClick() {
        getRouter().showSettings();
    }

    @Override
    public void onAuthorsClick() {
        getRouter().showAuthors();
    }

    @Override
    public void onExitClick() {
        getRouter().exit();
    }
}
