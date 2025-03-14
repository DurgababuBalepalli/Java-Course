

class Ambiguity
{
	String name;     //instace variable
	Ambiguity(String name)
	{
		this.name = name;   //value is local variable.local variable is assiging to local variable.to say leftside value is instance variable,use this keyword.
	}
}
public class Tk041ThisKeywordForAmbiguityVariables {

	public static void main(String[] args) {
		Ambiguity obj = new Ambiguity("hello world");
		System.out.println(obj.name);
	}

}
