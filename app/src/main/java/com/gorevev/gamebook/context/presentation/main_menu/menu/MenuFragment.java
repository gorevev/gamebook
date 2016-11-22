package com.gorevev.gamebook.context.presentation.main_menu.menu;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.gorevev.gamebook.R;
import com.gorevev.gamebook.context.presentation.common.BaseFragment;
import com.gorevev.gamebook.context.presentation.common.BasePresenter;
import com.gorevev.gamebook.context.presentation.common.Layout;
import com.gorevev.gamebook.context.presentation.main_menu.MainMenuActivity;
import com.gorevev.gamebook.core.App;

import javax.inject.Inject;

import butterknife.OnClick;

/**
 * Created by Ginko on 17.11.2016.
 */

@Layout(id = R.layout.fragment_menu)
public class MenuFragment extends BaseFragment implements IMenuView {

    @Inject
    MenuPresenter presenter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getPresenter().setRouter((MainMenuActivity) getActivity());
    }

    @NonNull
    @Override
    protected BasePresenter getPresenter() {
        return presenter;
    }

    @Override
    protected void inject() {
        App.getInstance().getMenuComponent().inject(this);
    }

    @OnClick(R.id.new_game)
    public void onNewGameClick() {
        presenter.onNewGameClick();
    }

    @OnClick(R.id.load_game)
    public void onLoadGameClick() {
        presenter.onLoadGameClick();
    }

    @OnClick(R.id.rules)
    public void onRulesClick() {
        presenter.onRulesClick();
    }

    @OnClick(R.id.settings)
    public void onSettingsClick() {
        presenter.onSettingsClick();
    }

    @OnClick(R.id.authors)
    public void onAuthorsClick() {
        presenter.onAuthorsClick();
    }

    @OnClick(R.id.exit)
    public void exit() {
        presenter.onExitClick();
    }
}
