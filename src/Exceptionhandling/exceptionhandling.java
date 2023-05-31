package Exceptionhandling;

public class exceptionhandling 
{

	public static void main(String[] args) 
	{
	
		String s3="abcd";
		
		//System.out.println(s3.charAt(6)); //risky code //StringIndexOutofbound Exception 
		
		
		try                    //try block
		{
			System.out.println(s3.charAt(6));  //risky code
		}
		catch(StringIndexOutOfBoundsException e) //which type of exception we espected
		{
			System.out.println("StringIndexOutOfBounds Exception Handled");  //Optinal Statment for developer
		}
		
		
		System.out.println("Hi");
		System.out.println("Hello");
		
	}
}
