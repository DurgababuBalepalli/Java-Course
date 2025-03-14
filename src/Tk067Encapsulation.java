class AreaOfRect
{
	int length;
	int breadth;
	AreaOfRect(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public void area()
	{
		int area = length * breadth;
		System.out.println("area is:"+area);
	}
}
public class Tk067Encapsulation {

	public static void main(String[] args) {
		AreaOfRect obj = new AreaOfRect(5,4);
		obj.area();

	}

}
