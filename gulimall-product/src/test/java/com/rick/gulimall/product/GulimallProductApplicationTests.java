package com.rick.gulimall.product;


import com.rick.gulimall.product.dao.BrandDao;
import com.rick.gulimall.product.entity.BrandEntity;
import com.rick.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired()
    BrandService brandService;

//    @Autowired
//    OSSClient ossClient;
//
////    @RunWith(SpringRunner.class)
//    @Test
//    public void testUpload() throws FileNotFoundException {
//        InputStream inputStream = new FileInputStream("C:\\Users\\rick\\Pictures\\Camera Roll\\749.jpg");
//        ossClient.putObject("gulimall-rick", "749.jpg", inputStream);
//        ossClient.shutdown();
//        System.out.println("ok");
//    }

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("oppo");

        brandService.save(brandEntity);
        System.out.println("插入成功");


    }

}
