package com.qf.controller;

import com.qf.entity.TbItemDesc;
import com.qf.service.TbItemDescService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品描述表(TbItemDesc)表控制层
 *
 * @author makejava
 * @since 2022-05-05 21:40:45
 */
@RestController
@RequestMapping("tbItemDesc")
public class TbItemDescController {
    /**
     * 服务对象
     */
    @Resource
    private TbItemDescService tbItemDescService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbItemDesc selectOne(Long id) {
        return this.tbItemDescService.queryById(id);
    }

}