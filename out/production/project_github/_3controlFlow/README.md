1) Fall through in switch statement:
Baically if we do not use a break statement, execution will continue to fall through any case labels declared below the matching one, and execute each case's code.

2) Difference between return and yield:

The yield and return statements in Java serve different purposes, especially in the context of switch expressions and traditional methods.

->return Statement:

The return statement is used to exit a method and optionally pass back a value to the caller of the method.
It can be used in any method to return control to the point where the method was invoked.
Once a return statement is executed, the method execution is terminated, and no further code within the method is executed.

->yield Statement:

The yield statement is specifically used within a switch expression to return a value from a block of code associated with a case label.
It allows for complex logic and multiple statements within a case block of a switch expression, ending with yielding a value to be used as the output of the switch expression.
yield is only used within switch expressions (introduced in Java 12 as a preview feature and standardized in Java 14) and cannot be used outside of this context.
Key Differences:

->Scope: return is used in methods to return control and possibly a value to the method caller, while yield is used within switch expressions to return a value from a case block.
Usage Context: return can be used in any method, whereas yield is specific to switch expressions.
->Control Flow: Both return and yield affect control flow by providing a value, but return exits the method, while yield simply provides a value to the switch expression and continues with the switch expression's evaluation.
->Syntax: return is used to return a value from a method, while yield is used within a switch expression to return a value from a case block.

3) Why do we use yeild in a switch
Your switch statement is being used as a switch expression returning a value.
Your case label uses a code block, with opening and closing curly braces.
this code: ->"1st";
is implicitly tranlated to: -> { yield "1st"; }

4) Traditional vs Enhanced switch expression there is no need to use break statement in the enhanced switch expression.

JUnit
If you attempt to run the code without a main method, IntelliJ IDEA will not recognize the file as an executable program and will either throw an error or simply do nothing when you try to run it.

To execute code that does not contain a main method, you would typically need to:

Include it in another class that does have a main method, or
Use a testing framework like JUnit to run methods as tests.
JUnit tests can be a way to execute code without a traditional main method, allowing you to invoke methods and check their outputs against expected values. This approach is commonly used for unit testing in Java projects.

->We can't declare veriable inside the while loop condition.



