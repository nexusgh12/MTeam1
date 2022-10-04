package study007;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_13702_��ٺ� {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());	// ���ɸ� ����
		int k = Integer.parseInt(st.nextToken());	//	������ ģ�� ��
		int ml[] = new int[n];						//	���ɸ��� �뷮�� �Է¹޾ƾ� �ϹǷ�!
		int sum=0;
		
		for(int i=0; i<n; i++) {
			ml[i] = Integer.parseInt(br.readLine());	//	���ɸ� �� �Է¹޾� �����ϱ�		
			sum += ml[i];								//	���ɸ� �ѷ� ���ϱ�
		}	
		
		int s = sum/k;	//	s = ���ɸ��� �ѷ�/ģ�� �� �� ���� �ִ�뷮�� ������ ����ش�. 
		int sumsum=0;	//	
		
		for(int i=0; i<1000; i++) {
			for(int j=0; j<n; j++) {
				sumsum += ml[j]/s;		//	������ ���ɸ������� / �뷮�� ����  ���� �����ְ� �������� ������ �� ������ �����ش�.
			}
				if (sumsum>=k) break;		//	���� �� ������ k(ģ����)���� ũ�ų� ���ٸ� �����Ѵ�.
			else{
				sumsum=0;		//	�ݺ��� ���� �� sumsum�� ���� �ʱ�ȭ
				s--;			//	s���� ������.
			}
		}	
		System.out.println(s);
	
	}

	
}
