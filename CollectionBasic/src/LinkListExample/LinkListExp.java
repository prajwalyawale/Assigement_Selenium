package LinkListExample;

import java.util.LinkedList;

public class LinkListExp {

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add("Demo_Lis");
		ll.add("Selenium");
		ll.add("Test");
		ll.add("QTP");
		
		System.out.println("Contain in array :"+ll );
		
		//addFirst
		
		ll.addFirst("Prajwal");
		
		//addLast
		ll.addLast("LastArryElement");
		
	System.out.println("Add First and Last Element in list : "+ll);
	
	//get:
	
	System.out.println(ll.get(0));
	
	//set :
	ll.set(0, "DBA");
	System.out.println(ll.get(0));
	
	//remove first and last element
	
	ll.removeFirst();
	
	ll.removeLast();
	System.out.println("Remove first and last element :"+ll);
	
		
		

	}

}
