# Theory

## Table of Content

- [Class and Method Terminology](#class-and-method-terminology)
- [How java reads code](#how-java-reads-code)

## Class and Method Terminology

---

In java, every code that you write is always inside a class. You can think of a class like a big box that contains all your code inside.

If you put any code outside a class, java won't be happy. As a result, you will get a compiler error when you are compiling your code.

> Compiling your code is a step where the computer converts your human-readable code into machine code (usually in binary) prior to executing it

> Computer cannot run your human-readable code. In other words, computer cannot run your **.java** file. Your computer will convert your .java file into a binary file of type **.class** before running the **.class** file.

Inside a class, there exists methods. A method is a **group** of codes.

> Notice the word "group". In a group, the members are usually related to each other because of a certain similarities. In programming, we group codes based on which part of the program they are related to. **We don't want to group code that does two completely different things together.**

When you first start writing your code, you always want to write the main method first. The main method is a special method that tells java the starting point of your program. In other words, java will execute your code starting from your main method and jumping to other methods if instructed to do so.

However, a main method is not enough (most of the time). As our code grows longer, we don't want to put everything in the main method as this defeats the purpose of grouping in the first place. As such, we create something called _static methods_. Take a look at the example below:

```java
// All of the codes are contained in one class called Demo
public class Demo {
    // This is the main method
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    // This is one static method
    public static void method1() {
        System.out.println("Hi");
    }

    // This is one static method
    public static void method2() {
        System.out.println("Heyo");
    }

    // This is one static method
    public static void method3() {
        System.out.println("Aloha");
    }
}
```

The code above has a total of 1 class and 4 methods. Out of the 4 methods, one is a main method and the other 3 is a normal static method.

[Back to Top](#table-of-content)

---

## How Java Reads Code

### (and how you should too)

---

When you run a code, java always searches where your main method is located first. It does not matter if you made one or more static method(s) before the main method, java will always look to run the code starting from the main method first.

Once java reaches the main method, it will execute the code line by line in order from top to bottom.

If there is a method call in main, java will jump into that method, finish everything inside that method (line by line in order from top to bottom) before returning back to the main method.

Take a look at the code below:

```java
public class Demo { // 1
    public static void method2() { // 9
        System.out.println("Heyo"); // 10
    } // 11

    public static void method1() { // 4
        System.out.println("Hello"); // 5
        System.out.println("Hi"); // 6
    } // 7

    public static void method3() { // 13
        System.out.println("Aloha"); // 14
    } // 15

    public static void main(String[] args) { // 2
        method1(); // 3
        method2(); // 8
        method3(); // 12
    } // 16
} // 17
```

The output of the code above is:

```
Hello
Hi
Heyo
Aloha
```

> The number that you see at the end of every line is the order of the line java reads your code starting from number 1.

[Back to Top](#table-of-content)
