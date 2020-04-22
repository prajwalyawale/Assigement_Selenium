package ArrayListExample;

import java.util.ArrayList;

public class BasicMethodArrayList {


	public static void main(String[] args) {

//addAll()
		
		ArrayList ar=new ArrayList();
		ar.add("QA");
		ar.add("Dev");
		ar.add("Robot");
		
		ArrayList ar1=new ArrayList();
		ar1.add("Selenium");
		ar1.add("QTP");
		ar1.add("Test");
		
		 ar1.addAll(ar);
		
	for (int j = 0; j < ar1.size(); j++) {
		System.out.println(ar1.get(j));
		
	}	
	
	System.out.println("***************");
	
	//RemoveAll
	ar1.removeAll(ar);
	
	
	for (int j = 0; j < ar1.size(); j++) {
		System.out.println(ar1.get(j));
		
	}
	
	System.out.println("***************");
	
	//RetainAll - common value from both arraylist
	
	ArrayList ar3=new ArrayList();
	ar3.add("Test");
	ar3.add("Dev");
	ar3.add("Robot");
	
	ArrayList ar4=new ArrayList();
	ar4.add("Selenium");
	ar4.add("QTP");
	ar4.add("Test");
	
	 ar4.retainAll(ar3);
	
for (int j = 0; j < ar4.size(); j++) {
	System.out.println(ar4.get(j));
	
}	
		
	}

}
