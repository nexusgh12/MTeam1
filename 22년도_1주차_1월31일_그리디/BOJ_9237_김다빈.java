package study003;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import javax.sound.sampled.ReverbType;

public class BOJ_9237_��ٺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		
		Ǯ��) 
		1.	�迭�� ���� �Է¹޴´�. 								/	(�迭�� ��ĳ�ʻ��)
		2.	�Է¹��� �迭�� ������������ ����							/	(Arrays.sort ����ϱ�)
		3.	�� �迭�� ù��° �迭�� +1, �ι�° �迭 +2... n��° �迭�� +n 	/	(for ���)
		4.	�迭���� ����ū ���� ���Ͽ� +1 ���ָ� ������� �ʴ��ϴ� ��¥
		
		 */
		
		
		//	1---------------------------------
		Scanner s31 = new Scanner(System.in);
		int n = s31.nextInt();
		int tmp;
		//	int���̾ƴ� integer��� �ϴ������� Collections.reverseOder()����Ϸ��� integer���̿����Ѵ�.
		//	int���� ��ü�� �ƴѵ� sort�� ��ü���ױ� ������ ������ ��
		Integer[] ar31 = new Integer[n];
		
		for(int i=0; i<n; i++) {
			ar31[i] = s31.nextInt();
		}
				
		//	2---------------------------------
		//	arrays. sort ���
		//	��� ��� 
		//	Arrays.sort(�迭�̸�, Collections.reverseOrder())
		Arrays.sort(ar31, Collections.reverseOrder());

		//	3---------------------------------
		//	�迭�� ������� +1,+2,+3...���ֱ�
		
		for(int i=0; i<ar31.length; i++) {
			ar31[i] = ar31[i]+i;
		}
		
		//	4---------------------------------
		//	�迭�� ���� ū ���� �����ֱ�
		int max = ar31[0];
		for(int i=0; i<ar31.length; i++) {
			if(max < ar31[i]) {
				max = ar31[i];
			}
		}
		//	���� ū ���� �ɴ³� +1 �� ����Կ��� �״����� �Ұ��ϹǷ� +1, �� +2���ֱ�
		System.out.print(max+2);
	}

}
