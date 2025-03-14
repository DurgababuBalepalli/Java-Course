
class Db
{
	static Db obj;
	private Db()
	{
		
	}
	public static Db gettingobj()   //gettingobj() returns the instance of the class to the outside world.
	{
		if(obj==null)
		{
			obj = new Db();   //create obj if it is not created
		}
		return obj;   //returning singleton obj
	}
	public void yourconnection()
	{
		System.out.println("you got your connection");
	}
}

public class Tk098SigletonClassExample {

	public static void main(String[] args) {
		 //System.out.println(Db.gettingobj());
		Db ref = Db.gettingobj();
		ref.yourconnection();

	}

}

//singleton class Explanantion

//a class must ensure that only single instance should be created and single object can be used by all other classes.
/*
public class Hello {

	public static void main(String[] args) {
		Hold obj = new Hold();   //this is our instance.simply obj
		Hold obj1 = new Hold(); //it is another instance.it can hold different values.but i want this object also have same value.i don't want new values here.
	}

}

class Hold
{
	//first step - create static instance
	static Hold obj = new Hold();  //When you want to have a variable that always has the same value for every object of the class, forever and ever, make it static
								  //so you can create any no of references but the values should always same.
	
	private Hold();   //by default default constructor is public.if i make private i cannot call constructor
	
	public static Hold getobject()   //Static methods are the methods in Java that can be called without creating an object of class. They are referenced by the class name itself
	{
		return obj;
	}
} */

//first step explanantion
/*
	class Ex
{
	int a = 5;
}
public class Stat {

	public static void main(String[] args) {
		Ex obj = new Ex();
		Ex obj1 = new Ex();
		
		System.out.println(obj.a);
		System.out.println(obj1.a);
		obj1.a = 9;
		System.out.println(obj.a);
		System.out.println(obj1.a);
	}

}
*/

//second step
/*
class Ex
{
	int a = 5;

	private Ex(int a) 
	{
		this.a = a;
	}
	
}
public class Stat {

	public static void main(String[] args) {
		Ex obj = new Ex(45);
		Ex obj1 = new Ex(50);
		
		System.out.println(obj.a);
		System.out.println(obj1.a);
	}

}
*/

//third step
/*
class Ex
{
	static int i = 5;
	
}
public class Stat {

	public static void main(String[] args) {
		System.out.println(Ex.i);
	}

}
*/


//Singletons can be used while working with databases. 
//They can be used to create a connection pool to access the database while reusing the same connection for all the clients

//Example
/*
class Db
{
	static Db obj;
	private Db()
	{
		
	}
	public static Db gettingobj()   //gettingobj() returns the instance of the class to the outside world.
	{
		if(obj==null)
		{
			obj = new Db();   //create obj if it is not created
		}
		return obj;   //returning singleton obj
	}
	public void yourconnection()
	{
		System.out.println("you got your connection");
	}
}
public class Stat
{
	public static void main(String[] args)
	{
		 //System.out.println(Db.gettingobj());
		Db ref = Db.gettingobj();
		ref.yourconnection();
	}
}
*/

/*
class Db
{
	static Db obj = new Db();   //think you don't have connection.so iam creating object
	private Db()
	{
		
	}
	public static Db gettingobj()   //gettingobj() returns the instance of the class to the outside world.
	{
		return obj;   //returning singleton obj
	}
	public void yourconnection()
	{
		System.out.println("you got your connection");
	}
}
public class Stat
{
	public static void main(String[] args)
	{
		 //System.out.println(Db.gettingobj());
		Db ref = Db.gettingobj();
		ref.yourconnection();
	}
}

*/
