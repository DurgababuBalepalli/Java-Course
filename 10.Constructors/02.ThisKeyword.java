class Hey
{
	int value;     //instace variable
	Hey(int value)
	{
		this.value = value;   //value is local variable.local variable is assiging to local variable.to say leftside value is instance variable,use this keyword.
	}
}
class Hello
{
	public static void main(String[] args)
	{
		Hey obj = new Hey(89);
		System.out.print(obj.value);
	}
}

//this keyword in constructor overloading
class Wonder
{
	int a;
	int b;
	
	Wonder()  
	{
		this(0);   //calls Wonder(int i)
	}
	Wonder(int i)
	{
		this(i,i);   //calls Wonder(int i,int j) suppose if i=4,  i,j get 4.
	}
	Wonder(int i,int j)
	{
		this.a = i;
		this.b = j;
	}
	public void printMeth()
	{
		System.out.println("a and b are :"+a+" "+b);
	}
}

public class Hello {

	public static void main(String[] args) {
		Wonder obj = new Wonder();
		obj.printMeth();          //a and b are :0 0
		
		Wonder obj1 = new Wonder(5);
		obj1.printMeth();         //a and b are :5 5

	}

}

//this keyword as Argument.
package stringsPractice;

class ThisExample {
    
    int x;
    int y;
    
    ThisExample(int x,int y)
    {
    	this.x = x;
    	this.y = y;
    	
    	durga(this); //this will send object to durga
    	
    	System.out.println("x is : "+this.x);
    }
    
    void durga(ThisExample obj)       //you will get current class object here. you can this generally we create in main method,but this keyword is argument.so refered to obj of class
    {
    	obj.x = x+2;
    }
   
}

public class Hello {

	public static void main(String[] args) {
		new ThisExample(3,7);
	}

}