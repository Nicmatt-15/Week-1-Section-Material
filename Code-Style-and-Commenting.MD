# Code Style and Commenting

> A line of comment in Java is any line that starts with a double slash sign (//).
> Alternatively, a comment starts with a slash-asterisk sign `(/*)` and ends with an asterisk-slash sign `(*/)`.

---

## Table of Content

- [Header, Class, and Method Comment](#header-class-and-method-comment)
- [Comment placement](#comment-placement)
- [Descriptive Naming](#descriptive-naming)
- [Class Naming Convention](#class-naming-convention)
- [Method Naming Convention](#method-naming-convention)
- [Indentation](#indentation)
- [Blank Line Between Methods](#blank-line-between-methods)
- [Blank Line Printing](#blank-line-printing)

---

## Header, Class, and Method Comment

- Header comment is a comment containing information about the author of the code and general information related to the creation of the code (date, topic, etc).

  Example of a good header comment:

  ```java
  // Nicolas Matthew Suhardi
  // CSE 142 Section AC
  // TA: Brett Wortzman
  // Final version: 1/12/2022
  // Take-Home Assessment #1
  ```

- Class comment is a short description of what the overall program is.

  Example of a good class comment:

  ```java
  /*
  This program draws a replica model of
  the Leaning Tower of Pisa using ASCII
  using ASCII characters
  */
  ```

  > The comment above is an example of comments that starts with the slash-asterisk sign `(/*)` and ends with the asterisk-slash sign `(*/)`

- Method comments are comments that is written right above each method explaining what the method does in general.

  Example of a good method comment:

  ```java
  // Draws a diamond shaped figure
  public static void drawDiamond() {
      System.out.println("  /\\");
      System.out.println(" /  \\");
      System.out.println("/    \\");
      System.out.println("\\    /");
      System.out.println(" \\  /");
      System.out.println("  \\/");
  }
  ```

  > Method comment should be short and concise. It should also accurately describes what a method does **not what is contained in the method**.

  > The line `public static void drawDiamond() {` is called a method header.

[Back to Top](#table-of-content)

---

## Comment placement

- Header comments always comes first, followed by class comments.
- Both comments are located at the very top of your code, before the class declaration line.

```java
  // Nicolas Matthew Suhardi
  // CSE 142 Section AC
  // TA: Brett Wortzman
  // Final version: 1/12/2022
  // Take-Home Assessment #1
  // This program draws a replica model of
  // the Leaning Tower of Pisa using ASCII
  // using ASCII characters

  public class Demo {
      public static void main(String[] args) {
          // <some code here>
      }
  }
```

- Method comments should be placed right above the corresponding method. `<See Example Above>`

> The line `public class Demo {` is called a class header.

[Back to Top](#table-of-content)

---

## Descriptive Naming

- Your Class name should be an accurate representation of what your program does.
- Your method name should be an accurate representation of what your method does.

Example of bad method names:

- method1
- x
- part1
- paragraph1
- tbly
- x1

> A descriptive name should not be a one letter name simply because a single letter could not describe what your method does good enough.

> You should avoid using any uncommon abbreviation for method names.

Example of good method names:

- roundTwoDecimal
- drawDiamond
- calculateSpending
- printBridge

> A good method name should give the reader a clue to what your method is doing.

[Back to Top](#table-of-content)

---

## Class Naming Convention

- Class name should be `PascalCased`
- PascalCasing means the first letter of every word should be capitalized

Correct example:

- HelloWorld
- EmpireState
- FinancialCounter

Incorrect example:

- helloWorld
- empirestate
- financial_counter

[Back to Top](#table-of-content)

---

## Method Naming Convention

- Method name should be `camelCased`
- camelCasing means the first letter of every word **starting from the second word** is capitalized.

Correct example:

- drawDiamond
- multiply
- drawObservationDeck

Incorrect example:

- DrawDiamond
- Multiply
- draw_observation_deck

[Back to Top](#table-of-content)

---

## Indentation

- You should indent one tab **further** after every _opening curly bracket_
- You should indent one tab **less** after every _closing curly bracket_
- Closing curly bracket should be indented to the same level as the structure it is supposed to close

Here is a good example:

```java
public class Demo {
  public static void main(String[] args) {
    helloWorld();
  }

  public class helloWorld() {
    System.out.println("hello world");
    System.out.println("hello sunshine");
  }
}
```

> Notice the closing curly bracket placement. The one on line 4 is indented to the same level as line 2 because it is supposed to close the main method.

> Notice that the very last curly bracket has no indentation / the same indentation as line 1 because it is supposed to close the class.

Here is an incorrect example:

```java
public class Demo {
    public static void main(String[] args) {
      helloWorld();
      }

    public class helloWorld() {
    System.out.println("hello world");
    System.out.println("hello sunshine");
  }
  }
```

[Back to Top](#table-of-content)

---

## Blank Line Between Methods

One method should be separated from another by **exactly** one blank line.

Incorrect example:

```java
// Draws a diamond figure
public static void drawDiamond() {
  // <some code here>
}
// Draws an X figure
public static void drawX() {
  // <some code here>
}
```

Less favorable example:

```java
// Draws a diamond figure
public static void drawDiamond() {
  // <some code here>
}




// Draws an X figure
public static void drawX() {
  // <some code here>
}
```

> The example above has too many blank line between one method and the next method.

Correct example:

```java
// Draws a diamond figure
public static void drawDiamond() {
  // <some code here>
}

// Draws an X figure
public static void drawX() {
  // <some code here>
}
```

> Notice that there is exactly 1 blank line after the end of the `drawDiamond()` method and the method comment for `drawX()` method.

[Back to Top](#table-of-content)

---

## Blank Line Printing

Correct way to print blank line:

```java
System.out.println();
```

Incorrect (style wise) way to print blank line:

```java
System.out.println("");
```

> Writing `System.out.println("") `makes the intention less clear that you are trying to print a blank line. Sometimes, you need to print a space using `System.out.println(" ")` which can cause confusin to your reader due to their similarities.

[Back to Top](#table-of-content)
