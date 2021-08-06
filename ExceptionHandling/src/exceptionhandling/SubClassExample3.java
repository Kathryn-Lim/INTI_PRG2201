
package exceptionhandling;


public class SubClassExample3 extends Example4
{
    void message1()
    {
        System.out.println("Message 1");
        
        
    }
    
 // when you don’t implement all the abstract method   
    public void message2()throws UnsupportedOperationException  //overriding the message2 method
	{ 
			throw new UnsupportedOperationException("message2 () is not supported by this class");
		}
	
}
