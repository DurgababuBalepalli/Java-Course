class Frui
{
	int apples;
	int oranges;
	static String collage = "rgukt";
	public Frui(int apples, int oranges) {
		super();
		this.apples = apples;
		this.oranges = oranges;
	}
	
	
}

public class Tk099StaticVariable {

	public static void main(String[] args) {
		Frui obj = new Frui(12,20);
		System.out.println(Frui.collage);
	}

}
