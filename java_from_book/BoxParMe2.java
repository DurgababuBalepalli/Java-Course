class Box{
	/*int height;
        int breadth;
	int weight;*/
        int hello(int height,int breadth,int weight){
                return height*breadth*weight;
        }
}
class Boxc{
	public static void main(String[] args) {
	Box red = new Box();
        int result;
        result = red.hello(2,5,6);
        System.out.println(result);
        //for second values
        Box blue = new Box();
        result = blue.hello(6,7,8);
        System.out.println(result);
	}
}