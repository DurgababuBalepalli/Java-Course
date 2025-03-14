class Apple
{
	protected String name;  //protected variable member
	
	protected void showme()
	{
		System.out.println("this is protected Apple class method");
	}
}
class Fruit extends Apple
{
	public void give()
	{
		System.out.println("name is : "+name);
	}
}
public class Tk052ProtectedMembersInInheritance {

	public static void main(String[] args) {
		Fruit obj = new Fruit();
		obj.name = "ramer";     //using object of subclass iam accessing protected members
		
		obj.give();

	}

}
