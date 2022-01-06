# Week 1 Compiler Error

When you are compiling your code and you received an error,
the two most important parts that you have to look at are:

1. **The line where the error happens**
   ![Line Where the Error Happens](https://i.postimg.cc/bvpWYBZs/Screen-Shot-2021-12-27-at-19-10-15.png)

   > If the image does not show up, please use the following link: https://postimg.cc/75tmmXMk

   In the picture above (the section enclosed by the red square), java is telling you that the error happens in a file called
   Demo.java on line 10.

   ***

   The line number showed here is accurate around 80% of the time.
   However, there are cases where these line numbers are not an
   accurate representation of where your source of error may be.

   ***

   You can usually tell if the line number is not accurate if the
   error message simply does not make any sense for the mentioned line. In this case, the most likely place of error is any code
   above the mentioned line.

   ***

   The most well-known case for line number being not accurate is when the error is related to curly brackets.

2. **The error message**
   ![The Error Message](https://i.postimg.cc/XYjNmQnk/Screen-Shot-2021-12-27-at-19-10-25.png)

> If the image does not show up, please use the following link: (https://postimg.cc/F76QJbdY)

In the picture above (the section enclosed by the red square), java is telling you that the error happens because a semicolon `;` is expected at the end of line 10, but your code does not have one.

---

Just like the line number, the error message is only accurate around 80% of the time. If the error message simply does not make sense, then you have to find the source of the error in other parts of your code.

## List of Common Compiler Errors

---

| #   | Error Message                                           | Probable Cause                                                        |
| --- | ------------------------------------------------------- | --------------------------------------------------------------------- |
| 1   | Cannot find symbol (method call)                        | The method you are calling has not been declared.                     |
|     |                                                         | You have a mistype when calling the method or when naming the method  |
| 2   | Cannot find symbol (variable)                           | The variable does not exist / has not been declared in the scope      |
| 3   | Class, interface, or enum expected                      | Too many closing curly brackets                                       |
| 4   | Illegal start of expression                             | You closed one or more curly brackets earlier than expected           |
| 5   | Reached end of file while parsing                       | Too many closing curly brackets (`}`)                                 |
| 6   | `;` expected                                            | You missed `; `at the end of the line                                 |
| 7   | Class is public, should be declared in a file named ... | Your class name is not matching with your file name                   |
| 8   | Incompatible types - expected ... type                  | Your variable types and the value you are saving it to does not match |
| 9   | Missing method body                                     | Your method declaration line contains unexpected `;`                  |
| 10  | Missing return statement                                | Your method is supposed to return a value, but does not               |
|     |                                                         | You do not have a return statement outside an if/else-if conditional  |
| 11  | Unreachable statement                                   | You have a code that is always executed after a return statement      |
| 12  | Unclosed String literal                                 | Missing `""` around String                                            |

## Hidden or Unexpected Error

---

As mentioned before, error message are not always accurate. On top of that, the way java compiles your code may not be 100% accurate.
You may have a code that compiles, but won't run as expected.

---

Errors such as missing `;` when declaring a for-loop or adding `;` after a for-loop are two errors in writing syntax that have
an inaccurate message and compiles even though it is incorrect, respectively.

---

Ultimately, it comes down to experience. After running to the same error a lot of times, recognizing and fixing these errors
will become second nature to you.
