package Stringclass;

public class Sample4 
{

	public static void main(String[] args) 
	{
		//object creation of string without new keyworld--> constant pool area
		String s1="abc";
		                   //same info in one object present then no other objectj creation.
		String s2="abc";   //duplicate object not allow to string pool area   
		
		String s3="abc1";  //abc 1 not present other object 
		
		
		//object creation of string using new keyword--> non-constant pool area
		
		String s4=new String("abc");
		
		String s5=new String("abc");
		
		
		System.out.println(s1==s2);  //True address comparison address same it shows True
		System.out.println(s1==s3);  //false
		System.out.println(s1==s4);  //false
		System.out.println(s4==s5);  //false
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
