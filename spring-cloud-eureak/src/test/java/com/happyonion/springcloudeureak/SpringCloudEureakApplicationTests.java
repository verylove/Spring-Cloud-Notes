package com.happyonion.springcloudeureak;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.EventListener;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudEureakApplicationTests {

    @Test
    public void contextLoads() {
        int abc =10;
    }


    public void test(String abc){
        System.out.print(abc);
    }
}
