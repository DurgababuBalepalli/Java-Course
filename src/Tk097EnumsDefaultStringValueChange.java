enum Monkey
{
	//Child,Parent,Grandparent;
	Child
	{
		//overriding tostring for Child
		public String toString()
		{
			return "hey iam super child";
		}
	}
}
public class Tk097EnumsDefaultStringValueChange {

	public static void main(String[] args) {
		System.out.println(Monkey.Child); //here default you get child.i can change it 

	}

}
