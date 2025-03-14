
public class Tk083InstanceOfOperatorExample {

	public static void main(String[] args) {
		String company = "Ramer";
		boolean b1 = company instanceof String;
		System.out.println(b1);
		
		Tk083InstanceOfOperatorExample obj = new Tk083InstanceOfOperatorExample();
		boolean b2 = obj instanceof Tk083InstanceOfOperatorExample;
		System.out.println(b2);

	}

}
