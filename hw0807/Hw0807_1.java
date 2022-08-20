package hw.hw0807;


public class Hw0807_1 {

	public static void main(String[] args) {

		long[] arr = new long[101];
		arr[0] = 0;
		arr[1] = 1;
		int i = 0;
		
		System.out.println("有一對兔子，從出生後第三個月起每個月都生一對兔子，\n小兔子長到第三個月後每個月又生一對兔子，假如兔子都不死，\n每個月的兔子總數為多少?\n請輸入欲查詢的月(最多為第90個月)");
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int num = scan.nextInt();

		if (num > 0 && num<91) {

			for (i = 0; i < num; i++) {
				arr[i + 2] = arr[i] + arr[i + 1];
				System.out.printf("第 %d 個月的兔子總數為 %d 對，%d 隻\n", i + 1, arr[i + 1],arr[i + 1]*2);	
			}
			
			System.out.println("---------------");
		
			System.out.printf("第 %d 個月的兔子總數為 %d 對，%d 隻\n", i, arr[i],arr[i]*2);

		} else {
			System.out.println("輸入錯誤!請輸入第1~90個月。");
		}

	}

}
