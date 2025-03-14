class Hey
{
	int a;
	Hey(int a)
	{
		this.a = a;
	}
}
class HH
{
	public static void main(String[] args) {
		Hey obj = new Hey(20);
		System.out.println(obj.a);
	}
}