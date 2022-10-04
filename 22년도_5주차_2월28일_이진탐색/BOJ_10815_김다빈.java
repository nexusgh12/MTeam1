package study007;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10815_��ٺ� {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, m;
    static int arr[];
    
    //										����ó��
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());	//	������� ���� ī�� ����
        arr = new int[n];						//	����̰� ���� ���� ī��
        StringTokenizer st = new StringTokenizer(br.readLine());	//	���� ���

        for(int i = 0 ; i < n; i++)			
            arr[i] = Integer.parseInt(st.nextToken());	//	����� ī�� ���� �Է�

        Arrays.sort(arr);		 // ����� ���� ī�� �������� ����

        m = Integer.parseInt(br.readLine());	//	���� ���� ī�� ����
        st = new StringTokenizer(br.readLine());//	tokenizer �����ϱ����� �ʱ�ȭ

        for(int i = 0 ; i < m; i++) {			//	�� ���� ī�� �Է�
            int num = Integer.parseInt(st.nextToken());
       
            if(binarySearch(num)) bw.write("1 ");	// �̺� Ž���� �ؼ� �ش� ���ڰ� �ִ� ���
            else bw.write("0 ");					// �̺� Ž���� �ؼ� �ش� ���ڰ� ���� ���
        }

        bw.close();			//	bufferdwrite �ݱ�
        br.close();			//	bufferdreader �ݱ�
    }
    private static boolean binarySearch(int num) {	//	ã���� �ϴ� ���� num
        int leftIndex = 0;				//	���� �ε��� �ʱⰪ 0
        int rightIndex = n - 1;			//	������ �ε��� �ʱⰪ ����̼���ī�� -1;

        while(leftIndex <= rightIndex){	//	������ �ε��� ���� �� ū ���
            int midIndex = (leftIndex + rightIndex) / 2;	//	�ε��� ��� ��
            int mid = arr[midIndex];						//	�ε��� ��� ��ġ

            if(num < mid) rightIndex = midIndex - 1;		//	ex) �����-1 ����0~8������  ��� �� 4�϶�, num�� �� ������ right=mid-1 => �� index ���� 0~3���� �� 
            else if(num > mid) leftIndex = midIndex + 1;	//	ex) �����+1 ����0~8������  ��� �� 4�϶�, num�� �� ũ��   left =mid+1 => �� index ���� 5~8�� ��
            else return true;								//	���� ��ġ�ϸ� ��������
        }
        return false;
    }
}
