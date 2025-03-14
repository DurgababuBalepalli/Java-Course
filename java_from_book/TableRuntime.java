import java.util.*;
class Table{
	public static void main(String[] args) {
		int i;
		int k;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			System.out.println("*****your table******");
			for (k=1;k<=10;k++) {
				System.out.println(n + "*" + k + "=" +(n*k));
			}
		}
		
	}