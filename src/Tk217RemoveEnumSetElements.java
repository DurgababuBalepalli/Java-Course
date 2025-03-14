import java.util.EnumSet;

public class Tk217RemoveEnumSetElements {
	enum Days
	{
		Sun,Mon,Tue,Wed;
	}
	public static void main(String[] args) {
		EnumSet<Days> week = EnumSet.allOf(Days.class);
		week.remove(Days.Sun);  //using remove
		System.out.println(week);
		
		week.removeAll(week);   //removeall using.removes everything
		System.out.println(week);
	}

}
