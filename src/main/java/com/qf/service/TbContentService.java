package com.qf.service;

import com.qf.entity.TbContent;
import java.util.List;

/**
 * (TbContent)表服务接口
 *
 * @author makejava
 * @since 2022-05-05 21:40:41
 */
public interface TbContentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbContent queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbContent> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbContent 实例对象
     * @return 实例对象
     */
    TbContent insert(TbContent tbContent);

    /**
     * 修改数据
     *
     * @param tbContent 实例对象
     * @return 实例对象
     */
    TbContent update(TbContent tbContent);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}