package com.rick.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rick.common.utils.PageUtils;
import com.rick.gulimall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author mali
 * @email 747404919ma@gmail.com
 * @date 2022-09-10 12:07:03
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

