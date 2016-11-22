package com.gorevev.gamebook.context.presentation.main_menu;

import android.os.Bundle;
import android.widget.Toast;

import com.gorevev.gamebook.R;
import com.gorevev.gamebook.context.presentation.common.BaseActivity;
import com.gorevev.gamebook.context.presentation.common.Layout;
import com.gorevev.gamebook.context.presentation.main_menu.menu.MenuFragment;

@Layout(id = R.layout.activity_base)
public class MainMenuActivity extends BaseActivity implements IMainMenuRouter {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getSupportFragmentManager().getBackStackEntryCount() == 0)
            addBackStack(new MenuFragment());
    }

    @Override
    protected void setupActivityComponent() {

    }

    @Override
    public void newGame() {
        Toast.makeText(this, "New game", Toast.LENGTH_LONG).show();
    }

    @Override
    public void loadGame() {
        Toast.makeText(this, "Load game", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showRules() {
        Toast.makeText(this, "Rules", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showSettings() {
        Toast.makeText(this, "Settings", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showAuthors() {
        Toast.makeText(this, "Authors", Toast.LENGTH_LONG).show();
    }

    @Override
    public void exit() {
        finish();
    }
}
