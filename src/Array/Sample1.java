package Array;

public class Sample1 
{
public static void main(String[]args)
{

 
          String sname1="rahul";
          String sname2="ganesh";
	
          
       
          //step1: array decleration        //[5] is the length  how many
          String ar []=new String[5];       //information U want to store (size)
          
          //step2: array Initilization
            
          ar[0]="rahul";                      //0 index rahul information store 
	      ar[1]="ganesh";
	      ar[2]="mahesh";
	      ar[3]="suresh";
	      ar[4]="ramesh";
	      
	      
	      
	      System.out.println(ar.length);     //how to print a size of array by using statment of array object name.length
	      
	      
	      //step3: use array 
	       
	      System.out.println(ar[3]);
	      System.out.println(ar[4]);
	      
	     System.out.println("---print all info from String array---");
	     
	     
	     //           1<4           1
	  //   for(int i=0; i<=4; i++)          //0 To 4
	   //  {                         //1
	  //  	 System.out.println(ar[i]);
	  //   }
	      
	     //rahul
	     //ganesh
	     //mahesh
	     //suresh
	     //ramesh
	            
	     
	     //findout last index 
	     for(int i=0; i<=ar.length-1; i++)
	     {
	    	 System.out.println(ar[i]);
	     }    
	     
	     
	     
	     
	     
	 }
	      
}
	
  
	


