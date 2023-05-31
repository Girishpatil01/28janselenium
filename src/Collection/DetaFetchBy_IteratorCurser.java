package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DetaFetchBy_IteratorCurser {

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
		
		
		System.out.println("----print deta using Iterator Cursor---");
		 
		Iterator itr = a1.iterator();   //iterator type object. Iterator interface 
		
		while (itr.hasNext())   //deta check hasNext    
			//hasNext mens a1.iterator call This statment  all deta copy itr. 
		{
			System.out.println(itr.next()); //deta print itr.next
		}
		
		
		
		//List Iterator List Iterator use for List Only
		
		System.out.println("---print data using ListIterator cursor--");
		ListIterator litr = a1.listIterator();    //list deta listiterator store 
		
		while(itr.hasNext())  //then each indec deta check 
		{ 
			System.out.println(itr.next());  //deta print
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
