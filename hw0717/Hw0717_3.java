package hw.hw0717;

public class Hw0717_3 {

	public static void main(String[] args) {
		
		java.util.Scanner scan=new java.util.Scanner(System.in); 
		
		System.out.println("�п�J1~100�������Ʀr��]��:");
		int number=scan.nextInt();
		if(number>=1&&number<=100) {
			
			System.out.println(number+"���]��:");
			for(int i=1;i<=number;i++) {
				if(number%i==0) {
					System.out.print(i+",");
				}
			}
			
			
		}else {
			System.out.println("�Ʀr���d�򤣦b1~100����");
		}
	}

}
