package com.rick.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rick.common.utils.PageUtils;
import com.rick.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author mali
 * @email 747404919ma@gmail.com
 * @date 2022-09-10 21:11:19
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

