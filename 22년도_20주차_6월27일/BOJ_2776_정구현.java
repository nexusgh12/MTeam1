package Algorithm.BaekjoonOnlineJudge.BOJ_2776;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_2776_������ {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //�׽�Ʈ ���̽� ��
        int T = Integer.parseInt(br.readLine());

        //������ ���� ��ø
        //HashSet ��� ���� : �ߺ� ���� �� contains�Լ� ����Ͽ� �� Ž��
        HashSet<Integer> note = new HashSet<>();

        for(int i = 0; i<T; i++){
            //�׽�Ʈ ���̽� ���۶����� �ʱ�ȭ
            note.clear();

            //ù��° ��ø ���� ����
            int N = Integer.parseInt(br.readLine());

            //���� �� �ֱ�
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                note.add(Integer.parseInt(st.nextToken()));
            }

            //�ι�° ��ø ���� ����
            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                //�ش� ���� ������ 1��ȯ
                if (note.contains(tmp)) {
                    bw.write("1\n");
                } else {//������ 0��ȯ
                    bw.write("0\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
