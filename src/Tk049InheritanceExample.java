

class Cal     //assume you lost this source code and you have class file(byte code)     //we call Superclass/Parent class/Base class(in c++)
{
	public int addition(int a,int b)
	{
		return a + b;
	}
}
class Advcal extends Cal    //without writing existing one you just extending to use    //sub class/child class/Derived class(in c++)
{
	public int subtraction(int a,int b)
	{
		return a - b;
	}
}
public class Tk049InheritanceExample {

	public static void main(String[] args) {
		Advcal obj = new Advcal();
		int result = obj.addition(2, 3);
		System.out.print(result);

	}

}
