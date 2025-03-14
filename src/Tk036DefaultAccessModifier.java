

//if you use default within the package it is accessible
class Hola
{
	void message()
	{
		System.out.println("this is Default");
	}
}

public class Tk036DefaultAccessModifier {

	public static void main(String[] args) {
		Hola obj = new Hola();
		obj.message();

	}

}
