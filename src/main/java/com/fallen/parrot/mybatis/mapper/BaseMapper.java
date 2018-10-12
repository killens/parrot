package com.fallen.parrot.mybatis.mapper;

public interface BaseMapper<T> {
    void insert(T entity);
    T findById(Long id);
}
