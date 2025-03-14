class Hey
{
	public void meth()
	{
		System.out.print("iam one");
	}
}
class May extends Hey
{
	@Override
	public void meth()
	{
		System.out.print("iam second");
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		May obj = new May();
		obj.meth();
	}
}
//suppose assume your intension is 2nd class method with first one.but you wrote a spelling mistake.but your idle 
// will not show you error.because logical error is complex than runtime error. so use @Override to give warning when you make spelling mistake