import java.util.ArrayList;
import java.util.List;

//first understand how toSting method works.

class Students
{
	int rollno;
	String name;
	int age;
	
	public Students(int rollno,String name,int age)
	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	//overriding toString method
	public String toString()
	{
		return rollno+" "+name+" "+age;
	}

	
}
public class Hello
{
	public static void main(String[] args)
	{
		
		//if you want to represent any object as a string tostring method is so useful.if you want to print any object java compiler internally 
		// invokes toString method on an object.so overriding toString method returns the desired output that means state of an object etc..
		
		Students s1 = new Students(1,"durga",21);
		System.out.println(s1);   //here compiler writes s1.toString(); because of writing compiler that method we are getting "Students@3fee733d". it is the hashcode value of an object.but i want values of it
								  //so by overriding tostring method we will get our desired output
	}
}



//using comparable interface
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students>
{
	int rollno;
	String name;
	int age;
	
	public Students(int rollno,String name,int age)
	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	//overriding toString method
	public String toString()
	{
		return rollno+" "+name+" "+age;
	}

	//in comparable interface we have method compareTo
	public int compareTo(Students s)
	{
		//based on age iam sorting
		//return age > s.age?1:-1;   //think it is working like self join.
		return name.length() > s.name.length()?1:-1;   //based pn lenght of the name
	}
	
}
public class Hello
{
	public static void main(String[] args)
	{
		//List<Integer> mylist = new ArrayList<>();  
		List<Students> mylist = new ArrayList<>();                   //in place of integer class,iam passing my own class to the list
		mylist.add(new Students(1,"durga",22) );                                  //iam passing elements through constructor
		mylist.add(new Students(2,"yakob",20));
		mylist.add(new Students(3,"siri",15));

		Collections.sort(mylist);  //it is showing sort is not applicable for students collection. because we should have comparable inteface to do that
		
		for(Students i: mylist)
		{
			System.out.println(i);
		}
	}
}


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//if in future i dont want to change class name.but i want to sort.then use lambda expression
class Students implements Comparable<Students>
{
	int rollno;
	String name;
	int age;
	
	public Students(int rollno,String name,int age)
	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	//overriding toString method
	public String toString()
	{
		return rollno+" "+name+" "+age;
	}

	//in comparable interface we have method compareTo
	public int compareTo(Students s)
	{
		return age;
	}
	
}
public class Hello
{
	public static void main(String[] args)
	{
		List<Students> mylist = new ArrayList<>();                   //in place of integer class,iam passing my own class to the list
		mylist.add(new Students(1,"durga",22) );                                  //iam passing elements through constructor
		mylist.add(new Students(2,"yakob",20));
		mylist.add(new Students(3,"siri",15));

		Collections.sort(mylist, (i,j)->i.age>j.age?1:-1);
		
		for(Students i: mylist)
		{
			System.out.println(i);
		}
	}
}

//comparator in detail

//Hola class
package stringsPractice;

import java.util.Comparator;
import java.util.List;

public class Hola implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}

//Hello class
package stringsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Hello 
{
	public static void main(String[] args)
	{
		List<Integer> mylis = new ArrayList<>();
		mylis.add(4);
		mylis.add(9);
		mylis.add(1);
		mylis.add(5);
		mylis.add(8);
		
		//now i want to sort without using sort method.so have take Hola class and impleted comparator interface
		Comparator<Integer> mycom = new Hola();
		Collections.sort(mylis, mycom);
		
		for(int i:mylis)
		{
			System.out.println(i);
		}
	}