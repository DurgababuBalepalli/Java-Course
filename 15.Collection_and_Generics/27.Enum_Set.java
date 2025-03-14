package stringsPractice;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;



class Hello {
	enum Days
	{
		Sun,Mon,Tue,Wed;
	}
	public static void main(String[] args) {
		
		EnumSet<Days> week = EnumSet.allOf(Days.class);
		System.out.println(week);
		
		//The noneOf() method creates an empty enum set
		EnumSet<Days> week1 = EnumSet.noneOf(Days.class);
		System.out.println(week1);
		//We can only insert elements of enum type Size in the above program. It's because we created our empty enum set using Size enum.
		
		//Using range(e1, e2) Method
		//The range() method creates an enum set containing all the values of an enum between e1 and e2 including both values.
		EnumSet<Days> week2 = EnumSet.range(Days.Mon, Days.Wed);
		System.out.println(week2);
		
		//The of() method creates an enum set containing the specified elements
		EnumSet<Days> week3 = EnumSet.of(Days.Mon);
		System.out.println(week3);
				
		EnumSet<Days> week4 = EnumSet.of(Days.Mon, Days.Wed);
		System.out.println(week4);
		
		week.add(Days.Mon);     //using add method
		week.add(Days.Wed);
		System.out.println(week);
		
		//using Addall - addAll() inserts all the elements of the specified collection to the set
		EnumSet<Days> week5 = EnumSet.noneOf(Days.class);
		week5.add(Days.Sun);
		week5.addAll(week);
		System.out.println(week5);

		week.remove(Days.Sun);  //using remove
		System.out.println(week);
		
		week.removeAll(week);   //removeall using.removes everything
		System.out.println(week);
	}
}
