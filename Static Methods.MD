# Static Methods

## Table of Content

---

- [Purpose of Creating Static Methods](#purpose-of-creating-static-methods)
- [Creating Static Methods](#creating-static-methods)
- [Calling Static Methods](#calling-static-methods)
- [Trivial Methods](#trivial-methods)
- [Purpose of Main Method](#purpose-of-main-method)

---

## Purpose of Creating Static Methods

---

Previously, we learned that when we are writing our code, we should write them inside the main method. However, this is not the best practice for a lot of reasons. Here are a couple reasons:

- Your code becomes convoluted and long. This not only makes your code very hard to read, but it also makes your code hard to debug in case something went wrong.
- You cannot factor out similar codes from different part of the program to avoid redundancy and cut down on your code length.

> Debug is the act of finding where and why your program doesn't work and figuring out how to fix it.

[Back to Top](#table-of-content)

---

## Creating Static Methods

---

Here is the template of static method:

```java
public static void yourMethodName() {
    <your code here>
}
```

Here is an example of static method:

```java
public static void printGreeting() {
    System.out.println("Hi");
    System.out.println("Hello");
    System.out.println("Hey");
}
```

[Back to Top](#table-of-content)

---

## Calling Static Methods

---

Take a look at the code below and guess the output:

```java
public class Demo {
    public static void main(String[] args) {
        System.out.println("1");
    }

    public static void printSomething() {
        System.out.println("2");
    }
}
```

The output of the code above is:

```
1
```

Wait, so the "2" does not get printed? Well, it does not because Java assume that you don't want it to be printed.

Why does Java assume this? Because you did not call the `printSomething()` method, so Java thinks that there is no need to run that method.

Now the question is: How do we call the `printSomething()` method?

Take a look at the code below:

```java
public class Demo {
    public static void main(String[] args) {
        System.out.println("1");
        printSomething();
    }

    public static void printSomething() {
        System.out.println("2");
    }
}
```

Output:

```
1
2
```

Take a look at another version of the code below:

```java
public class Demo {
    public static void main(String[] args) {
        printSomething();
        System.out.println("1");
    }

    public static void printSomething() {
        System.out.println("2");
    }
}
```

Output:

```
2
1
```

[Back to Top](#table-of-content)

---

## Trivial Methods

---

So, what really is the purpose of static methods?

The main focus of us creating static methods is to reduce redundancy and _group_ related codes together.

Notice the word "group"! Because we are grouping codes, it is not a good practice to have a method that only does one thing. For example:

```java
public static void printFood() {
    System.out.println("Strawberries")'
}
```

The above code is called a _trivial method_. When dealing with these kind of methods, you should either:

- Combine the content into another method
- Add one or more **useful** line to the method

[Back to Top](#table-of-content)

---

## Purpose of Main Method

---

Now that we learned the purpose of creating and utilizing static methods, we should step back and ask ourselves the following question:

**What is the purpose of main method?**

Aside from the fact that main method tells Java where to start when you run your code, the main method also serves a stylistic purpose. Main method should act as a table of content for your code.

Here is a good example:

```java
public class Demo() {
    // A good example of main method
    // acting like a table of content
    public static void main(String[] args) {
        printGreeting();
        printFavoriteFood();
        printHobby();
    }

    public static void printGreeting() {
        System.out.println("Hello");
        System.out.println("My name is Nicolas");
    }

    public static void printFavoriteFood() {
        System.out.println("My favorite foods are:");
        System.out.println("1. Indomie");
        System.out.println("2. Chipotle");
    }

    public static void printHobby() {
        System.out.println("My favorite hobbies are:");
        System.out.println("1. Collecting carnivorous plants");
        System.out.println("2. Coding");
        System.out.println("3. Teaching");
    }
}
```

Here is the first bad example:

```java
public class Demo() {
    // A bad example of main method
    // because all of the content
    // is in the main method
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("My name is Nicolas");
        System.out.println("My favorite foods are:");
        System.out.println("1. Indomie");
        System.out.println("2. Chipotle");
        System.out.println("My favorite hobbies are:");
        System.out.println("1. Collecting carnivorous plants");
        System.out.println("2. Coding");
        System.out.println("3. Teaching");
    }
}
```

Here is the second bad example:

```java
public class Demo() {
    // A bad example of main method
    // because it does not accurately
    // draw a good picture of your
    // program's content
    // Imagine trying to understand
    // the overall idea of the whole
    // program by reading one method
    // call
    public static void main(String[] args) {
        printGreeting();
    }

    public static void printGreeting() {
        System.out.println("Hello");
        System.out.println("My name is Nicolas");
        printFavoriteFood();
    }

    public static void printFavoriteFood() {
        System.out.println("My favorite foods are:");
        System.out.println("1. Indomie");
        System.out.println("2. Chipotle");
        printHobby();
    }

    public static void printHobby() {
        System.out.println("My favorite hobbies are:");
        System.out.println("1. Collecting carnivorous plants");
        System.out.println("2. Coding");
        System.out.println("3. Teaching");
    }
}
```

[Back to Top](#table-of-content)
