import java.util.EnumMap;

public class Tk176InsertElementsToEnumMap {

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
		
		//using putall
		EnumMap<Days,Integer> week1 =new EnumMap<>(Days.class);
		week1.putAll(week);
		
		week1.put(Days.Tue, 5);
		System.out.println(week1);
	}

}
