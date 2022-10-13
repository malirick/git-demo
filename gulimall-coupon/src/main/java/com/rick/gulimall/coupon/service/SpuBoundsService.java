package com.rick.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rick.common.utils.PageUtils;
import com.rick.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author mali
 * @email 747404919ma@gmail.com
 * @date 2022-09-10 19:06:11
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

