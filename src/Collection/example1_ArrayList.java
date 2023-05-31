package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class example1_ArrayList {

	public static void main(String[] args) {
	
		
		ArrayList a1=new ArrayList(8);   //by default capacity=10
		a1.add("rahul");
		a1.add(101);
		a1.add(65.5f);  //2
		a1.add("A");
		a1.add(101);   //500
		a1.add(null);  //101
		a1.add(null);  //null
		               //null
		
		

		System.out.println(a1);
		System.out.println(a1.size());    //4 Total num of element 
		System.out.println(a1.isEmpty());  //false
		System.out.println(a1.get(0));
		//System.out.println(a1.get(0));     //rahul
		
		
		//add info  in between array list  --> right shift operatio 
		a1.add(4, 500);
		System.out.println(a1);
		
		
		 //remove info in between arraylist --> Left shift operation perform
		a1.remove(4);
		System.out.println(a1);
	
		
		
		System.out.println("-----print   data using Iterator cursor--------");
		Iterator itr = a1.iterator();  //Iterator one by one deta fetch 
		//aray  data Itetator copy
		while(itr.hasNext())  // If TRue visit body. Then deta print.
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("-----print   data using  List Iterator cursor--------");
		ListIterator list = a1.listIterator();  ////aray  data ListItetator copy
		
		
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		
		
	}

}
