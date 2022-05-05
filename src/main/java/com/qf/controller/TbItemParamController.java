package com.qf.controller;

import com.qf.entity.TbItemParam;
import com.qf.service.TbItemParamService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品规则参数(TbItemParam)表控制层
 *
 * @author makejava
 * @since 2022-05-05 21:40:45
 */
@RestController
@RequestMapping("tbItemParam")
public class TbItemParamController {
    /**
     * 服务对象
     */
    @Resource
    private TbItemParamService tbItemParamService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbItemParam selectOne(Long id) {
        return this.tbItemParamService.queryById(id);
    }

}