//Encapsulation - Binding the data with methods
//generally how we pass the values not correct.the below mensiond way is not correct
/*
class A
{
	String name;
	int id;
}
public class Hello
{
	public static void main(String[] args)
	{
		A obj = new A();
		obj.name = "durga";    //this is wrong approach.we have to use getters and setters methods.
		obj.id = 127;
	}
}
*/

//see the example how we are binding data with public methods
/*
class A
{
	String name;      //name and id is data. eventhough you make private you can get data that is beauty of encapsulation
	int id;
	public void setname(String givenname)    //to receive data setters method
	{
		name  = givenname;
	}
	public String getname()                //to send data getters
	{
		return name;
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		A obj = new A();
		obj.setname("Durgababu");
		System.out.print(obj.getname());
	}
}
*/

//encapsulation is very famous even you dont need to write those gets and sets methods.you can ask your eclips
//give right click go to source and click on generate getters and setters
/*class A
{
	String name;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
} */
/*
class A
{
	private String name;      //name and id is data. eventhough you make private you can get data that is beauty of encapsulation
	private int id;
	public void setname(String givenname)    //to receive data setters method
	{
		name  = givenname;
	}
	public String getname()                //to send data getters
	{
		return name;
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		A obj = new A();
		obj.setname("Durgababu");
		System.out.print(obj.getname());
	}
}
*/
//why we need encapsulation? you can manintain a lock file.and you can check whether the user is logged in or not by writing some conditions
class A
{
	String name;      
	int id;
	public void setname(String givenname)    
	{
		name  = givenname;
		System.out.println("name is changed"); //this is lock file.you can easily know whether value is changing or not
	}
	public String getname()                
	{
		System.out.println("user accessing value"); //this is also a lock file
		return name;
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		A obj = new A();
		obj.setname("Durgababu");
		System.out.print(obj.getname());
	}
}