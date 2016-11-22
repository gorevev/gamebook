package com.gorevev.gamebook.core.injections.modules;

import android.app.Application;
import android.content.Context;
import android.preference.PreferenceManager;

import com.gorevev.gamebook.core.repository.IRepository;
import com.gorevev.gamebook.core.repository.ISerializer;
import com.gorevev.gamebook.core.repository.SharedPreferencesRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ginko on 17.11.2016.
 */

@Module
public class RepositoryModule {

    @Provides
    @Singleton
    IRepository providesRepository(Context context, ISerializer serializer) {
        return new SharedPreferencesRepository(context, serializer);
    }
}
