package com.qf.controller;

import com.qf.entity.TbItemCat;
import com.qf.service.TbItemCatService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品类目(TbItemCat)表控制层
 *
 * @author makejava
 * @since 2022-05-05 21:40:45
 */
@RestController
@RequestMapping("tbItemCat")
public class TbItemCatController {
    /**
     * 服务对象
     */
    @Resource
    private TbItemCatService tbItemCatService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbItemCat selectOne(Long id) {
        return this.tbItemCatService.queryById(id);
    }

}