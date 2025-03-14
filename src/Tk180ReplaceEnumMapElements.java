import java.util.EnumMap;

public class Tk180ReplaceEnumMapElements {
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
		
		week.replace(Days.Wed, 4);
		System.out.println(week);
		
		//replaceAll- replaces each value of the map with the result of the specified function
		week.replaceAll((key,oldValue) -> oldValue*10);
		System.out.println(week);
		
	}

}
