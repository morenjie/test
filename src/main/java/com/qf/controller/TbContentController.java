package com.qf.controller;

import com.qf.entity.TbContent;
import com.qf.service.TbContentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbContent)表控制层
 *
 * @author makejava
 * @since 2022-05-05 21:40:43
 */
@RestController
@RequestMapping("tbContent")
public class TbContentController {
    /**
     * 服务对象
     */
    @Resource
    private TbContentService tbContentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbContent selectOne(Long id) {
        return this.tbContentService.queryById(id);
    }

}