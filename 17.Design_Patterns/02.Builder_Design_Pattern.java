
//before going to Builder pattern cover the basic stuff for better understanding.

//the first way you can get private variable.
/*
class Hell
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class Hello {
	public static void main(String[] args)
	{
		Hell obj = new Hell();
		obj.setName("durga");
		System.out.println(obj.getName());
	}
}
*/

//by using toString Method you can get.
/*
class Hell
{
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hell [name=" + name + "]";
	}
}
class Hello {
	public static void main(String[] args)
	{
		Hell obj = new Hell();
		obj.setName("durga");
		System.out.println(obj);
	}
}
*/

//you can use this keyword also to return object.using that object you can use toString method
class Hell
{
	private String name;

	public Hell meth(String name) 
	{
		this.name = name;
		return this;  //iam returning object of hell class
	}

	@Override
	public String toString() {
		return "Hell [name=" + name + "]";
	}
	
}
class Hello {
	public static void main(String[] args)
	{
		Hell obj = new Hell();
		Hell s = obj.meth("durga");  // iam getting Object og Hell and giving different reference.(remember no special memory allocated)
		System.out.println(s);     //both get same value
		System.out.println(obj);
		
		System.out.println(s.hashCode());  //both get same hashcode because they pointing one object
		System.out.println(obj.hashCode());
	}
}

------------------------------------BUILDER DESIGN PATTERN----------------------------------------------------------
package com.hai;

public class Phone 
{
	private String os;
	private String processor;
	private double screen;
	private int battery;
	public Phone(String os, String processor, double screen, int battery) {
		super();
		this.os = os;
		this.processor = processor;
		this.screen = screen;
		this.battery = battery;
	}
	
	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", screen=" + screen + ", battery=" + battery + "]";
	}
	
}

//main class

package com.hai;

public class Shop 
{
	public static void main(String[] args)
	{
		Phone obj = new Phone("Android","snapdragon",15.5,4000);  //here sometimes you maynot pass some values.then it won't work.you have to pass all parameters in sequence.i don't want
		System.out.println(obj);
	}
}

----------------------------------------------------------------------------------------------------------------------------------------
//main class

package com.hai;

public class Shop 
{
	public static void main(String[] args)
	{
		Phone obj = new PhoneBuilder().setBattery(4000).setProcessor("snapdragon").gettingPhone();  //your given values goes to setters.setters return every value of object.if you not specify takes null(if string if double takes 0.0)
																									//from setters object values is passed to phone constructor because of gettingPhone method. by using toString you are getting values.
																									//now you don't need order.and you can ask what ever parameters you want specifically.
		System.out.println(obj);
	}
}

//PhoneBuilder class
package com.hai;

public class PhoneBuilder 
{
	private String os;
	private String processor;
	private double screen;
	private int battery;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreen(double screen) {
		this.screen = screen;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone gettingPhone()                        //from here all values goes to Phone class Constructor.
	{
		return new Phone(os,processor,screen,battery);
	}
	
	
}

//Phone class
package com.hai;

public class Phone 
{
	private String os;
	private String processor;
	private double screen;
	private int battery;
	
	public Phone(String os, String processor, double screen, int battery) {
		super();
		this.os = os;
		this.processor = processor;
		this.screen = screen;
		this.battery = battery;
	}
	
	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", screen=" + screen + ", battery=" + battery + "]";
	}
	
}

OUTPUT : Phone [os=null, processor=snapdragon, screen=0.0, battery=4000]
