package com.freemypay.Optional类;

import java.util.Optional;

/**
 * Optional用于包含非空对象的容器对象。Optional对象，用于表示使用不存在null值。
 * 这个类有各种实用的方法，以方便代码来处理为可用或不可用，而不是检查null值。
 * 它是Java引入, 是类似于在 Guava 中的 Optional
 */
public class Optional类Test {
    
    public static void main(String args[]){
        Optional类Test Optional类Test = new Optional类Test();

        Integer value1 =  null;
        Integer value2 =  new Integer(10);
        //Optional.ofNullable - allows passed parameter to be null.
        Optional<Integer> a = Optional.ofNullable(value1);
        //Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);

        System.out.println(Optional类Test.sum(a,b));
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b){
        //Optional.isPresent - checks the value is present or not
        System.out.println("First parameter is present: " + a.isPresent());

        System.out.println("Second parameter is present: " + b.isPresent());

        //Optional.orElse - returns the value if present otherwise returns
        //the default value passed.
        Integer value1 = a.orElse(new Integer(0));

        //Optional.get - gets the value, value should be present
        Integer value2 = b.get();

        int i = value1 + value2;
        return i;
    }
}
