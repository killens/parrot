package com.fallen.parrot.mybatis.impl;

public interface BaseServiceI<T> {
    public T insert(T entity);
    public T findById(Long id);
}
