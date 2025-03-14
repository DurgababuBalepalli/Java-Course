class Good
{
	protected String collage = "RGUKT";
}
class Bad extends Good
{
	public String collage = "Ramer";
	
	public void meth()
	{
		System.out.println("collage :"+collage);
		System.out.println("super calss data : "+super.collage);
	}
}
public class Tk054SuperclassAttributeAccessing {

	public static void main(String[] args) {
		Bad obj = new Bad();
		obj.meth();

	}

}
