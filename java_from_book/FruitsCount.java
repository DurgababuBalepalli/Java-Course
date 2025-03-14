class Fruit{
	int oranges = 10;
	int apples = 5 ;
	int bananas = 9;
	void hello(){
		int fruitstotal = oranges+apples+bananas;
		System.out.println(fruitstotal);
	}
}
class Final{
	public static void main(String[] args) {
		Fruit ff = new Fruit();
		ff.hello();	
	}
}