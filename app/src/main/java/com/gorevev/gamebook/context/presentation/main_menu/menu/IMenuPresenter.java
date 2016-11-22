package com.gorevev.gamebook.context.presentation.main_menu.menu;

import com.gorevev.gamebook.context.presentation.common.BasePresenter;

/**
 * Created by Ginko on 17.11.2016.
 */

public interface IMenuPresenter  {

    void onNewGameClick();

    void onLoadGameClick();

    void onRulesClick();

    void onSettingsClick();

    void onAuthorsClick();

    void onExitClick();
}
