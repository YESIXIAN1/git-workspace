package com.freemypay.ChronoUnits枚举;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * java.time.temporal.ChronoUnit 枚举在 Java8 中添加，以取代旧的API用来代表日，月等整数值
 */
public class Java8Tester {
    public static void main(String args[]){
        Java8Tester java8tester = new Java8Tester();
        java8tester.testChromoUnits();
    }

    public void testChromoUnits(){
        //Get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);
        //add 1 week to the current date
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week: " + nextWeek);
        //add 1 month to the current date
        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + nextMonth);
        //add 1 year to the current date
        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("Next year: " + nextYear);
        //add 10 years to the current date
        LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
        System.out.println("Date after ten year: " + nextDecade);
    }
}
