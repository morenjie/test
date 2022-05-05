package com.qf.controller;

import com.qf.entity.TbOrderItem;
import com.qf.service.TbOrderItemService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbOrderItem)表控制层
 *
 * @author makejava
 * @since 2022-05-05 21:40:46
 */
@RestController
@RequestMapping("tbOrderItem")
public class TbOrderItemController {
    /**
     * 服务对象
     */
    @Resource
    private TbOrderItemService tbOrderItemService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbOrderItem selectOne(String id) {
        return this.tbOrderItemService.queryById(id);
    }

}