class Hey
{
	String myname;
	int id;
	static String collage = "RGUKT-NUZVID"; //when ever you make static it is common sharable for all
}
public class Hello
{
	public static void main(String[] args)
	{
		Hey obj = new Hey();
		obj.id = 127;
		obj.myname = "durgababu";
		
		//you can access static variable with obj and without obj also(using class name).you are fool if you create object eventhough you can access with the class name
		System.out.println(obj.collage);
		System.out.println(Hey.collage);  //so it is preffered way
	}
}

//whenever you have multiple static variables put them in one block
class Hey
{
	String myname;
	int id;
	static String collage;
	static int mess;
	
	static       //static block executes once only whenever you load the class
	{
		collage = "RGUKT";
		mess = 4;
		System.out.println("Static exec");
	}
	
	Hey()      //constructor executes multipletimes based on how many objects you creates 
	{
		id = 1;
		myname = "no name";
		System.out.println("constructor exec");
	}
	
	public void show_meth()
	{
		System.out.println(id);
		System.out.println(myname);
		System.out.println(collage);
	}
	
}
public class Hello
{
	public static void main(String[] args)
	{
		Hey obj = new Hey();
		Hey obj1 = new Hey();
		obj.show_meth();
		obj1.show_meth();
	}
}