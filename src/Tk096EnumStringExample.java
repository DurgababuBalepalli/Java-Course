enum Donkey
{
	Child,Parent,Grandparent;
}
public class Tk096EnumStringExample {

	public static void main(String[] args) {
		//toString or name methods give string representation for enum constants.
		System.out.println(Donkey.Child.toString());
		System.out.println(Donkey.Child.name());
	}

}
