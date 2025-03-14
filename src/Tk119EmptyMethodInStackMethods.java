import java.util.Stack;

public class Tk119EmptyMethodInStackMethods {

	public static void main(String[] args) {
		//To check whether a stack is empty or not, we use the empty() method
		Stack<String> pets = new Stack<>();
		pets.push("dog");
		pets.push("cat");
		pets.push("hen");
		
		System.out.println(pets.isEmpty());

	}

}
