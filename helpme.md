# Running Java Tutorial Programs from the Command Line

To run the programs in your tutorial from the command line, follow these improved steps:

1.  **Navigate to the directory containing your Java source files:**
    ```bash
    cd /Users/*username*/Desktop/Java/com/udemy/oca
    ```

2.  **Compile all new or modified `.java` files:**
    ```bash
    javac *.java
    ```
    This command will compile all `.java` files in the current directory.

3.  **Navigate to the root directory where your compiled classes' package structure starts:**
    ```bash
    cd /Users/*username*/Desktop/Java
    ```

4.  **Run your Java programs using their fully qualified names:**
    ```bash
    java com.udemy.oca.Oca
    java com.udemy.oca.OperatorsDemo
    java com.udemy.oca.LoopsDemo
    # Add commands to run other classes as needed, e.g.,
    # java com.udemy.oca.AnotherClass
    ```

## Explanation of Improvements:

Instead of compiling each file individually (`javac LoopsDemo.java`, `javac OperatorsDemo.java`, etc.), using `javac *.java` from the correct directory compiles all `.java` files at once, which is more efficient.

The instructions are clearer about navigating to the correct directories for both compilation and execution.

Using the fully qualified name (e.g., `com.udemy.oca.Oca`) when running the Java command ensures that the Java Virtual Machine (JVM) can correctly locate your compiled class files based on their package structure.

Let me know if you have any other steps you'd like me to refine!