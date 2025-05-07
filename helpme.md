To compile all new classes
cd /Users/mkendal9/Desktop/Java/com/udemy/oca

then compile each new class like
javac LoopsDemo.java 

Etc.

then cd to 
cd /Users/mkendal9/Desktop/Java

run
java com.udemy.oca.Oca 

java com.udemy.oca.OperatorsDemo

java com.udemy.oca.LoopsDemo  

etc


To run the programs in your tutorial from the command line, follow these improved steps:

Navigate to the directory containing your Java source files:

Bash

cd /Users/mkendal9/Desktop/Java/com/udemy/oca
Compile all new or modified .java files:

Bash

javac *.java
This command will compile all .java files in the current directory.

Navigate to the root directory where your compiled classes' package structure starts:

Bash

cd /Users/mkendal9/Desktop/Java
Run your Java programs using their fully qualified names:

Bash

java com.udemy.oca.Oca
java com.udemy.oca.OperatorsDemo
java com.udemy.oca.LoopsDemo
# Add commands to run other classes as needed, e.g.,
# java com.udemy.oca.AnotherClass
Explanation of Improvements:

Instead of compiling each file individually (javac LoopsDemo.java, javac OperatorsDemo.java, etc.), using javac *.java from the correct directory compiles all .java files at once, which is more efficient.
The instructions are clearer about navigating to the correct directories for both compilation and execution.
Using the fully qualified name (e.g., com.udemy.oca.Oca) when running the Java command ensures that the Java Virtual Machine (JVM) can correctly locate your compiled class files based on their package structure.
Let me know if you have any other steps you'd like me to refine!
