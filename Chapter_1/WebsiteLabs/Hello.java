/*
* Hello.java                                            Hello
*
*  Author: Shardul Vaidya (5herlocked)                  Date:8/18/17
*
* Print a Hello, World message.
*/

public class Hello {
    public static void main (String [] args){

        System.out.println ("Hello, World!");

        /*
        2. We get a compile time error that says that class Helo should be saved as
            Helo.java not Hello.java.

        3. No change, just the output becomes Helo, World!

        4. Missing string end and then considers all of the progrma a literal string
            and gets a compile time error.

        5. Considers the ending quotation mark to be the start and treats the rest of the
            program as literal strings and gets compile time errors.
        
        6. Considers the rest of the code to be an extension of the "System.out.println" 
            statement and gets a compile time error and syntax error which states that 
            there is a ";" expected
            at the end of the statement.
        */

    }
}