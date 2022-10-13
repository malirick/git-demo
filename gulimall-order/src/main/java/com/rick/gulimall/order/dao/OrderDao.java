package com.rick.gulimall.order.dao;

import com.rick.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author mali
 * @email 747404919ma@gmail.com
 * @date 2022-09-10 21:05:47
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
