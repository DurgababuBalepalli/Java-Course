class Student
{
	static class Backbench
	{
		int a =20;
		int b = 30;
		public int meth()
		{
			return a+b;
		}
	}
}
public class Tk088StaticInnerClass {

	public static void main(String[] args) {
		Student obj = new Student();
		Student.Backbench obj1 = new Student.Backbench();
		System.out.println(obj1.meth());
	}

}
