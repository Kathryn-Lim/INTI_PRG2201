/*In Java, errors are handled by an Exception object. 
Exceptions are said to be thrown, and it's your job to catch them.
You can do this with a try … catch block. 
The try … catch block looks like this:
try {

}

catch ( ExceptionType error_variable ) {

}
*/
/*
The try part of the try … catch block means "try this code". 
If something goes wrong, Java will jump to the catch block. 
It checks what you have between the round brackets to see 
if you have handled the error. 
If you have the correct Exception type 
then whatever code you have between the curly brackets of catch
will get executed. 
If you don't have the correct Exception type 
then Java will use its default exception handler 
to display an error message.
*/

package exceptionhandling;

//Example 1
public class ErrorHandlingExample1 {

    public static void main(String[] args) {
        
   try {
       
    int x = 10;
    int y = 0;
    int z = x / y;

    System.out.println( z );
}
//catch ( Exception err ) // any error
catch (ArithmeticException err)   // specific error
{ //In this case we are using the Exception error  
System.out.println( err.getMessage( ) );
}
    //getMessage is a method available to Exception objects. 
    //As its name suggests, it gets the error message associated
    //with the Exception.    
    }
    
}

