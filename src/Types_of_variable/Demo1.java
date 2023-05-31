package Types_of_variable;

public class Demo1 
{
     int b=20;    //globle variable
	
    public void m1()
    {
      int a=10;     //local variable
      System.out.println(a);
      System.out.println(b);//10
    }
	
    public void m2()
    {
    	//System.out.println(a);
    	System.out.println(b);     //globle variable call method m1& m2
    }
	public static void main(String[] args) 
	{
		Demo1 d1=new Demo1();
		d1.m1();
		d1.m2(); 
	}
	
	
	
	
	
	
	
	
}
