class Ant   
{
	public Ant()
	{
		System.out.println("iam Ant");
	}
	public Ant(int a)
	{
		System.out.println("hello iam from class Ant");
	}
}
class Ball extends Ant
{
	public Ball()
	{
		 //by default super() is there.so it will call parent class
		System.out.println("iam Ball");
	}
	public Ball(int a)
	{
		super(a);
		System.out.println("hello iam from Ball");
	}
}
public class Tk056ParametrizedConstructorUsingSuper {

	public static void main(String[] args) {
		Ball obj = new Ball(4);

	}

}
