

public class Tk030Constructors {
	private String name;
	
	Tk030Constructors()
	{
		System.out.println("hey this is constructor");
		name = "durga";
	}

	public static void main(String[] args) {
		Tk030Constructors obj = new Tk030Constructors();
		System.out.println(obj.name);
	}

}
