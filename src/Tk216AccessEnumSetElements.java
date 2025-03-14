import java.util.EnumSet;
import java.util.Iterator;

public class Tk216AccessEnumSetElements {
	enum Days
	{
		Sun,Mon,Tue,Wed;
	}
	public static void main(String[] args) {
		EnumSet<Days> week = EnumSet.allOf(Days.class);
		
		Iterator it = week.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
