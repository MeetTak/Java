String methods:-

length
Returns the number of characters in the String.

charAt
Returns the character at the index that's passed.

indexOf
lastIndexOf
Returns an integer, representing the index in the sequence where the String or character passed, can be located in the String.

isEmpty
Returns true if length is zero.

isBlank
Returns true if length is zero OR the string only contains whitespace characters, added in JDK 11.

contentEquals
Returns a boolean if the String's value is equal to the value of the argument passed. This method allows for arguments other than String, for any type that is a character sequence.

equals
Return a boolean if the String's value is equal to the value of the argument passed.

equalsIgnoreCase
Return a boolean if the String's value is equal (ignoring case), to the value of the argument passed.

contains
Returns a boolean if the String contains the argument passed.

endsWith
startsWith
These return a boolean, and are much like the contains method, but more specific to the placement of the argument in the String.

regionMatches
Returns a boolean, if defined sub-regions are matched.

indent
This method was added in JDK 15, and adds or removes spaces from the beginning of lines in multi-line text.

strip
stripLeading
stripTrailing
trim
The difference between the strip method and trim method is that the strip() supports a larger set of white space characters. It and the corresponding stripLeading and stripTrailing methods were added in JDK 11.

toLowerCase
toUpperCase
Returns a new String, either in a lower case or in upper case

concat
Similar to the plus operator for strings, it concatenates text to the String and returns a new String as the result.

join
Allows multiple strings to be concatenated together in a single method, specifying a delimiter.

repeat
Returns the String repeated by the number of times specified in the argument.

replace
replaceAll
replaceFirst
These methods replace characters or strings in the string, returning a new String with replacements made.

substring
subSequence
These return a part of the String, its range defined by the start and end index specified.

Some methods unique to the StringBuilder class:-

delete
deleteCharAt
You can delete a substring using indices to specify a range, or delete a single character at an index.

insert
You can insert text at a specified position.

reverse
You can reverse the order of the characters in the sequence.

setLength
setLength can be used to truncate the sequence, or include null sequences to 'fill out' the sequence to that length.

Constructor Overloading
Constructor overloading in Java is the practice of defining multiple constructors within the same class, each with a different parameter list. This allows you to create objects in different ways by providing different sets of parameters.

Constructor Chaining
Constructor chaining is the process of calling one constructor from another constructor within the same class or from a constructor in a superclass. This is typically done using the this() or super() keywords. Constructor chaining helps to reuse code and reduce redundancy.

The @Override annotation in Java is used to indicate that a method is intended to override a method declared in a superclass. This annotation helps to ensure that the method is correctly overriding a method from the superclass and not accidentally creating a new method due to a typo or incorrect method signature.








