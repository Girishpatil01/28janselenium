package Exceptionhandling;

public class example5 
{
	public static void main(String[] args) 
	{
		
		String s1="abcd";
		
		try              //one try block multiple catch block
		{
			//System.out.println(s1.charAt(2));
			System.out.println(s1.charAt(5));   //risky code
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(ArithmeticException e)
		{
			System.out.println( "ArithmeticException handled");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		
		
	    System.out.println("hi");
		System.out.println("hello");
		
				
	} 
	
}
