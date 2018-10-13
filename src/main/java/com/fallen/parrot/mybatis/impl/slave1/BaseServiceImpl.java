package com.fallen.parrot.mybatis.impl.slave1;

import com.fallen.parrot.annotation.DataSource;
import com.fallen.parrot.config.DataSourceContextHolder;
import com.fallen.parrot.mybatis.impl.BaseServiceI;
import com.fallen.parrot.mybatis.mapper.BaseMapper;

import javax.annotation.Resource;

/**
 * 基础服务处理类
 * @param <T> entity
 * @param <M> mapper
 */
public abstract class BaseServiceImpl<T, M extends BaseMapper> implements BaseServiceI<T> {

    private M mapper;

    @Resource
    public void setMapper(M mapper) {
        this.mapper = mapper;
    }

    public M getMapper() {
        return mapper;
    }

    @Override
    public T insert(T entity) {
        mapper.insert(entity);
        return entity;
    }

    @DataSource(DataSourceContextHolder.Slaver1)
    @Override
    public T findById(Long id) {
        T object = (T) mapper.findById(id);
        if (object != null) {
            return object;
        }
        return null;
    }
}
