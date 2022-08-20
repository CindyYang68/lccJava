package hw.hw0717;

public class Hw0717_3 {

	public static void main(String[] args) {
		
		java.util.Scanner scan=new java.util.Scanner(System.in); 
		
		System.out.println("請輸入1~100之間的數字找因數:");
		int number=scan.nextInt();
		if(number>=1&&number<=100) {
			
			System.out.println(number+"的因數:");
			for(int i=1;i<=number;i++) {
				if(number%i==0) {
					System.out.print(i+",");
				}
			}
			
			
		}else {
			System.out.println("數字的範圍不在1~100之間");
		}
	}

}
