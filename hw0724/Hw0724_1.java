package hw.hw0724;

public class Hw0724_1 {

	public static void main(String[] args) {
		
		java.util.Scanner scan=new java.util.Scanner(System.in);      
		System.out.println("請輸入一個要找尋的數字:");
		int num=scan.nextInt();
		int[] arr= new int[10];
		
		for(int i=0;i<arr.length;i++)
			arr[i] = (int)(Math.random()*100)+1;
		
		for(int x:arr)
			System.out.print(x+",");
		
		System.out.println();
		
		int temp=0;
		for(int i = 0;i<10;i++) {
			if(arr[i]==num) {
				temp=num;
				System.out.println("索引值"+i+"為"+num);
				break;
			}
		}
		if(temp==0)
		System.out.println("陣列中沒有此數字");
		
	}

}
