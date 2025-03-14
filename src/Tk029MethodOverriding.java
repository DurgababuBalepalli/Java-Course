

class Host
{
	public void meth()
	{
		System.out.print("iam one");
	}
}
class May extends Host
{
	@Override
	public void meth()
	{
		System.out.print("iam second");
	}
}
public class Tk029MethodOverriding {

	public static void main(String[] args) {
		May obj = new May();
		obj.meth();

	}

}
