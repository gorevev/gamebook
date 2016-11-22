package com.gorevev.gamebook.core.repository;

import android.support.annotation.NonNull;

/**
 * Created by Ginko on 17.11.2016.
 */

public interface ISerializer {

    String deserialize(@NonNull Object object);

    Object serialize(@NonNull String json, Class cls);
}
