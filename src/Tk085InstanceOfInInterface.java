interface Clock
{
	
}
class WallClock implements Clock
{
	
}
public class Tk085InstanceOfInInterface {

	public static void main(String[] args) {
		WallClock wc = new WallClock();
		boolean b1 = wc instanceof WallClock;
		System.out.println(b1);  //true
	}

}
