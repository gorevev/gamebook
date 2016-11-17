package com.gorevev.gamebook.context.presentation.common.gui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Gorev Evgenii on 25.05.2015.
 */
public class TextViewAniron extends TextView {

    public TextViewAniron(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TextViewAniron(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextViewAniron(Context context) {
        super(context);
        init();
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/aniron.ttf");
        setTypeface(tf ,1);

    }

}