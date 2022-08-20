package hw.hw0807;

public class Hw0807_2 {

	public static void main(String[] args) {
		
		long arr[]=new long[100];
		arr[0]=1;
		arr[1]=2;
		long molecular=0;
		long denominator = 1;
		
		System.out.println("有一數列:2/1,3/2,5/3,8/5,13/8,21/13...");

		for(int i=0;i<20;i++) {
			arr[i+2]=arr[i]+arr[i+1];
			denominator *= arr[i]; // 1 2 6
			molecular =molecular*arr[i] + denominator/arr[i]*arr[i+1];
		
			long m=denominator;
			long n=molecular;
			long d = GCD(m,n);
			
			denominator=denominator/d;
			molecular=molecular/d;
			
			System.out.printf("前%d項之和為: %d/%d\n",i+1,molecular,denominator);
		}
		
		System.out.println("--------------");
		System.out.printf("前20項之和為: %d/%d\n",molecular,denominator);

	}
	
	public static long GCD(long m,long n) {
		
		if(n==0)
			return m;
		else
			return GCD(n,m%n);
	}

}
