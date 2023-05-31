package Inheritance;

public class HirarchicleInherance 
{
  public static void main(String[] args) 
  {
	 System.out.println("---Features of son1---");
	  son1 s1=new son1();
	  s1.bike();
	  s1.car();
	  s1.money();
	  s1.home();
	  
	  System.out.println("---Features of son2---");
	  son2 s2=new son2();
	  s2.mobile();
	  s2.car();
	  s2.home();
	  s2.money();
	  
	  
	  System.out.println("---Features of son3---");
	  son3 s3=new son3();
	  s3.Laptop();
	  s3.car();
	  s3.home();
	  s3.money();
	
  }
	
}
