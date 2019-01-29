package com.freemypay.默认方法;

/**
 * 多重默认
 * 调用使用超指定接口的默认方法
 */
public class Car2 implements Vehicle, FourWheeler {
    @Override
    public void print() {
        Vehicle.super.print();
    }
}
