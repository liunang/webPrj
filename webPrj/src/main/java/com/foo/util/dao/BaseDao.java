package com.foo.util.dao;

import java.util.List;

public interface BaseDao<Entity, PK> {
    /**
     * 增加
     *
     * @param entity
     */
    public void save(Entity entity);

    /**
     * 修改
     *
     * @param entity
     */
    public void update(Entity entity);

    /**
     * 删除
     *
     * @param entity
     */
    public void delete(Entity entity);

    /**
     * 通过主键删除
     *
     * @param pk
     * @param pkName
     */
    public void deleteByPK(final PK pk, final String pkName);

    /**
     * 通过主键查询
     *
     * @param pk
     * @return
     */
    public Entity get(PK pk);

    /**
     * 通过主键查询，延迟加载
     *
     * @param pk
     * @return
     */
    public Entity load(PK pk);

    /**
     * 查询全部
     *
     * @return
     */
    public List<Entity> findAll();
}
