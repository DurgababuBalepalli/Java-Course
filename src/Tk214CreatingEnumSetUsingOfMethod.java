import java.util.EnumSet;

public class Tk214CreatingEnumSetUsingOfMethod {
	enum Days
	{
		Sun,Mon,Tue,Wed;
	}
	public static void main(String[] args) {
		//The of() method creates an enum set containing the specified elements
		EnumSet<Days> week = EnumSet.of(Days.Mon);
		System.out.println(week);
		
		EnumSet<Days> week1 = EnumSet.of(Days.Mon, Days.Wed);
		System.out.println(week1);
	}

}
