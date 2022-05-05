package com.qf.controller;

import com.qf.entity.TbItemParamItem;
import com.qf.service.TbItemParamItemService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品规格和商品的关系表(TbItemParamItem)表控制层
 *
 * @author makejava
 * @since 2022-05-05 21:40:45
 */
@RestController
@RequestMapping("tbItemParamItem")
public class TbItemParamItemController {
    /**
     * 服务对象
     */
    @Resource
    private TbItemParamItemService tbItemParamItemService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbItemParamItem selectOne(Long id) {
        return this.tbItemParamItemService.queryById(id);
    }

}