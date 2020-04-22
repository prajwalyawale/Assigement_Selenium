package ArrayListExample;

import java.util.ArrayList;

public class NonGeneric {

	public static void main(String[] args)
	{
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
