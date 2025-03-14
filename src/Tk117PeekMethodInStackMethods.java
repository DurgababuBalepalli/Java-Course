import java.util.Stack;

public class Tk117PeekMethodInStackMethods {

	public static void main(String[] args) {
		Stack<String> pets = new Stack<>();
		pets.push("dog");
		pets.push("cat");
		pets.push("hen");
		
		//peek method return an element from top of the stack
		System.out.println(pets.peek()); 
		

	}

}
