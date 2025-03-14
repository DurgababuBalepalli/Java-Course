

class MethNoReturn
{
	public void meth(int oldnumber)
	{
		int newnumber = 10;
		System.out.println("result is :"+(oldnumber+newnumber));
	}
}

public class Tk025MethodWithoutReturnType {

	public static void main(String[] args) {
		MethNoReturn obj = new MethNoReturn();
		obj.meth(5);

	}

}
