import java.util.*;
class Gr3{
	public static void main(String[] args) {
	int a;
	int b;
	int c;
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	if(a>b && a>c){
		System.out.println("a is grater");
	}
	else if (b>a && b>c) {
		System.out.println("b is grater");
	}
	else{
		System.out.println("c is grater");
	}

}
}