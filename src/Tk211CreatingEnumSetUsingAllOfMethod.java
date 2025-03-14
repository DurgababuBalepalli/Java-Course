import java.util.EnumSet;

public class Tk211CreatingEnumSetUsingAllOfMethod {
	enum Days
	{
		Sun,Mon,Tue,Wed;
	}
	public static void main(String[] args) {
		EnumSet<Days> week = EnumSet.allOf(Days.class);
		System.out.println(week);
	}

}
