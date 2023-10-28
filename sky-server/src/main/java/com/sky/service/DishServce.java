package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishServce {

    /**
     * 新增菜品和对应口味
     * */
    public void saveWithFlavor(DishDTO dishDTO);

    /**
     * 菜品分页查询
     *
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 菜品批量删除
     * */
    void deleteBatch(List<Long> ids);

    /**
     * 根据id查询菜品和对应口味数据
     * */
    DishVO getByIdWithFlavor(Long id);

    /**
     * 根据id修改菜品基本信息和对应口味信息
     * */
    void updateWithFlavor(DishDTO dishDTO);
}
