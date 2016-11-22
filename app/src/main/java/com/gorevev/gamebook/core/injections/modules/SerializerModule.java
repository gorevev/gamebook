package com.gorevev.gamebook.core.injections.modules;

import com.gorevev.gamebook.core.repository.GsonSerializer;
import com.gorevev.gamebook.core.repository.ISerializer;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ginko on 18.11.2016.
 */

@Module
public class SerializerModule {

    @Provides
    @Singleton
    public ISerializer providesSerializer() {
        return new GsonSerializer();
    }
}
