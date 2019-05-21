package com.example.demo2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo2ApplicationTests {

    @Before
    public void init(){
        System.out.println("start tesring.....");
    }

    @After
    public void after(){
        System.out.println("end testing.......");
    }

}
