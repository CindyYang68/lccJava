package hw.hw0814.hw1;

import java.util.Scanner;

public class Transportation {

	public static void main(String[] args) {

		Taxi taxi=new Taxi("�p�{��", "����", 4, 4);
		Train train=new Train("����", "����", 124, 64);
		Airplane airplane=new Airplane("����", "������", 18, 10);
		AmphibiousMotorcycle am=new AmphibiousMotorcycle("������μ�����","�զ�", 2, 0);
		
		
		System.out.print("1.�p�{��\t2.����\n3.����\t4.������μ�����\n�п�J�Ʀr�H�d�ݦ���q�u�㪺�S��:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		switch (num) {
			case 1:
				taxi.total();
				break;
			case 2:
				train.total();
				break;
			case 3:
				airplane.total();
				break;
			case 4:
				am.total();
				break;
			default:
				System.out.println("��J���~�A�п�J1~4");
		}

	}

}
