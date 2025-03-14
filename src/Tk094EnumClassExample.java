
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



