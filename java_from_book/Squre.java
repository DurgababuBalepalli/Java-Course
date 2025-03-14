//squaring of a number using methods and passing parameters
class  Square{
	int tot(int i){
		return i * i;
	}
} 
class Sqr{
	public static void main(String[] args) {
		Square tt = new Square();
		int result = tt.tot(5);
        System.out.println(result);
	}
}