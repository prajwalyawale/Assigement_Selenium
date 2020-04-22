import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Sample {
	
	public static void main(String []argh)
	{
        HashMap<String, Integer> phonebook = new HashMap<>();
        /*System.out.println("Enter value");
		Scanner in = new Scanner(System.in);        
		int n=in.nextInt();
		in.nextLine();*/
        int n=5;
		List<Integer> l= new ArrayList<Integer>();
		/*l.add(5);
		l.add(2);
		l.add(2);
		l.add(4);
		l.add(9);*/
		System.out.println(l.add(n%2==0?n:null));
		System.out.println(l.get(0));
		
		Set s1 = new HashSet<>(l);
		System.out.println("size" + s1.size());
		List<Integer> l1	=Arrays.asList(1,0);
		System.out.println(l1.get(1));
		/*char c;
		
		
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            phonebook.put(name, phone);
			in.nextLine();
		}
       
		while(in.hasNext())
		{
			String s=in.nextLine();
            Set values = phonebook.entrySet();
            Iterator itr = values.iterator();

          while(itr.hasNext())
        {  
            Map.Entry entry=(Map.Entry)itr.next();
            if(entry.getKey().equals(n))
              System.out.println(entry.getValue());
            else
                    System.out.println("Not found");
        }
		}
	}
*/

}
}