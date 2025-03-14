//displaying volume of box with no parameters.
class Box{
	int height;
	int weight;
	int breadth;
        int hello(){
                return height*breadth*weight;
        }
}
class Boxc{
	public static void main(String[] args) {
	Box red = new Box();
        int result;
        red.height=10;
        red.weight=3;
        red.breadth=2;
        result = red.hello();
        System.out.println(result);
        Box blue = new Box();
        blue.height=9;
        blue.weight=2;
        blue.breadth=5;
        result = blue.hello();
        System.out.println(result);
	}
}