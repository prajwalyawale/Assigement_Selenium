


package ArrayListExample;

import java.util.ArrayList;

public class DynamicArry
{
	
	public static void main(String[] args) {
		
	
	    //int Arr[]=new int[3]; //static in nature - Size is fixed
        //it can store duplicate value/element
		//it maintain insertion order
		
	
	ArrayList<Integer> ar=new ArrayList<Integer>();
	ar.add(10);
	ar.add(20);
	ar.add(30);
	
	System.out.println(ar.size());
	
	ar.add(20);
	ar.add(40);

	
	
	System.out.println(ar.get(4));
	//allows random access to fetch elemrnt because it store value on the bases of index  
	
	for (int i = 0; i <ar.size();i++)
	{
		System.out.println(ar.get(i));
		
	}
	
//generic (Similar time of data we will store like int ) and non generic ArrayList(we can store any time of data in arraylist)
	
ArrayList ar1=new ArrayList();
	
	ar1.add(10);
	ar1.add(22.11);
	ar1.add("Prajwal");
	
	for (int j = 0; j < ar1.size(); j++)
	{
		System.out.println(ar1.get(j));
		
	}
	
	
	
	
	
	}
	

}
