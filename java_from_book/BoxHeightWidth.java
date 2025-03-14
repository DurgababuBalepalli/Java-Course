class Box{
	double height;
	double weight;
	double breadth;
}
class Boxc{
	public static void main(String[] args) {
		Box red = new Box();
        Box blue = new Box();
		red.height=10;
		red.weight=20;
        red.breadth=5;
        double result = red.height * red.weight * red.breadth;
        System.out.println(result);
        //for Box1
        blue.height=7;
        blue.weight=3;
        blue.breadth=6;
        double result1 = blue.height * blue.weight * blue.breadth; 
        System.out.println(result1);
	}
}