package com.gorevev.gamebook.context.presentation.main_menu;

import android.app.Activity;
import android.os.Bundle;

import com.gorevev.gamebook.R;
import com.gorevev.gamebook.context.presentation.common.Layout;
import com.gorevev.gamebook.context.presentation.common.gui.TextViewAniron;

import butterknife.BindView;
import butterknife.ButterKnife;

@Layout(id = R.layout.main_menu)
public class MainMenuActivity extends Activity implements MainMenuRouter {
    @BindView(R.id.tvNewGame)
    public TextViewAniron tvNewGame;

    @BindView(R.id.tvLoad)
    public TextViewAniron tvLoad;

    @BindView(R.id.tvRules)
    public TextViewAniron tvRules;

    @BindView(R.id.tvSettings)
    public TextViewAniron tvSettings;

    @BindView(R.id.tvAuthors)
    public TextViewAniron tvAuthors;

    @BindView(R.id.tvExit)
    public TextViewAniron tvExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*ButterKnife.inject(this);

        tvNewGame.setOnClickListener(this);
        tvLoad.setOnClickListener(this);
        tvRules.setOnClickListener(this);
        tvSettings.setOnClickListener(this);
        tvAuthors.setOnClickListener(this);
        tvExit.setOnClickListener(this);*/
    }

    @Override
    public void newGame() {

    }

    @Override
    public void loadGame() {

    }

    @Override
    public void showRules() {

    }

    @Override
    public void showSettings() {

    }

    @Override
    public void showAuthors() {

    }

    @Override
    public void exit() {

    }
}
