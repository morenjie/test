package com.qf.dao;

import com.qf.entity.TbContentCategory;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 内容分类(TbContentCategory)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-05 21:40:43
 */
public interface TbContentCategoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbContentCategory queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbContentCategory> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbContentCategory 实例对象
     * @return 对象列表
     */
    List<TbContentCategory> queryAll(TbContentCategory tbContentCategory);

    /**
     * 新增数据
     *
     * @param tbContentCategory 实例对象
     * @return 影响行数
     */
    int insert(TbContentCategory tbContentCategory);

    /**
     * 修改数据
     *
     * @param tbContentCategory 实例对象
     * @return 影响行数
     */
    int update(TbContentCategory tbContentCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}