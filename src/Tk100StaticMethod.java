class Collage
{
	static String collage = "ramer";
	
	//static method to change the value of static variable  
	static void changingMeth()
	{
		collage = "RGUKT";
	}
}

public class Tk100StaticMethod {

	public static void main(String[] args) {
		Collage.changingMeth(); //for static methods we dont require to create obj.
		System.out.println(Collage.collage);

	}

}
