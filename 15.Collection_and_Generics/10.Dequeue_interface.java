import java.util.ArrayDeque;

public class Tk127ImplementationOfDequeInArrayDequeClass {

	public static void main(String[] args) {
		ArrayDeque<Integer> mynums = new ArrayDeque<>();
		mynums.offer(1);
		mynums.offer(10);
		mynums.offer(12);
		mynums.offer(6);
		
		//access elemets of deque
		System.out.println(mynums.peekFirst()); //gives firt element of deque  //1
		System.out.println(mynums.peekLast()); //last element of deque  //6
		
		//removing elements in deque
		mynums.pollFirst();  //removes 1
		mynums.pollLast();   //removes 6
		
		System.out.println(mynums);
		
		
	}

}