package com.mirana.soc.persistence.impl;

import com.mirana.soc.persistence.GenericDao;
import com.mirana.soc.persistence.GenericService;

import java.util.Optional;

public abstract class GenericServiceImpl<T, ID> implements GenericService<T, ID> {

    protected abstract GenericDao<T, ID> dao();

    @Override
    public <S extends T> S save(S s) {
        return this.dao().save(s);
    }

    @Override
    public <S extends T> Iterable<S> saveAll(Iterable<S> iterable) {
        return this.dao().saveAll(iterable);
    }

    @Override
    public Optional<T> findById(ID id) {
        return this.dao().findById(id);
    }

    @Override
    public boolean existsById(ID id) {
        return this.dao().existsById(id);
    }

    @Override
    public Iterable<T> findAll() {
        return this.dao().findAll();
    }

    @Override
    public Iterable<T> findAllById(Iterable<ID> iterable) {
        return this.dao().findAllById(iterable);
    }

    @Override
    public long count() {
        return this.dao().count();
    }

    @Override
    public void deleteById(ID id) {
        this.dao().deleteById(id);
    }

    @Override
    public void delete(T t) {
        this.dao().delete(t);
    }

    @Override
    public void deleteAll(Iterable<? extends T> iterable) {
        this.dao().deleteAll(iterable);
    }

    @Override
    public void deleteAll() {
        this.dao().deleteAll();
    }
}
