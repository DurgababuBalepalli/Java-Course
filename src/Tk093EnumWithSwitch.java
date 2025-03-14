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
