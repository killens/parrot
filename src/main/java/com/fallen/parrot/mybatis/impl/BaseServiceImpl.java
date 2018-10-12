package com.fallen.parrot.mybatis.impl;

import com.fallen.parrot.mybatis.mapper.BaseMapper;

import javax.annotation.Resource;

public abstract class BaseServiceImpl<T, M extends BaseMapper> implements BaseServiceI<T> {

    private M mapper;

    @Resource
    public void setMapper(M mapper) {
        this.mapper = mapper;
    }

    @Override
    public T insert(T entity) {
        mapper.insert(entity);
        return entity;
    }

    @Override
    public T findById(Long id) {
        return (T) mapper.findById(id);
    }
}
