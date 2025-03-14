//count of Fruits using return statement
class Fruit{
	int oranges = 10;
	int apples = 5 ;
	int bananas = 9;
	double count(){
	return oranges+apples+bananas;
	}
}
class Final{
	public static void main(String[] args) {
		Fruit ff = new Fruit();
		System.out.println(ff.count());	
	}
}