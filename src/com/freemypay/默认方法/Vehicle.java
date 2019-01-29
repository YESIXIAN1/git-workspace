package com.freemypay.默认方法;

/**
 *Java8引入的接口默认方法实现一个新的概念。此功能是为了向后兼容性增加，使旧接口可用于利用JAVA8。
 * lambda表达式的能力，例如，列表或集合接口不具备forEach方法声明。从而增加了这样的方法只会打破收集框架实现。
 * Java8引入了默认的方法使列表/Collection接口可以拥有forEach默认方法，并实现类实现这些接口不需要实现相同功能。
 *
 */
public interface Vehicle {
    /**
     * 1.多重默认
     */
    default void print () {
        System.out.println("i am a vehicle");
    }

    /**
     * 2. Java8起接口也可以有静态辅助方法
     *
     */
    static void blowHorn() {
        System.out.println("Blowing horn!!!");
    }
}
