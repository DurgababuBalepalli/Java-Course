import java.util.EnumMap;


public class Tk178AccessEnumMapElementsUsingEntryGetMethod {
	enum Days
	{
		Sun,Mon,Tue,Wed;
	}
	public static void main(String[] args) {
		EnumMap<Days,Integer> week =new EnumMap<>(Days.class);
		//using put
		week.put(Days.Sun, 1);
		week.put(Days.Mon, 2);
		week.put(Days.Wed, 3);
		System.out.println(week);

		System.out.println(week.get(Days.Wed));
	}

}
