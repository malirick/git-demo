package com.rick.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rick.common.utils.PageUtils;
import com.rick.gulimall.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author mali
 * @email 747404919ma@gmail.com
 * @date 2022-09-10 21:05:47
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

