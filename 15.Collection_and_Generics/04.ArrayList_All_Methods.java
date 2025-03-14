package stringsPractice;

import java.util.ArrayList;
import java.util.Comparator;

public class Hello {

	public static void main(String[] args) 
	{
		//creating ArrayList
		ArrayList<String> phones = new ArrayList<>();
		phones.add("samsung");
		phones.add("apple");
		phones.add("realme");
		phones.add("redmi");
		phones.add("micromax");
		phones.add("lava");
		phones.add("technospark");
		phones.add("lava");
		
		//get - accessing element using get
		System.out.println(phones.get(2));
		System.out.println(phones.get(3));
		System.out.println(phones.get(1));
		
		//set - to change perticular element in Array list we have to use set method
		phones.set(1, "Nokia");
		System.out.println(phones);
		
		//size()-Returns the length of the arraylist.
		System.out.println(phones.size());
		
		//isEmpty()	- Checks if the arraylist is empty or not
		System.out.println(phones.isEmpty());
		
		//indexOf()	Searches a specified element in an arraylist and returns the index of the element.
		System.out.println(phones.indexOf("lava"));
		
		//ensureCapacity()	- Specifies the total element the arraylist can contain.
		phones.ensureCapacity(10);
		
		//sort() -	Sort the arraylist elements.
		phones.sort(Comparator.naturalOrder());  //gives elements in ascending order
		System.out.println(phones);
		
		//toArray()  - converts an arraylist into an array and returns it.
		System.out.println("------------------toArray with parameter----------");
		String[] arr  = new String[phones.size()]; //creating same size array as Arraylist
		phones.toArray(arr); //iam using arr.meansiam using parameter to toArray
		
		for(String s:arr)
		{
			System.out.println(s);
		}
		
		System.out.println("------------------toArray without parameter----------");
		Object[] arr1 = phones.toArray();   //iam using object array directly
		for(Object myobj:arr1)
		{
			System.out.println(myobj);
		}
		
		//toString() - converts an arraylist into a String.
		System.out.println(phones.toString());
		
		//The addAll() method adds all the elements of a collection to the arraylist.
		ArrayList<String> smartphones = new ArrayList<>();
		smartphones.add("Apple iphone");
		
		smartphones.addAll(phones);  //now smartphones contains all data of phones.check it by using loop.
		
		//clone()-method makes the shallow copy of an array list.
		Object o = phones.clone();  //clone()  returns an object.
		System.out.println(o);
		
		System.out.println(phones.clone());  //check here what clone() is returning
		
		System.out.println("----------USING NEW ARRAYLIST TO CLONE------");
		ArrayList<String> mobiles = (ArrayList<String>) phones.clone(); //iam typecasting from object to arraylist so (ArrayList<String>).because clone retuns object
		System.out.println(mobiles);
		
		//subList() method extracts a portion of the arraylist and returns it.
		System.out.println(phones.subList(1,4)); //perticular index to perticular
		System.out.println(phones.subList(2, phones.size())); //perticular index to end
		
		//lastIndexOf() method returns the position of the last occurrence of the specified element.if element not present returns -1
		System.out.println(phones.lastIndexOf("lava")); //at 0 occured first.at position 1,lava occured last.
		
		//retainall gives intersection of two arraylists.simply gives common elements
		ArrayList<String> mobs = new ArrayList<>();
		mobs.add("lava");
		
		System.out.println(mobs.retainAll(phones));  //returns true if exists common elements
		mobs.retainAll(phones);
		System.out.println(mobs);
		
		//contains() -	Searches the arraylist for the specified element and returns a boolean result.
		boolean b  = phones.contains("lava");
		System.out.println(b);
		
		//containsAll() method checks whether the arraylist contains all the elements of the specified collection.
		System.out.println(mobs.containsAll(phones));  //false
		System.out.println(phones.containsAll(mobs));
		
		//remove
		phones.remove(1);  //by using index you can remove
		System.out.println(phones);
				
		phones.remove("realme"); //by using object also you can remove
		System.out.println(phones);
		
		//removeIf
		phones.removeIf((parameter) -> parameter.contains("lava"));  //you are writing lambda expression
		System.out.println(phones);
		
		//replaceAll
		phones.replaceAll((a) -> a.toUpperCase());
		System.out.println(phones);
		
		phones.replaceAll((a) -> a + "000"); //iam adding
		System.out.println(phones);
		
		//removeAll
		phones.removeAll(phones);
		System.out.println(phones);
		
		//clear is faster than removeAll
		phones.clear();
		System.out.println(phones);
	}
		
}