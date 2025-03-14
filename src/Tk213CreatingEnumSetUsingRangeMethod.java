import java.util.EnumSet;
//Using range(e1, e2) Method
//The range() method creates an enum set containing all the values of an enum between e1 and e2 including both values.

public class Tk213CreatingEnumSetUsingRangeMethod {
	enum Days
	{
		Sun,Mon,Tue,Wed,Thurs;
	}
	public static void main(String[] args) {
		EnumSet<Days> week = EnumSet.range(Days.Mon, Days.Wed);
		System.out.println(week);
	}

}
