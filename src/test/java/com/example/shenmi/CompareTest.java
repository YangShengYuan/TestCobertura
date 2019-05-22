package com.example.shenmi;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Yang ShengYuan
 * @date 2019/5/22
 * @Description ${DESCRIBE}
 **/
public class CompareTest {
    private Compare compare = new Compare();

    @Test
    public void cmpTest1(){
        Assert.assertSame("比较错误",0,compare.compareInt(2,2));
    }

    @Test
    public void cmpTest2(){
        Assert.assertSame("比较错误",0,compare.compareInt(2,2));
    }

    @Test
    public void cmpTest3(){
        Assert.assertSame("比较错误",1,compare.compareInt(7,2));
    }
}
