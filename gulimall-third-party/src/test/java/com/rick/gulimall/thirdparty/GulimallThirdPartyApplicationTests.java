package com.rick.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class GulimallThirdPartyApplicationTests {



    @Autowired
    OSSClient ossClient;

    //    @RunWith(SpringRunner.class)
    @Test
    public void testUpload() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("C:\\Users\\rick\\Pictures\\Camera Roll\\749.jpg");
        ossClient.putObject("gulimall-rick", "rick.jpg", inputStream);
        ossClient.shutdown();
        System.out.println("ok");
    }



    @Test
  public   void contextLoads() {
    }

}
