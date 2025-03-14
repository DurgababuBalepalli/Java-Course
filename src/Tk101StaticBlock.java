
public class Tk101StaticBlock {
	//static is executed before the main method at the time of classloading.
	static
	{
		System.out.println("iam static block");
	}
	public static void main(String[] args) {
		System.out.println("hey iam main");

	}

}
