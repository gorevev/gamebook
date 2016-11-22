package com.gorevev.gamebook.core.repository;

/**
 * Created by Ginko on 17.11.2016.
 */

public interface IRepository {

    void put(Object object, String key) throws RepositoryException;

    Object get(String key, Class cls);
}
