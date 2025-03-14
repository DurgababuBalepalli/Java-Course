

public class Tk033ParameterizedConstructor {
	String name;
	Tk033ParameterizedConstructor(String name)
	{
		this.name = name;
	}

	public static void main(String[] args) {
		
		Tk033ParameterizedConstructor obj = new Tk033ParameterizedConstructor("durga");
		System.out.println(obj.name);

	}

}
