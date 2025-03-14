//inheritance
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
class Hello
{
	public static void main(String[] args)
	{
		Advcal obj = new Advcal();
		int result = obj.addition(2, 3);
		System.out.print(result);
	}
}

//REMEMBER : Java doesn't support multiple inheritance.
//ther are two relations when you talk about inheretance
1.IS-A      //when you extend a class you will say class A is extending class B. ex : class Adcal is extending Cal
2.HAS-A     //when you talk about obj you will use it. ex : class Advcal has two methods add and subtraction