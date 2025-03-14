class Encap
{
	private String name;      //name and id is data. eventhough you make private you can get data that is beauty of encapsulation
	private int id;
	public void setname(String givenname)    //to receive data setters method
	{
		name  = givenname;
	}
	public String getname()                //to send data getters
	{
		return name;
	}
}
public class Tk068DataHiddingUsingPrivate {

	public static void main(String[] args) {
		Encap obj = new Encap();
		obj.setname("Durgababu");
		System.out.print(obj.getname());

	}

}
