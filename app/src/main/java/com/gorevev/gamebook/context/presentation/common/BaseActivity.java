package com.gorevev.gamebook.context.presentation.common;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.lang.annotation.Annotation;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity {

    protected Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Class cls = getClass();
        if (!cls.isAnnotationPresent(Layout.class))
            return;

        Annotation annotation = cls.getAnnotation(Layout.class);
        Layout layout = (Layout) annotation;
        setContentView(layout.id());

        unbinder = ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
