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


New Machine

Okay, that explains the "file not found" error. If LoopsDemo.java is at the root of markkendall@C02FGA47MD6N Java1.8OCAExam, but it belongs to the com.udemy.oca package, you need to compile it in a way that respects the package structure for the resulting .class file.

From the markkendall@C02FGA47MD6N Java1.8OCAExam directory, you should use the following command:

Bash

javac -d . LoopsDemo.java
Let's break down this command:

javac: This is the Java compiler.
-d .: This option tells the compiler where to place the generated .class file(s). The . specifies the current directory. The compiler will automatically create the com/udemy/oca directory structure under your current location if it doesn't exist and place the LoopsDemo.class file there.
LoopsDemo.java: This is the source file you want to compile.


Great! I'm glad that worked for compilation.

Now, to run the compiled LoopsDemo class, you need to be in the directory that contains the root of your package structure, which is markkendall@C02FGA47MD6N Java1.8OCAExam in this case.

From that directory, you would use the java command followed by the fully qualified name of your class (including the package name):

Bash

java com.udemy.oca.LoopsDemo
So, the steps are:

Make sure you are in the markkendall@C02FGA47MD6N Java1.8OCAExam directory in your terminal.
Run the command: java com.udemy.oca.LoopsDemo
Could you try that and let me know if it runs successfully?