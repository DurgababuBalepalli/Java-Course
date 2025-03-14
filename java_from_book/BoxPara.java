//displaying volume of box with parameters and return values.
class Box{
	int height;
        int breadth;
	int weight;
        int hello(){
                return height*breadth*weight;
        }
        void par(int h,int b,int w){
              height = h;
              breadth = b ;
              weight = w ;  
        }
}
class Boxc{
	public static void main(String[] args) {
	Box red = new Box();
        int result;
        red.par(2,4,5);
        result = red.hello();
        System.out.println(result);
        //for second values
        Box blue = new Box();
        blue.par(7,8,9);
        result = blue.hello();
        System.out.println(result);
	}
}