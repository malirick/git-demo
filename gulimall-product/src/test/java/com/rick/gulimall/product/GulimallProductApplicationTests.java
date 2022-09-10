package com.rick.gulimall.product;

import com.rick.gulimall.product.dao.BrandDao;
import com.rick.gulimall.product.entity.BrandEntity;
import com.rick.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@EnableAutoConfiguration
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired()
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
         brandEntity.setName("oppo");

        brandService.save(brandEntity);
        System.out.println("插入成功");


    }

}
