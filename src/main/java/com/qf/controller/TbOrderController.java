package com.qf.controller;

import com.qf.entity.TbOrder;
import com.qf.service.TbOrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbOrder)表控制层
 *
 * @author makejava
 * @since 2022-05-05 21:40:46
 */
@RestController
@RequestMapping("tbOrder")
public class TbOrderController {
    /**
     * 服务对象
     */
    @Resource
    private TbOrderService tbOrderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbOrder selectOne(String id) {
        return this.tbOrderService.queryById(id);
    }

}