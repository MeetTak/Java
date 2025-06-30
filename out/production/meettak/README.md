# How to Properly Compile and Run Your Java Files

<details id="1" open>
<summary><h2>Basics</h2></summary>

1. **Compile the Java Files:**
    - Ensure you are in the root directory that contains the `Basics` directory.
    - Compile your Java files using the following command:
      ```sh
      javac Basics/FirstClass.java Basics/HelloMeet.java
      ```

2. **Run the Java Program:**
    - To run the `FirstClass` program, use the fully qualified name, which includes the package name:
      ```sh
      java Basics.FirstClass
      ```
    - Similarly, to run the `HelloMeet` program, use:
      ```sh
      java Basics.HelloMeet
      ```

> [!IMPORTANT]
> Here’s an example:
> ```sh
> cd /Users/meettak/Java
> javac Basics/FirstClass.java Basics/HelloMeet.java
> java Basics.FirstClass
> java Basics.HelloMeet
> ```

</details>

<details id="2">
<summary><h2>Summary</h2></summary>

1. Ensure the `package Basics;` statement is present at the top of your Java files.
2. Navigate to the root directory containing the `Basics` folder.
3. Compile the Java files with:
   ```sh
   javac Basics/FirstClass.java Basics/HelloMeet.java
   ```
4. Run the compiled classes with:
   ```sh
   java Basics.FirstClass
   java Basics.HelloMeet
   ```

```sh
cd "/Users/meettak/Java/"
javac Expressions/Main.java
java -cp . Expressions.Main
```

**Explanation of the commands:**

- `cd "/Users/meettak/Java/"`: Changes the directory to the root of your Java project (the parent directory of the `Expressions` package).
- `javac Expressions/Main.java`: Compiles `Main.java` which is located inside the `Expressions` package.
- `java -cp . Expressions.Main`: Runs the compiled `Main` class. The `-cp .` option sets the classpath to the current directory, allowing Java to find and load classes in the package structure starting from there. You must specify the fully qualified name of the class, which includes the package name (`Expressions.Main`).

</details>

<!-- This site was built using [GitHub Pages](https://pages.github.com/). -->