import java.util.Stack;

public class Tk115PushMethodInStackMethods {

	public static void main(String[] args) {
		
		Stack<String> pets = new Stack<>();
		/*pets.add("dog");
		pets.add("cat");
		pets.add("cock");
		pets.add("hen"); */
		
		pets.push("dog");
		pets.push("cat");
		pets.push("hen");
		
		System.out.println(pets);
		
		//What is the difference between push and add in stack?
		//push() return the object you are pushing. s. add() always return true.
		System.out.println(pets.push("hola"));
		System.out.println(pets.add("jack"));
		
	}

}
