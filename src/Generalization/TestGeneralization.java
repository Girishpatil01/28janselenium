package Generalization;

public class TestGeneralization 
{
public static void main(String[] args) 
{
	System.out.println("Feature of Jio simcard");
    Jio j=new Jio();
    j.featureA();
    j.sms();
    j.ac();
    j.data();
    
    System.out.println("feature of VI simcard");
    VI v=new VI();
    v.featureB();
    v.sms();
    v.ac();
    v.data();
    
    
    
}
}
