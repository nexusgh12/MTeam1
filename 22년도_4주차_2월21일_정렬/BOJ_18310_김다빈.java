package study006;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


/*
	����
	��ũ��������  ������ �������� ���� �� ��,
	4/2==0 �̸� 4/2-1=1
	
 */

public class BOJ_18310_��ٺ� {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        	
        //	���۸����� ���� N���̸�ŭ�� �迭 ����
        int[] arr = new int[N];

        //	StringTokenizer  ����ؼ� �Է¹��� ���� " " ������ �������� ������.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //	n��ŭ
        for (int i = 0; i < N; i++) {
            //	�迭�� = �Է¹��� st������ ������ �ٲ��ش�.
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        //	������������ ����
        Arrays.sort(arr);

        //	���� ���� �������� �� {1,5,7,9}
        //	���� �߰��� �ִ� ���� ���� �����Ƿ�
        //	4/2-1 = 1 arr[1]=5 
        if (N % 2 == 0) {
            System.out.println(arr[N / 2 - 1]);	//	N/2-1
        } else {
            System.out.println(arr[N / 2]);	//	�ƴϸ� N/2
        }
    }
}