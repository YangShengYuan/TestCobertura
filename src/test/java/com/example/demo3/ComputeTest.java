package com.example.demo3;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Yang ShengYuan
 * @date 2019/5/19
 * @Description ${DESCRIBE}
 **/
public class ComputeTest {
    private Compute compute = new Compute();

    @Test
    public void addTest1(){
        Assert.assertSame("加法计算错误",7,compute.add(3,4));
    }

    @Test
    public void addTest2(){
        Assert.assertSame("加法计算错误",5,compute.add(3,2));
    }

    @Test
    public void addTest3(){
        Assert.assertSame("加法计算错误",0,compute.add(4,-4));
    }

    @Test
    public void mulTest1(){
        Assert.assertSame("乘法计算错误",2,compute.mul(1,2));
    }

    @Test
    public void mulTest2(){
        Assert.assertSame("乘法计算错误",0,compute.mul(5,0));
    }

    @Test
    public void mulTest3(){
        Assert.assertSame("乘法计算错误",24,compute.mul(6,4));
    }

    @Test
    public void minTest1(){
        Assert.assertSame("减法计算错误",2,compute.minus(6,4));
    }

    @Test
    public void minTest2(){
        Assert.assertSame("减法计算错误",12,compute.minus(16,4));
    }

    @Test
    public void minTest3(){
        Assert.assertSame("减法计算错误",40,compute.minus(42,2));
    }


}
