package hw.hw0724;

import java.util.Arrays;
import java.util.Collections;

/**
 * ��k�@:�ϥ�java���ؤ�k�ӳB�z Array.sort
 * 
 *
 */
public class Hw0724_2 {

	public static void main(String[] args) {

		int[] arr = { 53, 23, 25, 67, 45, 13, 78, 4, 39, 26 };
		int temp;
		for (int x = 0; x < 10; x++) {
			for (int i = 0; i < 9; i++) {

				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for (int j = 0; j < 10; j++)
			System.out.print(arr[j] + ",");
		
		System.out.println();
		
		for (int x = 0; x < 10; x++) {
			for (int i = 0; i < 9; i++) {
				if (arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for (int j = 0; j < 10; j++)
			System.out.print(arr[j] + ",");

		System.out.println();
		
		
		
		
		//��k�@:�ϥ�java���ؤ�k�ӳB�z Array.sort
		Arrays.sort(arr); //�w�]�O�q�p�ƨ�j
		for(int i:arr)
			System.out.print(i+",");
		
		System.out.println();
		
		Integer[] s= {100,87,85,89,90,3,21,46,80,50}; //Integer �O int ������ŧi   
		Arrays.sort(s,Collections.reverseOrder());
		System.out.println(Arrays.toString(s));
		
		
	}

}
