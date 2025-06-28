Methods in java is similar to what we studied as functions in C language.

return statement: Java states that a return statement returns control to the invoker of a method.
                  The most common usage of the return statement, is to return a value.

In a method that doesn't return anything, is declared with void as the return type, a return statement is not required. It is assumed and execution is returned after the last line of code in the method is executed.
But in methods that do return data, a return statement with a value is required.

Some programming languages will call a method that returns a value, a function, and a method that doesn't return a value, a procedure.

Method's signature: A method's signature in Java consists of the method's name and its parameter list (the number, type, and order of its parameters). It uniquely identifies the method within a class or interface and is used during method overloading to distinguish between methods with the same name but different parameter lists. The return type of the method is not considered part of the method's signature.

Here's a breakdown of a method signature:

Method Name: The identifier used to refer to the method.
Parameter List: The parameters (if any) that the method accepts, including their types and order.
Example:
Consider the following method declaration in Java:

public int add(int a, int b) {
    return a + b;
}

Method Name: add
Parameter List: (int a, int b)
So, the signature of this method is add(int, int).

Importance of Method Signature:
Method Overloading: In Java, you can define multiple methods with the same name but different parameter lists within the same class. This is known as method overloading. The JVM uses the method signature to differentiate between these overloaded methods.

Method Calling: When you call a method, Java uses the method signature to determine which method to execute based on the arguments passed to it.

Note: While the return type is not part of the method signature, attempting to overload a method with the same parameter list but a different return type will result in a compilation error, as the methods would have the same signature.

 
