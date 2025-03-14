import java.util.*;
class Hello_world
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, 0);
		cal.set(Calendar.DAY_OF_MONTH, 18);
		Date my_date = cal.getTime();
		System.out.println(my_date);
	}
}