package Exceptionhandling;

public class example6 
{
 public static void main(String[] args) 
 {
   String s1="abcd";           //It handle all types of data(super exception)
   
   try
   {
	   System.out.println(s1.charAt(5)); //risky code
   }
	catch(Exception e) //It handle all types of data(super exception)
   {
		e.printStackTrace();  //which type of exception line 11
		System.out.println("generic exception handled");
   }
	 
	 
	 System.out.println("Hi");
	 System.out.println("Hello");
	 
	 
	 
	 
	 
 }
	
}
