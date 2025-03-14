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

public class Tk043ThisKeywordInConstructorOverloading {

	public static void main(String[] args) {
		Wonder obj = new Wonder();
		obj.printMeth();          //a and b are :0 0
		
		Wonder obj1 = new Wonder(5);
		obj1.printMeth();         //a and b are :5 5

	}

}
