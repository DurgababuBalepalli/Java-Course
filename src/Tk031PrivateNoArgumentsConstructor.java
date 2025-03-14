

public class Tk031PrivateNoArgumentsConstructor {
	
	int i;
	private Tk031PrivateNoArgumentsConstructor()
	{
		i = 5;
		System.out.println("hey iam constructor");
	}

	public static void main(String[] args) {
		Tk031PrivateNoArgumentsConstructor obj = new Tk031PrivateNoArgumentsConstructor();
		System.out.println(obj.i);

	}

}
