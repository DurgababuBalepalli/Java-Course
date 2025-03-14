package stringsPractice;

import java.util.Stack;
import java.util.Comparator;

//ensureCapacity will not work for Stack.
public class Hello {

	public static void main(String[] args) 
	{
		//creating Stack
		Stack<String> phones = new Stack<>();
		phones.add("samsung");
		phones.add("apple");
		phones.add("realme");
		phones.add("redmi");
		phones.add("micromax");
		phones.add("lava");
		phones.add("technospark");
		phones.add("lava");
		
		System.out.println("-----------STACK SPECIFIC METHODS------------------");
		phones.push("dog");
		phones.push("cat");
		phones.push("hen");
		
		System.out.println(phones);
		
		//What is the difference between push and add in stack?
		//push() return the object you are pushing. s. add() always return true.
		System.out.println(phones.push("hola"));
		System.out.println(phones.add("jack"));
		
		//POP - removes an element from top of the stack
		String s1 = phones.pop();
		System.out.println(s1);  //on the top jack is present(i.e last inserted elemenT)
		
		//peek method return an element from top of the stack
		System.out.println(phones.peek()); 
		
		//Search - To search an element in the stack, we use the search() method.It returns the position of the element from the top of the stack.
		System.out.println(phones.search("cat")); //from top of the stack cat is 3rd element 
		
		//isEmpty() - To check whether a stack is empty or not, we use the empty() method
		System.out.println(phones.isEmpty());  //false
		
		System.out.println("--------------------------------------------------------------");
		
		//get - accessing element using get
		System.out.println(phones.get(2));
		System.out.println(phones.get(3));
		System.out.println(phones.get(1));
		
		//set - to change perticular element in Array list we have to use set method
		phones.set(1, "Nokia");
		System.out.println(phones);
		
		//size()-Returns the length of the Stack.
		System.out.println(phones.size());
		
		//isEmpty()	- Checks if the Stack is empty or not
		System.out.println(phones.isEmpty());
		
		//indexOf()	Searches a specified element in an Stack and returns the index of the element.
		System.out.println(phones.indexOf("lava"));
		
		//sort() -	Sort the Stack elements.
		phones.sort(Comparator.naturalOrder());  //gives elements in ascending order
		System.out.println(phones);
		
		//toArray()  - converts an Stack into an array and returns it.
		System.out.println("------------------toArray with parameter----------");
		String[] arr  = new String[phones.size()]; //creating same size array as Stack
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
		
		//toString() - converts an Stack into a String.
		System.out.println(phones.toString());
		
		//The addAll() method adds all the elements of a collection to the Stack.
		Stack<String> smartphones = new Stack<>();
		smartphones.add("Apple iphone");
		
		smartphones.addAll(phones);  //now smartphones contains all data of phones.check it by using loop.
		
		//clone()-method makes the shallow copy of an array list.
		Object o = phones.clone();  //clone()  returns an object.
		System.out.println(o);
		
		System.out.println(phones.clone());  //check here what clone() is returning
		
		System.out.println("----------USING NEW Stack TO CLONE------");
		Stack<String> mobiles = (Stack<String>) phones.clone(); //iam typecasting from object to Stack so (Stack<String>).because clone retuns object
		System.out.println(mobiles);
		
		//subList() method extracts a portion of the Stack and returns it.
		System.out.println(phones.subList(1,4)); //perticular index to perticular
		System.out.println(phones.subList(2, phones.size())); //perticular index to end
		
		//lastIndexOf() method returns the position of the last occurrence of the specified element.if element not present returns -1
		System.out.println(phones.lastIndexOf("lava")); //at 0 occured first.at position 1,lava occured last.
		
		//retainall gives intersection of two Stacks.simply gives common elements
		Stack<String> mobs = new Stack<>();
		mobs.add("lava");
		
		System.out.println(mobs.retainAll(phones));  //returns true if exists common elements
		mobs.retainAll(phones);
		System.out.println(mobs);
		
		//contains() -	Searches the Stack for the specified element and returns a boolean result.
		boolean b  = phones.contains("lava");
		System.out.println(b);
		
		//containsAll() method checks whether the Stack contains all the elements of the specified collection.
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