package hw.hw0724;

public class Hw0724_1 {

	public static void main(String[] args) {
		
		java.util.Scanner scan=new java.util.Scanner(System.in);      
		System.out.println("�п�J�@�ӭn��M���Ʀr:");
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
				System.out.println("���ޭ�"+i+"��"+num);
				break;
			}
		}
		if(temp==0)
		System.out.println("�}�C���S�����Ʀr");
		
	}

}
