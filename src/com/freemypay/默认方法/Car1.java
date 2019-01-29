package com.freemypay.默认方法;

/**
 * 多重默认
 * 创建一个自己的方法，并覆盖默认实现。
 */
public class Car1 implements Vehicle, FourWheeler {
    @Override
    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("i am a four wheel Car1 vehicle");
    }

}
