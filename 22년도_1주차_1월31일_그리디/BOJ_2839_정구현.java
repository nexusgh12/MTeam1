package Algorithm.BaekjoonOnlineJudge.BOJ_2839;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2839 {
    public static void main(String[] args) throws IOException {
        //buffered Reader/Writer�� �̿��� ������ �����
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // ����ؾ� �� ������ ����
        int N = Integer.parseInt(st.nextToken());

        int result = 0;

        //5kg���� ������ ������ �� ���� 3kg���� ī��Ʈ
        while (N % 5 != 0) {
            N -=3;
            result++;
        }

        //������ �������� �ʰ� N�� ������ ��� -1���
        if (N < 0) {
            result = -1;
        } else {
            //5kg���� ���� ������ ���ϱ�
            result+=N/5;
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
//public class BOJ_13164 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int N = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());
//        int [] arr = new int[N];
//        int[] diff = new int[N-1];
//
//        st = new StringTokenizer(br.readLine());
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        for (int i = 0; i < N - 1; i++) {
//            diff[i] = arr[i+1] - arr[i];
//        }
//        Arrays.sort(diff);
//
//        int result = 0;
//
//        for (int i = 0; i < N - K; i++) {
//            result += diff[i];
//        }
//
//        bw.write(result + "\n");
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//}