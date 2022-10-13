package com.rick.gulimall.product.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rick.gulimall.product.entity.BrandEntity;
import com.rick.gulimall.product.service.BrandService;
import com.rick.common.utils.PageUtils;
import com.rick.common.utils.R;

import javax.naming.Binding;
import javax.validation.Valid;


/**
 * 品牌
 *
 * @author mali
 * @email 747404919ma@gmail.com
 * @date 2022-09-10 12:38:32
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:brand:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    //@RequiresPermissions("product:brand:info")
    public R info( @PathVariable("brandId") Long brandId){

            BrandEntity brand = brandService.getById(brandId);
            return R.ok().put("brand", brand);



    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:brand:save")
    public R save(@Valid  @RequestBody BrandEntity brand, BindingResult result){
        Map<String,String> map=new HashMap<>();
        if (result.hasErrors()){
            result.getFieldErrors().forEach((item)->{

                String message = item.getDefaultMessage();
                String field = item.getField();
                map.put(field,message);
            });

            return  R.error(400,"提交数据不合法").put("data",map);
        }else {
            brandService.save(brand);

        }

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   // @RequiresPermissions("product:brand:update")
    public R update(@RequestBody BrandEntity brand){
		brandService.updateDetail(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:brand:delete")
    public R delete(@RequestBody Long[] brandIds){
		brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
