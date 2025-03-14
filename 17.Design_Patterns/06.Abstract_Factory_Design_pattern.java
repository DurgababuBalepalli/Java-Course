//go to this url for reference
//https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm

//Shape interface

public interface Shape 
{
	public void draw();
}

//implementing concrete classes Rectangle,rounded Square

public class Rectangle implements Shape 
{

	@Override
	public void draw() 
	{
		System.out.println("iam rectangle Draw mwthod");
		
	}

}

public class RoundedSquare implements Shape 
{

	@Override
	public void draw() {
		System.out.println("iam RoundSquare Draw mwthod");
	}

}

//Abstract factory class
public abstract class AbstractFactory 
{
	abstract Shape getShape(String str);
}

//concrete factory classes(i.e ShapeFactory, RoundedShapeFactory ) extending Abstract factory class

public class ShapeFactory extends  AbstractFactory 
{

	@Override
	public Shape getShape(String str) 
	{
		if(str.equals("rectangle"))
		{
			return new Rectangle();
		}
		else if(str.equals("square"))
		{
			return new Square();
		}
		else
		{
			return null;
		}
	}

}

public class RoundedShapeFactory extends  AbstractFactory 
{

	@Override
	public Shape getShape(String str) 
	{
		if(str.equals("roundedrectangle"))
		{
			return new RoundedRectangle();
		}
		else if(str.equals("roundedsquare"))
		{
			return new RoundedSquare();
		}
		else
		{
			return null;
		}
		
	}

}

//factory producer to decide which concrete factory should call

public class FactoryProducer 
{
	public static AbstractFactory gettingFactory(boolean round)
	{
		if(round)
		{
			return new RoundedShapeFactory();
		}
		else
		{
			return new ShapeFactory();
		}
	}
}

//main method

public class Main {

	public static void main(String[] args) {
		
		AbstractFactory af = FactoryProducer.gettingFactory(false);
		Shape s1 = af.getShape("rectangle");
		s1.draw();
		
		AbstractFactory af1 = FactoryProducer.gettingFactory(true);
		Shape s2 = af1.getShape("roundedrectangle");
		s2.draw();
	}

}