package Algorithm.BaekjoonOnlineJudge.BOJ_10819;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10819_������ {

    static int N;
    static int[] arr, temp;
    static int result;
    static boolean[] visited;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        visited = new boolean[N];
        result = 0;
        temp = new int[N]; // ������ ���̽��� ����� �ӽ� �����

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        permutation(0);
        System.out.println(result);
    }

    private static void permutation(int count) {
        //���� ������ ���밪�� ������
        if (count == N) {
            int sum = 0;
            for (int i = 0; i < N - 1; i++) {
                sum += Math.abs(temp[i] - temp[i + 1]);
            }
            result = Math.max(result, sum);
            return;
        }

        //����Լ� ȣ�� �� �湮üũ
        for (int i = 0; i < N; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            temp[count] = arr[i];
            permutation(count + 1);
            visited[i] = false;
        }
    }
}