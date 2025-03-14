//when you define enum indirectly enum get converted into class.inside class we have multiple objects
//static final mobiles Redme = new mobiles();
//static final mobiles Realme = new mobiles();  //in this way they created

/*
enum mobiles
{
	Redme,Realme,Sony,Vivo;
	
	int price;
	public int gettingprice()
	{
		return price;
	}
	
	//now i will give constructor here
	mobiles()
	{
		price = 29;  //so this 29 assined to all the constants Redme,Realme,Sony,Vivo;
		System.out.println("constructor calls all objects");  //no of constants difines no of constuctors. 4 constants present so 4 constructors.
	}
	
}
public class Tko95EnumConstructor {

	public static void main(String[] args) {
		System.out.println(mobiles.Realme.gettingprice());
		System.out.println(mobiles.Redme.gettingprice());
		System.out.println(mobiles.Sony.gettingprice());
		System.out.println(mobiles.Vivo.gettingprice());
		
	}

}
*/

//i dont want every constant taking same value.then you can specify different values
/*
enum mobiles
{
	Redme(100),Realme(500),Sony(50),Vivo(20);   //inside process will be static final mobiles Redme = new mobiles(100); for every mobile it will assigned in the same way.
												//but to access that value we need constuctor
	int price;
	
	public int gettingprice()
	{
		return price;
	}
	
	mobiles(int i)     //realme(500). 500 will come here
	{
		price = i;
	}

}

public class Tko95EnumConstructor {

	public static void main(String[] args) {
		System.out.println(mobiles.Sony.gettingprice());
		
	}

}
*/

//default constuctor calling
/*
enum mobiles
{
	Redme(100),Realme(500),Sony,Vivo(20);  //here sony calls default constuctor.remaining calls parametrized constructor 
	int price;
	
	public int gettingprice()
	{
		return price;
	}
	
	mobiles(int i)     //realme(500). 500 will come here
	{
		price = i;
	}

	mobiles() 
	{
		System.out.println("hey your constant has no value");
	}

}
public class Tko95EnumConstructor {

	public static void main(String[] args) {
		System.out.println(mobiles.Sony.gettingprice());
		
	}

}
*/

enum Fruit1
{
	Apple("red"),Orange("orange"),grape("black");  //these colors got to fruit constructor
	
	String color;
	Fruit1(String color)
	{
		this.color = color;
	}
	
	public String gettingFruitColor()
	{
		return color;
	}
}
public class Tk095EnumConstructor {

	public static void main(String[] args) {
		
		System.out.println(Fruit1.grape.gettingFruitColor());
		
		//you can also access like this
		Fruit1 ref = Fruit1.grape;
		System.out.println(ref.gettingFruitColor());
	}

}