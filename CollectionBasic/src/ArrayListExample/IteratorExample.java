package ArrayListExample;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	char name;
	int age;
	char dept;
	
	IteratorExample(char name,int age,char dept)
	{
		this.name=name;
		this.age=age;
		this.dept=dept;
	}
	
	public static <E> void main(String[] args)
	{
		ArrayList<E> ar=new ArrayList<E>();  //<E> is generic
 
		//Employee class obj
		Employee e1=new Employee("Prajwal",24,"Dev");
		Employee e2=new Employee("Pranay",23,"Dev");
		Employee e3=new Employee("PK",43,"Dev");
		
		//create arraylist
		
		ArrayList<Employee> ar1=new ArrayList<Employee>();
		
		ar1.add(e1);
		ar1.add(e2);
		ar1.add(e3);
		
		//iterator to traverse 
		Iterator<Employee>it=ar1.iterator();
		
		while(((Iterator<Employee>) it).hasNext())
		{
			Employee emp=((Iterator<Employee>) it).next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		



	}

}
