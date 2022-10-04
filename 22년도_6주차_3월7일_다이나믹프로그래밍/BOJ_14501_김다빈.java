package study008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14501_��ٺ� {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());	//	���ú��� n+1��° �Ǵ� �� ���
		
		int[] ti = new int[20];						//	��� �Ϸ� �Ⱓ ti
		int[] pi = new int[20];						//	��� �ݾ� pi
		int[] dp = new int[20];						//	n�Ͽ� ���� �� �ִ� �ִ� ����

        for(int i=1; i<=n; i++){
            String[] input = br.readLine().split(" ");	//	split���� ���� �ְ� string�̶�� �迭�� ti pi�� �־���
            ti[i] = Integer.parseInt(input[0]);			//	input �� ù��°
            pi[i] = Integer.parseInt(input[1]);			//	input �� �ι�°
        }

        for(int i = n; i>0; i--){					
            if(ti[i]>n-i+1){						//	���� �� �ִ³�¥�� �Ѿ�� ��� 
                dp[i] = dp[i+1];					//	n�Ͽ� ���� �� �ִ� �ִ� ���� 
            }else {									//	�ƴ� ���
                dp[i] = Math.max(pi[i]+dp[i+ti[i]],dp[i+1]);
                /*
                	��¥�� ������ �Ѿ�� �ʴ� ���  [���� ���ݾ�+�ִ����(����+���Ϸ�Ⱓ)], �ִ����(�Ϸ��)
                */
            }
        }

        System.out.print(dp[1]);
		
	}
}
