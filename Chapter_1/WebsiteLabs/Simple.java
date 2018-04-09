/*
* Simple.java                                           Simple
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/23/17
*
* 1. simple is not legal because, class names have to begin with a capital letter
*
* 2. SimpleProgram is legal and good because, it accurately describes what the class does.
* 
* 3. 1Simple is not legal because, programs must start with an alphabet.
*
* 4._Simple_ is illegal beacuse, "_" is a java reserved character and it isn't an alphabet.
*
* 5.*Simple* is illegal because, "*" isn't an alphabet.
*
* 6.$123_45 is illegal because, a class identifier cannot have a $ as a start letter and because
*   it doesn't describe what the program does.
*
* 7.Simple! is illegal because, class identifiers cannot contain the "!".
*
* Print a simple message about Java
*/

public class Simple {
    public static void main (String [] args){
        
        System.out.println ("Java is great but......" + "\n" +  "C# is better");

    }
}