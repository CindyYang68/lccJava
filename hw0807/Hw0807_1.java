package hw.hw0807;


public class Hw0807_1 {

	public static void main(String[] args) {

		long[] arr = new long[101];
		arr[0] = 0;
		arr[1] = 1;
		int i = 0;
		
		System.out.println("���@��ߤl�A�q�X�ͫ�ĤT�Ӥ�_�C�Ӥ볣�ͤ@��ߤl�A\n�p�ߤl����ĤT�Ӥ��C�Ӥ�S�ͤ@��ߤl�A���p�ߤl�������A\n�C�Ӥ몺�ߤl�`�Ƭ��h��?\n�п�J���d�ߪ���(�̦h����90�Ӥ�)");
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int num = scan.nextInt();

		if (num > 0 && num<91) {

			for (i = 0; i < num; i++) {
				arr[i + 2] = arr[i] + arr[i + 1];
				System.out.printf("�� %d �Ӥ몺�ߤl�`�Ƭ� %d ��A%d ��\n", i + 1, arr[i + 1],arr[i + 1]*2);	
			}
			
			System.out.println("---------------");
		
			System.out.printf("�� %d �Ӥ몺�ߤl�`�Ƭ� %d ��A%d ��\n", i, arr[i],arr[i]*2);

		} else {
			System.out.println("��J���~!�п�J��1~90�Ӥ�C");
		}

	}

}
