package stringsPractice;

import java.util.EnumMap;

class Hello {
	enum Days
	{
		Sun,Mon,Tue,Wed;
	}
	public static void main(String[] args) 
	{
		EnumMap<Days,Integer> week =new EnumMap<>(Days.class);
		//using put
		week.put(Days.Sun, 1);
		week.put(Days.Mon, 2);
		week.put(Days.Wed, 3);
		System.out.println(week);
		
		//using putall
		EnumMap<Days,Integer> week1 =new EnumMap<>(Days.class);
		week1.putAll(week);
		
		week1.put(Days.Tue, 5);
		System.out.println(week1);
		
		System.out.println(week.entrySet()); //using entry set
		System.out.println(week.keySet());  //using keyset
		System.out.println(week.values());  //using values
		
		System.out.println(week.get(Days.Wed));  //using get
		
		week.remove(Days.Sun);  //removing by single parameter
		week.remove(Days.Mon, 2);  //removing by Two parameter.
		
		week.replace(Days.Wed, 4);  //replace
		System.out.println(week);
		
		//replaceAll- replaces each value of the map with the result of the specified function
		week.replaceAll((key,oldValue) -> oldValue*10);
		System.out.println(week);
	}
		
}
