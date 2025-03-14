import java.util.HashSet;
import java.util.Set;

public class Hello
{
	public static void main(String[] args)
	{
		Set<Integer> myset = new HashSet<>();
		myset.add(22);
		myset.add(97);
		myset.add(12);
		myset.add(100);
		
		for(Integer i:myset)
		{
			System.out.println(i);
		}
	}
}

//Tree set - just place treeset in place of hashset
import java.util.Set;
import java.util.TreeSet;

public class Hello
{
	public static void main(String[] args)
	{
		Set<Integer> myset = new TreeSet<>();
		myset.add(22);
		myset.add(97);
		myset.add(12);
		myset.add(100);
		
		for(Integer i:myset)
		{
			System.out.println(i);
		}
	}
}
