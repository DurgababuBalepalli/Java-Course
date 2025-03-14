//using constructersin java
class Box{
    int oranges;
    int apples;
    int bananas;
    Box(){
    	oranges = 10;
    	apples = 5;
    	bananas = 3;
    }
}
class Fin{
	public static void main(String[] args) {
		Box bb = new Box();
		System.out.println(bb.apples);
	}
}
