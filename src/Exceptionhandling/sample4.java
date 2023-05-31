package Exceptionhandling;

public class sample4 
{
    public static void main(String[] args)
    {
    	
    int [] ar= {40,20,10,30};	
    	
    	try
    	{
    		System.out.println(ar[9]);
    	}
    	catch(ArrayIndexOutOfBoundsException s1)    //ArithmeticException
    	{
    		
    		//System.out.println(ar[0]);   //Alternate solution
    		System.out.println("ArrayIndexOutOfBoundsException handled");
    	} 
    	
    	
    	System.out.println("good night");
    	
		
	}
	
	
}
