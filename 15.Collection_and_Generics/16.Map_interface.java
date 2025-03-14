import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Hello
{
	public static void main(String[] args)
	{
		/*
		Map mymap = new HashMap();
		mymap.put("phno", 799572);
		mymap.put("name", "durga");
		mymap.put("id", 160127);
		mymap.put("hell", "heaven");
		
		System.out.println(mymap); //you can observe there is no proper sequence.map also using Hash concept so we know already hash doenot follow order
		
	    //by using get method we will fetch values.
		//System.out.println(mymap.get("name"));  //if key not available gives you null
		
		//there is a method Keyset in  map.it gives you all keys
		Set mykeys = mymap.keySet(); //now all keys present in mykeys
		for(Object i:mykeys)
		{
			System.out.println(mymap.get(i));
		}
		
		*/
		
		//using generics with map
		Map<String,String> mymap = new HashMap<>();  //the map accepts keys and values only strings
		mymap.put("Name", "Durgababu");
		mymap.put("id", "N160127");
		mymap.put("village", "Nandivampu");
		mymap.put("brother", "yakob");
		mymap.put("id2", "N160127");
		Set<String> mykeys = mymap.keySet();
		
		for(String i:mykeys)
		{
			System.out.println(i+" "+mymap.get(i));
		}
	}
}