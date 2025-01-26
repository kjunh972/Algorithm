import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (n>45) {
			n = sc.nextInt();
		}
		
		int[] sum = new int[n+1];
		
		for (int i=0; i<n; i++)
		{
			if (i==0) {
				sum[i+1] =1;
			} else {
				if (i<n)
					sum[i+1] = sum[i]+sum[i-1];
			}
		}
		
		System.out.println(sum[n]);
	}
}
