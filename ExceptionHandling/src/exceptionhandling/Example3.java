
package exceptionhandling;


public class Example3   {
    public static void main(String args[])
    {
        
       final int page = 2000;
       
       addPage(page);
       
    }
       
    public static void addPage(int page)throws IllegalArgumentException
    {
         int pageCount = 5000;
         if (pageCount > page) {
            throw new IllegalArgumentException(String.format("Page count value [%d] exceeds maximum limit [%d].", pageCount, page));
        }
        pageCount = page;
        System.out.println(pageCount);
    }
        
        
}

    
