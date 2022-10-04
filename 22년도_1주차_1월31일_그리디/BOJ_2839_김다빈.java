package study003;

import java.util.Scanner;

public class BOJ_2839_��ٺ� {
	public static void main(String[] args) {
		Scanner sc33 = new Scanner(System.in);
		
		//	1)	n�Է¹ޱ�
		int n = sc33.nextInt();
		int[] ar33 = new int[5000];			//	���� 3�� 5000�����̹Ƿ� �˳��� 5000
		
		//	2)	z=5x+3y
		int x = 5;							//	5kg ����
		int y = 3;							//	3kg ����
		int cnt = 0;
		
		//	3)	�迭�� �ظ� �����ϴµ� �̶�, i��j�� �ط� ���ǹǷ� �迭�� ������ cnt(count)�� ����Ѵ�.
		for(int i=0; i<=10000; i++) {	
			for(int j=0; j<=10000; j++) {
				if(((i*x)+(j*y)) == n) {	//	5i + 3j = n	�϶�
					ar33[cnt] = i+j;		//	i�� j�� ���� ���Ͽ� ���ؼ� �־��ش�. -> �� ����� �ּҰ��� ���ؾ� �ϹǷ� �����ش�.
					cnt++;					//	cnt ����
				}
			}
		}
		
		//	4)	�迭�� �� �� �ּҰ��� ���Ѵ�.
		int min = 5000;						
		for(int i=0;i<cnt; i++) {			
			if(ar33[i] < min) {				//	�迭[i]�� ���� min���� �۴ٸ� min�� �� ���� ���� ���´�.
				min = ar33[i];				//	�ּҰ� ���ϱ�
			}
		}
		
		
		if(min == 5000) {					//	���� min�� ���� 5000, �� �ʱⰪ�� ���ٸ� ����� ���°��̹Ƿ� -1���
			min = -1;
		}
		
		System.out.println(min);
		
	}
}
