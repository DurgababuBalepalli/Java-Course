interface Pan
{
	public void show();
}
public class Tk091AnnonymousClassInInterface {

	public static void main(String[] args) {
		Pan obj = new Pan()
				{
					public void show()
					{
						System.out.print("Hai");
					}
				};
		obj.show();
	}

}
