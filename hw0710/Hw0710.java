package hw.hw0710;

public class Hw0710 {

	public static void main(String[] args) {
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("請輸入一個正整數來判斷奇偶數:");
		int num = scan.nextInt();
		
		if(num>0) {
			if(num%2==0) {
				System.out.println(num+"是偶數。");
			}else {
				System.out.println(num+"是奇數。");
			}
		}else {
			System.out.println("輸入錯誤，請輸入一個正整數。");
		}
	}

}
