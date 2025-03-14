import java.util.EnumSet;

public class Tk212CreatingEnumSetUsingNoneOfMethod {
	enum Days
	{
		Sun,Mon,Tue,Wed;
	}
	public static void main(String[] args) {
		//The noneOf() method creates an empty enum set
		EnumSet<Days> week = EnumSet.noneOf(Days.class);
		System.out.println(week);

	}

}
//We can only insert elements of enum type Size in the above program. It's because we created our empty enum set using Size enum.