package Constructor;

public class sample8 
{
	// user define constructor --> multiple constructor
	
	int num1;
	int num2;
	
	//user define without /zero parameter constructor
	
	sample8()
	{
		num1=10;
		num2=20;
	}
	
	// user define with 2 int, int parameter constructor
	
	sample8(int a,int b)
	{
		num1=a;
		num2=b;
	}
	
	public void add()
	{
		System.out.println(num1+num2);
	}
	
	
	public static void main(String[] args) 
	{
		sample8 s8=new sample8();
		s8.add();   //30
	}
	
	
	
}
