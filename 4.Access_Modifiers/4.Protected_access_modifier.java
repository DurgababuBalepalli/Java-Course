 class Hel
 {
 	protected void meth()
 	{
 		System.out.print("hello");
 	}
 }
 class Finnel extends Hel
 {
 	public static void main(String[] args) 
 	{
 		Finnel obj = new Finnel();
 		obj.meth();
 	}
 }