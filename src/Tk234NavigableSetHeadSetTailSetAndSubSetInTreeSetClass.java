import java.util.TreeSet;

public class Tk234NavigableSetHeadSetTailSetAndSubSetInTreeSetClass {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		numbers.add(2);

		System.out.println(numbers.headSet(4));
		System.out.println(numbers.headSet(4,true));
		
		System.out.println("-----------------TAILSET----------------");
		System.out.println(numbers.tailSet(4));
		System.out.println(numbers.tailSet(4,false));
		
		System.out.println("-----------------SUBSET----------------");
		System.out.println(numbers.subSet(2, 5));
		System.out.println(numbers.subSet(2,false,5,true));
	}

}
