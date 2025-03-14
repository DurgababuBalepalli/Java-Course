
//private accessible only with in the class.so if you want to use data outside of class we have to use 
//getters and setters methods
class Myclass
{
	private String name;  //you can't access this name in OOP009PrivateAccessModifier class

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class Tk037PrivateAccessModifier {

	public static void main(String[] args) {
		Myclass obj = new Myclass();
		obj.setName("durgababu");
		System.out.println(obj.getName());

	}

}
