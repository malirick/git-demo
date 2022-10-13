package com.rick.gulimall.coupon.dao;

import com.rick.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author mali
 * @email 747404919ma@gmail.com
 * @date 2022-09-10 19:06:11
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
