import java.util.EnumSet;

public class Tk215InsertElementsToEnumSet {
	enum Days
	{
		Sun,Mon,Tue,Wed;
	}
	public static void main(String[] args) {
		//iam creating an enpty enum set
		EnumSet<Days> week = EnumSet.noneOf(Days.class);
		System.out.println(week);
		
		week.add(Days.Mon);     //using add method
		week.add(Days.Wed);
		System.out.println(week);
		
		//using Addall - addAll() inserts all the elements of the specified collection to the set
		EnumSet<Days> week1 = EnumSet.noneOf(Days.class);
		week1.add(Days.Sun);
		week1.addAll(week);
		System.out.println(week1);
	}

}
