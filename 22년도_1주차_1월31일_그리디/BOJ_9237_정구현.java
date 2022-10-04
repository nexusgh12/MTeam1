package Algorithm.BaekjoonOnlineJudge.BOJ_9237;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_9237 {
    public static void main(String[] args) throws IOException {
        //buffered Reader/Writer�� �̿��� ������ �����
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //������ ��
        int N = Integer.parseInt(st.nextToken());
        //��� ��
        int result = 0;

        //�� ������ �ڶ�µ� ������ �ɸ������� ��Ÿ�� �迭
        ArrayList<Integer> t = new ArrayList<Integer>();
        st =new StringTokenizer(br.readLine());

        //�迭�� ������ ����
        while(st.hasMoreTokens()){
            t.add(Integer.parseInt(st.nextToken()));
        }

        //������ �ڶ�µ� �ɸ��� �ð� �������� ����
        Collections.sort(t, Collections.reverseOrder());

        // ������ �ڶ�� �ð� + ���� �ɴµ� ������ �ð�
        for (int i = 0; i < N; i++) {
            t.set(i, t.get(i) + i);
        }

        // ������ �ڶ�µ� ���� �����ɸ��� �ð� + ������ ������ ���� ������� �ʴ��ϴ� ��
        result = Collections.max(t) + 2;

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
