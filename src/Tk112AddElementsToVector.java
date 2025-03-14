import java.util.Vector;

public class Tk112AddElementsToVector {

	public static void main(String[] args) {
		Vector<String> animals = new Vector<>();
		animals.add("dog");
		animals.add("cat");
		animals.add("buffalo");
		animals.add("tiger");
		
		//at perticular index
		animals.add(2, "donkey");

	}

}
