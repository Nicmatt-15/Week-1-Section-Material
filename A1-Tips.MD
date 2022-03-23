# Tips for Take-Home Assessment 1

## Table of Content

- [Structure and Design](#structure-and-design)
- [Use of Language Features](#use-of-language-features)
- [Document and Readability](#document-and-readability)
- [Extra Tips](#extra-tips)

---

## Structure and Design

- A well structured solution should contain 12/13 methods.
- No `System.out.println(...)` in main unless it prints out blank lines.
- You should not have any method that only contains one line of code. Take a look at the example below:

  ```java
  public static void printGreeting() {
      System.out.println("hi");
  }
  ```

  The above method is considered trivial _(bad)_ as it only contains one line of code. Take a look at another example below:

  ```java
  public static void printGreeting() {
      System.out.println("hi");
      printMoreGreeting();
  }

  public static void printMoreGreeting() {
      System.out.println("hello");
      System.out.println("My name is Nic!");
  }
  ```

  The method `printGreeting()` now is <u>**_not_**</u> considered trivial _(good)_ because it does two things:

  1. Prints the String `hi`.
  2. Calls the `printMoreGreeting()` method.

- The correct solution (without any duplicate non-blank println) should have 20 non-blank println.
- The correct solution has 7 method calls in main.

---

## Use of Language Features

- You should print blank line using `System.out.println();` instead of `System.out.println("");`

---

## Document and Readability

- Make sure your code is indented properly
- Make sure your method names are <u>**both**</u> descriptive and camelCased.
- Add header comment followed by a class comment right below it.
- Make sure you have a blank line between the end of one method and the next method comment.

---

## Extra Tips

- The main idea with Take-Home Assessment 1 is the fact that a method can call another method, which calls another method. Example:

```java
public static void printGreeting1() {
    System.out.println("Hi");
    printGreeting2();
}

public static void printGreeting2() {
    System.out.println("Hello");
    printGreeting3();
}

public static void printGreeting3() {
    System.out.println("Aloha");
    System.out.println("Wazzup");
}
```

Notice how the method `printGreeting1()` is calling the method `printGreeting2()`. The `printGreeting2()` method then calls the `printGreeting3()` method.
