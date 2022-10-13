package com.rick.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rick.common.utils.PageUtils;
import com.rick.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author mali
 * @email 747404919ma@gmail.com
 * @date 2022-09-10 19:06:10
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

