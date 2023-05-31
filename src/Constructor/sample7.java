package Constructor;

public class sample7 
{
     // user define constructor --> multiple constructor

int num1;
int num2;


    //user define without /zero parameter constructor
  sample7()
   {
	  num1=10;
	  num2=20;
   }

  public void add()
  {
	  System.out.println(num1+num2);
  }
  
  public static void main(String[] args) 
  {
	sample7 s7=new sample7();  // creat current class object
    s7.add();
  }
  
  
}
