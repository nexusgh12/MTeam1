package Algorithm.PGMS.PGMS_���ַΰǼ�;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


/*
�������� [0, 0]���� [N - 1, N - 1]���� ���ַθ� �Ǽ��� �ּڰ��� ���ϴ� ������.
��, ���θ� �Ǽ��ϴµ� �ڳʴ� 500���� �߰������� ����� ��� ������
������ ���� �������� �����ʴ´ٸ� ����(100)+�ڳ�(500)��
�����Ǵ� ���� ����⶧���� 600���� ����� ��� �ȴ�.




�ܼ� 2���� �迭�� ���� ����� �ּҰ����� Ŭ ���
�湮���� �ʵ��� �����ϸ� �ȵǴµ�,
���� ����� ����� �ٸ��� ����� ���
���� �����Ǵ� ��찡 �߻��ϱ� ������
������� �Բ� �����ϴ� 3������ �ּҰ����� �����ؾ��Ѵ�.
*/
public class PGMS_���ַΰǼ�_������ {
    public int solution(int[][] board) {
        int[] dy = {-1, 1, 0, 0}, dx = {0, 0, -1, 1};
        int N = board.length;

        int[][][] cost = new int[N][N][4];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                Arrays.fill(cost[i][j], Integer.MAX_VALUE);

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 0, 1});
        queue.add(new int[]{0, 0, 0, 3});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int k = 0; k < 4; k++) {
                int ny = cur[0] + dy[k], nx = cur[1] + dx[k];
                int c = cur[2] + (cur[3] == k ? 100 : 600);

                if (ny < 0 || nx < 0 || ny >= N || nx >= N || board[ny][nx] == 1 || cost[ny][nx][k] <= c) continue;
                cost[ny][nx][k] = c;
                queue.add(new int[]{ny, nx, c, k});
            }
        }

        return Arrays.stream(cost[N - 1][N - 1]).min().getAsInt();
    }
}