package com.qf.controller;

import com.qf.entity.TbContentCategory;
import com.qf.service.TbContentCategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 内容分类(TbContentCategory)表控制层
 *
 * @author makejava
 * @since 2022-05-05 21:40:43
 */
@RestController
@RequestMapping("tbContentCategory")
public class TbContentCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private TbContentCategoryService tbContentCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbContentCategory selectOne(Long id) {
        return this.tbContentCategoryService.queryById(id);
    }

}