package controlstatment;

public class Example4_Nested_if1 
{
   public static void main(String[] args) 
   {
	   int sa=1000;
	if(sa>=10 && sa<=20)//10>20
	
		{
			System.out.println("No delivery charges");
		}
		else if(sa>=20 && sa<=50 )
		{
			System.out.println("golden coffee");
		}
		else if(sa>=60 && sa<=90)//10>=50
		{
			System.out.println(" you will get 10% discount");
		}
		else if(sa>=100 && sa<=120)
		{
			System.out.println("green tea");
		}
	   
	  
	else
	{
		System.out.println("no coffe");
	}
}
	
	
	
	
	
	
}
