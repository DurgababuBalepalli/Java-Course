import java.util.*;
class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int j;
		int counter=0;
		int n;
		n = sc.nextInt();
		for (i=2;i<=n ;i++ ) 
		{
			counter=0;
			for (j=1;j<=i ;j++ ) 
			{
				if(i%j==0)
				{
					counter = counter + 1;
				}
			}
			if(counter==2)
			{
				System.out.println(+i);
			}
			else 
			{
				System.out.println("not prime");
			}
		}
	}
}