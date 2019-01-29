package com.freemypay.默认方法;

public interface FourWheeler {
    default void print() {
        System.out.println("i am a four wheeler!");
    }
}
