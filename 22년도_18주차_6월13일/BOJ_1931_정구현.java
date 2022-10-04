package Algorithm.BaekjoonOnlineJudge.BOJ_1931;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_1931_������ {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //ȸ���� ����
        int num = Integer.parseInt(st.nextToken());

        //�ִ� ȸ�� ��
        int cnt = 0;

        //���� ȸ�� ���� �ð�
        int end_time = 0;

        int[][] arr = new int[num][2];

        for(int i = 0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        //����ð��� ������� ���۽ð��� ���������� ����
        Arrays.sort(arr, (o1, o2)->{
            if(o1[1]==o2[1])
                return o1[0] - o2[0];
            return o1[1] - o2[1];
        });

        //���� ȸ�� ����ð��� ���� ȸ�� ���۽ð����� �������
        for(int i = 0; i<num; i++){
            if(end_time <= arr[i][0]){
                end_time = arr[i][1];
                cnt++;
            }
        }

        bw.write(cnt+"");
        bw.flush();
        bw.close();
        br.close();

    }
}
