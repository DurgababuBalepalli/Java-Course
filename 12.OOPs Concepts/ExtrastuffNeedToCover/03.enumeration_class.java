//in java 1.0 there are no enums.in 1.5 introduced.
//enum is range of constants for ex:days of week(sun,mon,tue...sat),months in the year(jan,feb...dec)
/*
enum Days
{
	Sun,Mon,Tue,Wed,Thurs,Fri,Sat;
}
public class Tk092EnumExample {

	public static void main(String[] args) {
		System.out.println(Days.Sun);
		System.out.println(Days.Mon);

	}
}
*/

//we can create enum  inside the class also.in previous we have created enum outside the class.but you can't define inside method.
public class Tk092EnumExample {
	enum Days
	{
		Sun,Mon,Tue,Wed,Thurs,Fri,Sat;
	}
	
	public static void main(String[] args) {
		System.out.println(Days.Sun);
		System.out.println(Days.Mon);

	}
}

//Enum internal working and using enum with switch

/*
enum Phones
{
	Apple,Realme,Samsung;
}
public class Tk093EnumWithSwitch
{
	public static void main(String[] args)
	{
		Phones pn = Phones.Apple; //now this pn represent Apple.if you change samsung it will go to case2
		switch(pn)
		{
			case Apple : System.out.println("Apple is highly cost");
						 break;
			case Samsung : System.out.println("samsung is cheap");
							break;
		}
	}
} 

*/

//what happening behind the seen.

/* class Phones     //whenever you create enum class it will create class
   {
 		static final Phones Apple = new Phones(); //whenever you want Apple you should always use Mobile.because it is static
 		static final Phones Realme = new Phones();
 		static final Phones Samsung = new Phones();
    }  
*/

//since enum is a class we can create methods.

enum Phones
{
	Apple,Realme,Samsung;
	int price = 9;
	public int gettingPrice()
	{
		return price;
	}
}
public class Tk093EnumWithSwitch
{
	public static void main(String[] args)
	{
		//if you want to access methods we have already objects
		//static final Phones Apple = new Phones();  etc.by using those obects you can
		System.out.println(Phones.Apple.gettingPrice());  //you can use Realme or Samsung objects also
	}
}
 

/*
//we can create variables using enum
enum Day
{
	Sun,Mon,Tue,Wed,Thu,Fri,Sat;
}
class Mine
{
	Day yourDay;   //using Enum name iam creating variable
	public Mine(Day yourDay)  //here type is also Enum name
	{
		this.yourDay = yourDay;
	}
	public void meth()
	{
		switch(yourDay)
		{
			case Sun : System.out.println("your day is Sunday so 1st day");
					   break;
			case Mon : System.out.println("your day is Monday so 2nd day");
			   		   break;
			case Tue : System.out.println("your day is Tueday so 3rd day");
			   		   break;
			case Wed : System.out.println("your day is Wednesday so 4th day");
			   		   break;
			case Thu : System.out.println("your day is Thursday so 5th day");
			   		   break;
			case Fri : System.out.println("your day is Friday so 6th day");
			           break;
			case Sat : System.out.println("your day is Satday so 7th day");
			   		   break;
		}
	}
}	
public class Tk093EnumWithSwitch 
{

	public static void main(String[] args) 
	{
		Mine obj = new Mine(Day.Wed);   //passing also by using Enum name
		obj.meth();
	}
}
*/

//more about enum class

//enum extends the  abstract class Enum. so it has so many methods to work.

enum Months implements Gov  
{
	Jan,Feb,Mar,Apr,May;
	public void meth()
	{
		switch(this)     //this refers Mar object
		{
			case Jan : System.out.println("1st month");
			   		   break;
			case Feb : System.out.println("2nd month");
					   break;
			case Mar : System.out.println("3rd month");
					   break;
			case Apr : System.out.println("4th month");
					   break;
			case May : System.out.println("5th month");
		}
	}
	
}
public class Tk094EnumClassExample {

	public static void main(String[] args) {
		Months.Mar.meth();   //using enumeration class name iam calling.Mar goes this in the method meth.
		
		System.out.println(Months.Mar.ordinal());  //ordinal gives position of constant.Mar present in 2nd position
		
		Months array[] = Months.values();   //values() method fetches all values from enum
		for(Months m:array )
		{
			System.out.println(m);
		}
		
		
	}

} 

//enum class can implement interface but cannot extends another class because it is already extending by abstract enum class
interface Gov
{
	
}
enum Month implements Gov    //try with extends gives you error
{
	Jan,Feb,Mar,Apr,May;
	public void meth()
	{
		switch(this)     //this refers Mar object
		{
			case Jan : System.out.println("1st month");
			   		   break;
			case Feb : System.out.println("2nd month");
					   break;
			case Mar : System.out.println("3rd month");
					   break;
			case Apr : System.out.println("4th month");
					   break;
			case May : System.out.println("5th month");
		}
	}
	
}

//Enum Constructor
//when you define enum indirectly enum get converted into class.inside class we have multiple objects
//static final mobiles Redme = new mobiles();
//static final mobiles Realme = new mobiles();  //in this way they created

/*
enum mobiles
{
	Redme,Realme,Sony,Vivo;
	
	int price;
	public int gettingprice()
	{
		return price;
	}
	
	//now i will give constructor here
	mobiles()
	{
		price = 29;  //so this 29 assined to all the constants Redme,Realme,Sony,Vivo;
		System.out.println("constructor calls all objects");  //no of constants difines no of constuctors. 4 constants present so 4 constructors.
	}
	
}
public class Tko95EnumConstructor {

	public static void main(String[] args) {
		System.out.println(mobiles.Realme.gettingprice());
		System.out.println(mobiles.Redme.gettingprice());
		System.out.println(mobiles.Sony.gettingprice());
		System.out.println(mobiles.Vivo.gettingprice());
		
	}

}
*/

//i dont want every constant taking same value.then you can specify different values
/*
enum mobiles
{
	Redme(100),Realme(500),Sony(50),Vivo(20);   //inside process will be static final mobiles Redme = new mobiles(100); for every mobile it will assigned in the same way.
												//but to access that value we need constuctor
	int price;
	
	public int gettingprice()
	{
		return price;
	}
	
	mobiles(int i)     //realme(500). 500 will come here
	{
		price = i;
	}

}

public class Tko95EnumConstructor {

	public static void main(String[] args) {
		System.out.println(mobiles.Sony.gettingprice());
		
	}

}
*/

//default constuctor calling
/*
enum mobiles
{
	Redme(100),Realme(500),Sony,Vivo(20);  //here sony calls default constuctor.remaining calls parametrized constructor 
	int price;
	
	public int gettingprice()
	{
		return price;
	}
	
	mobiles(int i)     //realme(500). 500 will come here
	{
		price = i;
	}

	mobiles() 
	{
		System.out.println("hey your constant has no value");
	}

}
public class Tko95EnumConstructor {

	public static void main(String[] args) {
		System.out.println(mobiles.Sony.gettingprice());
		
	}

}
*/

enum Fruit1
{
	Apple("red"),Orange("orange"),grape("black");  //these colors got to fruit constructor
	
	String color;
	Fruit1(String color)
	{
		this.color = color;
	}
	
	public String gettingFruitColor()
	{
		return color;
	}
}
public class Tk095EnumConstructor {

	public static void main(String[] args) {
		
		System.out.println(Fruit1.grape.gettingFruitColor());
		
		//you can also access like this
		Fruit1 ref = Fruit1.grape;
		System.out.println(ref.gettingFruitColor());
	}

}

//Enum String Example
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

//enumDefault String value change
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
 
  