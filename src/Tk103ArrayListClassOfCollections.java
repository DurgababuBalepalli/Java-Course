import java.util.ArrayList;

public class Tk103ArrayListClassOfCollections {

	public static void main(String[] args) {
		ArrayList fruits = new ArrayList();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add(5);   //here iam not giving string.but still is accepting.so i will use generics to make not accept integer values
		
		ArrayList<String> keyboard = new ArrayList<>();
		keyboard.add("dell");
		//keyboard.add(5);  //it wont work.it will give error The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
		System.out.println(fruits);  //doubt which type of it is.
	}

}
