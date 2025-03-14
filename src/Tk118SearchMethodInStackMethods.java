import java.util.Stack;

public class Tk118SearchMethodInStackMethods {

	public static void main(String[] args) {
		//To search an element in the stack, we use the search() method. 
		//It returns the position of the element from the top of the stack.
		
		Stack<String> pets = new Stack<>();
		pets.push("dog");
		pets.push("cat");
		pets.push("hen");
		pets.push("dinosour");
		
		System.out.println(pets.search("cat")); //from top of the stack cat is 3rd element 

	}

}
