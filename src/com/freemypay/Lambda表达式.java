package com.freemypay;

/**
 * lambda表达式主要用于定义内联执行的功能的接口，即只有一个单一的方法接口。在上面的例子中，
 * 我们使用不同类型的lambda表达式定义MathOperation接口的opearation方法。然后，我们定义GreetingService的sayMessage实现。
 * Lambda表达式消除匿名类的需求，并给出了一个非常简单但功能强大的函数式编程能力。
 */
public class Lambda表达式 {
     public static void main(String args[]){
         Lambda表达式 tester = new Lambda表达式();

      //with type declaration
      MathOperation addition = (int a, int b) -> a + b;

      //with out type declaration
      MathOperation subtraction = (a, b) -> a - b;

      //with return statement along with curly braces
      MathOperation multiplication = (int a, int b) -> { return a * b; };
      //without return statement and without curly braces
      MathOperation division = (int a, int b) -> a / b;

      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));	   
      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
      System.out.println("10 / 5 = " + tester.operate(10, 5, division));

      //with parenthesis
      GreetingService greetService1 = message -> System.out.println("Hello " + message);

      //without parenthesis
      GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

      greetService1.sayMessage("Mahesh");
      greetService2.sayMessage("Suresh");	   
   }   

   interface MathOperation {
      int operation(int a, int b);
   }  

   interface GreetingService {
      void sayMessage(String message);
   }

   private int operate(int a, int b, MathOperation mathOperation){
      return mathOperation.operation(a, b);
   }

}

class Lambda表达式1 {
    final static String salutation = "Hello! ";
    public static void main(String args[]){
        GreetingService greetService1 = message -> System.out.println(salutation + message);
        greetService1.sayMessage("Mahesh");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}