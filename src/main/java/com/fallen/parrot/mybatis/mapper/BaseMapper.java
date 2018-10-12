package com.fallen.parrot.mybatis.mapper;

/**
 * 基础mapper接口
 * @param <T> entity
 */
public interface BaseMapper<T> {
    void insert(T entity);
    T findById(Long id);
}
