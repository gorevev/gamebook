package com.gorevev.gamebook.core.repository;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.gorevev.gamebook.R;

/**
 * Created by Ginko on 17.11.2016.
 */

public class SharedPreferencesRepository implements IRepository {

    private Context context;
    private SharedPreferences sharedPreferences;
    private ISerializer serializer;

    public SharedPreferencesRepository(Context context, ISerializer serializer) {

        this.context = context;
        this.sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.serializer = serializer;
    }

    @Override
    public void put(Object object, String key) throws RepositoryException {
        if (!sharedPreferences.edit().putString(key, serializer.deserialize(object)).commit())
            throw new RepositoryException(context.getString(R.string.exception_repository_put));
    }

    @Override
    public Object get(String key, Class cls) {

        String json = sharedPreferences.getString(key, null);

        if (json == null)
            return null;

        return serializer.serialize(json, cls);
    }
}
