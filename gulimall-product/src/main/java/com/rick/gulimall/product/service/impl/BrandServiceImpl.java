package com.rick.gulimall.product.service.impl;

import com.rick.gulimall.product.service.CategoryBrandRelationService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rick.common.utils.PageUtils;
import com.rick.common.utils.Query;

import com.rick.gulimall.product.dao.BrandDao;
import com.rick.gulimall.product.entity.BrandEntity;
import com.rick.gulimall.product.service.BrandService;
import org.springframework.transaction.annotation.Transactional;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Autowired
    CategoryBrandRelationService categoryBrandRelationService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        //1、获取key
        String key = (String) params.get("key");
        QueryWrapper<BrandEntity> queryWrapper = new QueryWrapper<>();
        if(!StringUtils.isEmpty(key)){
            queryWrapper.eq("brand_id",key).or().like("name",key);
        }

        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                queryWrapper

        );

        return new PageUtils(page);
    }

    @Override
    public void updateDetail(BrandEntity brand) {
        this.updateById(brand);
        if(!StringUtils.isEmpty(brand.getName())){
            categoryBrandRelationService.updateBrand(brand.getBrandId(),brand.getName());

            //TODO
        }
    }

//    @Transactional
//    @Override
//    public void updateDetail(BrandEntity brand) {
//        //保证冗余字段的数据一致
//        this.updateById(brand);
//        if(!StringUtils.isEmpty(brand.getName())){
//            //同步更新其他关联表中的数据
//            categoryBrandRelationService.updateBrand(brand.getBrandId(),brand.getName());
//
//            //TODO 更新其他关联
//        }
//    }

}