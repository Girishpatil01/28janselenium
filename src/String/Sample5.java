package String;

public class Sample5 
{
public static void main(String[] args) 
{
	
	
	String s1="Velocity";
	String s2="";
	String s3="abcd";
	String s4="ABCD";
	String s5="my name is abcd";
	
	
	System.out.println(s1.charAt(4));               //c
	
	System.out.println("----------");
	  
	// s1=s1.toUpperCase();                       //VELOCITY
	//System.out.println(s1);
	
	System.out.println(s1.toUpperCase());           //VELOCITY
	
	//S4=S4.toLowerCase();
	//System.out.println(s4);
	
	System.out.println(s4.toLowerCase());            //abcd
	
	System.out.println("--------");
	
	
	System.out.println(s3.equals(s4));               //false
	System.out.println(s1.equalsIgnoreCase(s4));    //true
	
	System.out.println(s5.contains("is"));
	
   System.out.println(s1.length());   //8
   System.out.println(s1.isEmpty());  //false
   System.out.println(s2.isEmpty());
	
}
	
	
}
