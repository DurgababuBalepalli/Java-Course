class Fruit{
	int apples;
	int oranges;
	int bananas;
	void meth()
	{
		int total_fruits = apples+oranges+bananas;
		System.out.print(total_fruits);
	}
}
class Final{
	public static void main(String[] args) {
		Fruit ff = new Fruit();
		ff.apples = 9;
		ff.oranges = 10;
		ff.bananas = 5;
		ff.meth();
	}
}