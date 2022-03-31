# Worksheet 1

This worksheet is meant to help boost your concept and understanding
of the material used in Take-Home Assessment 1.

## Question 1

---

Will the code below compile and run?
(Assume file name is Hello.java)

```java
public class hello {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
```

- Yes!
- No, you are missing an opening curly bracket
- No, you are closing a closing curly bracket
- No, a program cannot only have the main method.
  It must have other additional methods.
- No, but not for any of the reasons mentioned above

## Question 2

---

How does java read your code?

- Java has a unique but rather difficult to understand process
  to figure out which part of your program should be executed first
- Java reads your code line by line starting from the end of the file (bottom) to the start of the file (top)
- Java reads your code line by line starting from top to bottom
- Java reads your code starting from the main method, then going
  line by line top to bottom, and occasionally jumping if it hits
  a method call
- Java reads your code by converting your code into binary numbers
  and sorting these binary numbers to figure out which part should be
  executed first

## Question 3

---

What is the output of the following code?

```java
public class Demo {
    public static void main(String[] args) {
        firstParagraph();
        System.out.println("one");
        secondParagraph();
    }

    public static void firstParagraph() {
        secondParagraph();
        System.out.println("four");
    }

    public static void secondParagraph() {
        System.out.println("three");
        thirdParagraph();
    }

    public static void thirdParagraph() {
        System.out.println("two");
    }
}
```

-

```
three
two
four
one
three
two
```

-

```
four
one
three
two
```

-

```
one
two
three
four
```

-

```
two
three
four
one
two
three
```

-

```
one
four
three
two
```

## Answer Key

---

1. **Question 1:** _No, but not for any of the reasons mentioned above_

> Explanation: Your program name and class name should be exactly
> the same. Notice that your program name is **Hello.java**, which means your class name should be **Hello** with capital H, instead of **hello** with small h.

2. **Question 2:**
   Java reads your code starting from the main method, then going
   line by line top to bottom, and occasionally jumping if it hits
   a method call

> Explanation: When your program is run, the starting point is always the main method. When it enters the main method, java will
> execute your code one line at a time sequentially from top to bottom. If java hits a method call, then it will jump to execute that method (sequentially from top to bottom) until it is finished,
> before jumping back to its latest unfinished method.

3. **Question 3:**

```
three
two
four
one
three
two
```

> Note: This problem is meant to help you understand how java
> runs your code (question 2) better.
