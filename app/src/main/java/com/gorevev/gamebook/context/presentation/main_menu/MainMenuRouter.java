package com.gorevev.gamebook.context.presentation.main_menu;

/**
 * Created by Ginko on 17.11.2016.
 */

public interface MainMenuRouter {

    void newGame();

    void loadGame();

    void showRules();

    void showSettings();

    void showAuthors();

    void exit();
}
