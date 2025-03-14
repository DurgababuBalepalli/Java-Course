import java.lang.Math;
interface Polygon
{
	void toArea();
	
	//perimeter of polygon
	default void perimeter(int ...sides)
	{
		int perimeter = 0;
		for(int x:sides)
		{
			perimeter += x;
		}
		System.out.println("perimeter is: "+perimeter);
	}
}
class Triangle implements Polygon
{
	private int a,b,c;
	private double s,area;
	
	Triangle(int a,int b,int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		s = 0;
	}

	@Override
	public void toArea() 
	{
		s = (double)(a+b+c)/2;  //iam typecating to get exact value.other wise it will give floor value.
		//System.out.println(s);
		area = (double)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("area is :"+area);	
	}
	
}
public class Tk063PrivateAndStaticMethodsInInterface {

	public static void main(String[] args) {
		Triangle obj = new Triangle(2,3,4);
		obj.toArea();
		
		obj.perimeter(2,3,4);
	}

}
