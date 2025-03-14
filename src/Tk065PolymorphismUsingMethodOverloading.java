class Subject
{
	public void sub()
	{
		System.out.println("iam Telugu");
	}
	public void sub(String lang)
	{
		System.out.println("iam :"+lang);
	}
}
public class Tk065PolymorphismUsingMethodOverloading {

	public static void main(String[] args) {
		Subject obj = new Subject();
		obj.sub("english");

	}

}
