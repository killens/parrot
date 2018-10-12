package com.fallen.parrot.mybatis.impl;

/**
 * 基础服务接口
 * @param <T> entity
 */
public interface BaseServiceI<T> {
    public T insert(T entity);
    public T findById(Long id);
}
