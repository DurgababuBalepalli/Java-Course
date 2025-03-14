import java.util.*;
class Power{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num first");
        int num = sc.nextInt();
        System.out.println("enter power now");
		int power =sc.nextInt();
		int box = 1;
		for (int i=1;i<=power ;i++ ) {
			System.out.println("*******");
			box = box * num ;
			System.out.println(box);
		}
	}
}