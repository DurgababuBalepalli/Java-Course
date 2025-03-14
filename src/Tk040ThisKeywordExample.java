
class Key
{
	int value;     //instace variable
	Key(int value)
	{
		this.value = value;   //value is local variable.local variable is assiging to local variable.to say leftside value is instance variable,use this keyword.
	}
}
public class Tk040ThisKeywordExample {

	public static void main(String[] args) {
		Key obj = new Key(5);
		System.out.println(obj.value);

	}

}
