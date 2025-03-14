
//interface Os

package com.hello;

public interface Os 
{
	public void osSpec();
}

//implementing classes

package com.hello;
public class Android implements Os     //Android class
{

	@Override
	public void osSpec() 
	{
		System.out.println("so many useers likes me..iam android");
	}
	
}

package com.hello;
public class Ios implements Os       //IOS class
{

	@Override
	public void osSpec() {
		System.out.println("iam secured Os...iam IOS");
		
	}

}

package com.hello;
public class Windows implements Os        //Windows Class
{

	@Override
	public void osSpec() {
		System.out.println("users avoiding me....iam windows");
		
	}

}

package com.hai;

import com.hello.Android;
import com.hello.Os;

public class ClientView {

	public static void main(String[] args) {
		//this is our client page.or this is FactorMainPage. because from here you have to ask which OS you want.
		Os obj = new Android(); //here iam providing implementation.but in future if i want to change Windows.you have to recompile it. but client don't want to do that.he just ask for his requirement.
								//so for that reason and to hide implementation iam using factory class.
		obj.osSpec();
	}

}

--------------------------------so iam creting Factory class and from client view you can ask your requirement.you can't see implementation------------
package com.hai;

import com.hello.Android;
import com.hello.Os;

public class ClientView {

	public static void main(String[] args) {
		//to get those objects we have to create Factory Object here
		Factory obj = new Factory();
		Os myobj = obj.givesObj("costly");  //iam getting object.same super ref subclass object.now you don't require to compile now.incase if any new os should add,you need to modify Factory class only
		myobj.osSpec();
	}

}

//Factory class

package com.hai;

import com.hello.Android;
import com.hello.Ios;
import com.hello.Os;
import com.hello.Windows;

public class Factory 
{
	public Os givesObj(String str)  // this method returns object of Os. so inplace of void i placed Os class. you have to mension type of your Os.it is string
	{
		if(str.equals("openSource"))
		{
			return new Android();   //if i ask opensource i should get AndroidOs
		}
		else if(str.equals("costly"))
		{
			return new Ios();
		}
		else
		{
			return new Windows();
		}
	}
}


