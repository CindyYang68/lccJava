package hw.hw0814.hw1;

import java.util.Scanner;

public class Transportation {

	public static void main(String[] args) {

		Taxi taxi=new Taxi("計程車", "黃色", 4, 4);
		Train train=new Train("火車", "紅色", 124, 64);
		Airplane airplane=new Airplane("飛機", "粉紅色", 18, 10);
		AmphibiousMotorcycle am=new AmphibiousMotorcycle("水陸兩用摩托車","白色", 2, 0);
		
		
		System.out.print("1.計程車\t2.火車\n3.飛機\t4.水陸兩用摩托車\n請輸入數字以查看此交通工具的特色:");
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
				System.out.println("輸入錯誤，請輸入1~4");
		}

	}

}
