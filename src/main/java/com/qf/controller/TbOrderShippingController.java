package com.qf.controller;

import com.qf.entity.TbOrderShipping;
import com.qf.service.TbOrderShippingService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbOrderShipping)表控制层
 *
 * @author makejava
 * @since 2022-05-05 21:40:46
 */
@RestController
@RequestMapping("tbOrderShipping")
public class TbOrderShippingController {
    /**
     * 服务对象
     */
    @Resource
    private TbOrderShippingService tbOrderShippingService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbOrderShipping selectOne(String id) {
        return this.tbOrderShippingService.queryById(id);
    }

}