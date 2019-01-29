package com.freemypay.java8数据流;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class java8数据流 {
    /**
     * Testjava8数据流
     */
    public void test1() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
    }

    /**
     * 数据流提供了新的forEach方法遍历该流中的每个元素
     */
    public void test2() {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }

    /**
     * map方法用于映射每个元素对应的结果。考虑下面的例子打印唯一的方形数字。
     */
    public void test3() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //get list of unique squares
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
    }

    /**
     * filter方法用于消除基于标准元素。考虑下面的例子打印空字符串计数(总数)。
     */
    public void test4() {
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        //get count of empty string
        int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
    }

    /**
     * limit 方法用于减少流的大小。考虑下面的例子打印10个随机数字
     */
    public void test5() {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }

    /**
     * sorted方法用来流排序。考虑下面的例子打印10个随机数字的排序顺序
     */
    public void test6() {
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }

    /**
     * parallelStream是流进行并行处理的替代方案。考虑下面的例子打印空字符串计数
     */
    public void test7() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        //get count of empty string
        int count = (int) strings.parallelStream().filter(string -> string.isEmpty()).count();
    }

    /**
     * 收集器是用来处理组合在一个数据流的元素的结果。收集器可用于返回一个列表或一个字符串
     */
    public void test8() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);
    }

}
