package study003;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_14487_��ٺ� {

	public static void main(String[] args) {
		
		/*
		 ��������
		 
		 1)	���� �� (�迭�� ���� �Է¹ޱ�)
		 2)	���� ��� �� �迭�� �Է¹ޱ�			/ (for, scanner ���)
		 3) �迭 ���� ���� ���ϱ�					/ (Arrays.sort ����ؼ� �ޱ�)
		 4) �迭-1 ���� ���� ���ϱ�				/ (length-1 ���� sum���� ���ؼ� �ޱ�)
		 */
		
		Scanner sc32 = new Scanner(System.in);
		
		//	1-----------------------
		int n = sc32.nextInt();
		
		int[] ar32 = new int[n];
		
		//	2-----------------------
		for(int i=0; i<ar32.length; i++) {
			ar32[i] = sc32.nextInt();
		}
		
		//	3------------------------
		//	Arrays.sort ����ϱ�
		Arrays.sort(ar32);
	
		//	4------------------------
		int sum=0;
		for(int i=0; i<ar32.length-1; i++) {
			sum += ar32[i];
		}	
		System.out.print(sum);
		
		
	}
}
