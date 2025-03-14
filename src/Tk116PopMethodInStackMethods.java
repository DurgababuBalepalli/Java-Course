import java.util.Stack;

public class Tk116PopMethodInStackMethods {

	public static void main(String[] args) {
		Stack<String> pets = new Stack<>();
		pets.push("dog");
		pets.push("cat");
		pets.push("hen");
		
		//removes an element from top of the stack
		pets.pop();
		System.out.println(pets);  //on the top hen is present(i.e last inserted element)

	}

}
