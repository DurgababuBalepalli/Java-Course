/*
class Pen
{
	public void meth_write()
	{
		System.out.print("iam pen");
	}
}
class Pencil
{
	public void meth_write()
	{
		System.out.print("iam pencil");
	}
}
class Box
{
	public void meth_choose_one(Pen p)  //iam getting obj of Pen.not a value
	{
		p.meth_write();     //using p obj,iam accessing method of Pen
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		Box obj = new Box();
		
		Pen p = new Pen();
		Pencil pc = new Pencil();
		obj.meth_choose_one(p); 
		obj.meth_choose_one(pc);//if you try with pencil obj you wont get beacuse you don't have method to choose pencil(i.e pc.meth_write())
	}
}
*/

//inorder to create multiple methods we can use abstract class to choose anything

/*
class Writing
{
	public void meth_write()
	{
		                                   //you simply make this class abstract
	}
}
class Pen extends Writing
{
	public void meth_write()
	{
		System.out.print("iam pen");
	}
}
class Pencil extends Writing
{
	public void meth_write()
	{
		System.out.print("iam pencil");
	}
}
class Box 
{
	public void meth_choose_one(Writing p)  //iam getting obj of Pen.not a value
	{
		p.meth_write();     //using p obj,iam accessing method of Pen
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		Box obj = new Box();
		
		Writing p = new Pen();
		Writing pc = new Pencil();
		obj.meth_choose_one(p); 
		obj.meth_choose_one(pc);	
	}
} */

//the problem with abstract method is at multiple inheritance.
//for ex : class Pen extends Writing,book.pen wants to extend another class book.of course java will not support multiple inheritance then how you will get
// by using interface you get class Pen extends book implements writing.

//the difference b/w abstration,interfaces is
//abstraction can have abstract method and non abstract method. but in interface by default all are abstract methods.don't need to specify even.
//one more thing is you won't create obj to interface.

interface Purse
{
	void show();  //by default all methods are abstract methods
}
class Hundreds implements Purse
{
	public void show()
	{
		System.out.print("200");
	}
}
public class Hello
{
	public static void main(String[] args)
	{
		Purse obj = new Hundreds();  //it is same like abstraction
		obj.show();
	}
}