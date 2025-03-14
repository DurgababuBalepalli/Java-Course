
class MethArg
{
	public void meth(int i,int j)
	{
		System.out.println("Arguments are passed!!");
	}
}
public class Tk024MethodWithArguments {

	public static void main(String[] args) {
		MethArg obj = new MethArg();
		obj.meth(4, 5);

	}

}
