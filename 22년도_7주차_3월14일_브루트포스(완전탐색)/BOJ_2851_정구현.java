package Algorithm.BaekjoonOnlineJudge.BOJ_2851;

import java.io.*;

public class BOJ_2851_������ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int result = 0;
        int score[] = new int[10];

        //������ ������ �����ϴ� �迭 ����
        for (int i = 0; i < 10; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 10; i++) {
            //������ ���� ȹ��
            sum += score[i];

            /*
                ���밪 ��
                i��°�� i-1��° ȹ���������� ������ 100�� �� ���� ���Ͽ�
                i��°�� i-1��°���� 100�� �� ����� ���϶� ����� ����
            */
            if(Math.abs(100-(sum-score[i])) >= Math.abs(100-sum)){
                result=sum;
            }
        }

        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
