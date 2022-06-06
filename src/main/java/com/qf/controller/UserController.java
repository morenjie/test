package com.qf.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.qf.entity.User;
import com.qf.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private CacheManager cacheManager;
    @Autowired
    private UserService userService;

    /**
     * CachePut:将方法返回值放入缓存
     * value:缓存的名称,每个缓存名称下面可以有多个key
     * key:缓存的key
     *
     * @param user
     * @return
     */
    @PostMapping
    @CachePut(value = "userCache", key = "#user.id")
    public User save(User user) {
        log.info("{}", user);
        userService.save(user);
        return user;
    }

    @DeleteMapping("/{id}")
    @CacheEvict(value = "userCache",key = "#id")
    public void delete(@PathVariable Long id) {
        userService.removeById(id);
    }

    @PutMapping
    @CacheEvict(value = "userCache",key = "#user.id",condition = "#!=null")
    public User update(User user) {
        userService.updateById(user);
        return user;
    }

    /**
     * unless:满足条件则不缓存
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @Cacheable(value = "userCache",key = "#id",unless = "#result==null")
    public User getById(@PathVariable Long id) {
        User user = userService.getById(id);
        return user;
    }

    @GetMapping("/list")
    @Cacheable(value = "userCache",key = "#user.id+'_'+#user.name")
    public List<User> list(User user) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(user.getId() != null, User::getId, user.getId());
        queryWrapper.eq(user.getName() != null, User::getName, user.getName());
        List<User> list = userService.list(queryWrapper);
        return list;
    }

}
