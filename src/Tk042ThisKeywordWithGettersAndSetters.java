
class Hero
{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class Tk042ThisKeywordWithGettersAndSetters {

	public static void main(String[] args) {
		Hero obj = new Hero();
		obj.setName("durgababu");
		System.out.println(obj.getName());

	}

}
