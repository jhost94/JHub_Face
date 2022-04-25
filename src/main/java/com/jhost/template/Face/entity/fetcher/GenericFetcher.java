package com.jhost.template.Face.entity.fetcher;

import com.jhost.template.Face.service.internal.Fetcher;

import java.util.List;

public abstract class GenericFetcher<T, ID> {

    private final Fetcher<T, ID> fetcher;
    private final String pathUrl;

    public GenericFetcher(Fetcher<T, ID> fetcher, String pathUrl) {
        this.fetcher = fetcher;
        this.pathUrl = pathUrl;
    }

    public List<T> fetchAll() {
        return fetcher.fetchAll();
    }

    public T fetchById(ID id) {
        return fetcher.fetchById(id);
    }

    public T save(T entity) {
        return fetcher.save(entity);
    }

    public ID delete(T entity) {
        return fetcher.delete(entity);
    }
}
