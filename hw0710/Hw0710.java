package hw.hw0710;

public class Hw0710 {

	public static void main(String[] args) {
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("�п�J�@�ӥ���ƨӧP�_�_����:");
		int num = scan.nextInt();
		
		if(num>0) {
			if(num%2==0) {
				System.out.println(num+"�O���ơC");
			}else {
				System.out.println(num+"�O�_�ơC");
			}
		}else {
			System.out.println("��J���~�A�п�J�@�ӥ���ơC");
		}
	}

}
