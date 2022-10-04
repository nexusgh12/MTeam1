package Algorithm.BaekjoonOnlineJudge.BOJ_1260;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260 {
    public static int N;
    public static LinkedList<Integer>[] nodeList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        //��� ����Ʈ  ��ü����
        nodeList = new LinkedList[N+1];

        //���� ����Ʈ ����
        for (int i = 0; i <= N; i++) {
            nodeList[i] = new LinkedList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            //������ �����ϴ� �� ������ ��ȣ �޾ƿ���
            st = new StringTokenizer(br.readLine());

        //�� ���� �ʱ�ȭ
        int node1 = Integer.parseInt(st.nextToken());
        int node2 = Integer.parseInt(st.nextToken());

        nodeList[node1].add(node2);
        nodeList[node2].add(node1);

        Collections.sort(nodeList[node1]);
        Collections.sort(nodeList[node2]);
    }



        //String builder ��ü ����(���ڿ� ���϶� ���)
        StringBuilder dfsResult = new StringBuilder();
        StringBuilder bfsResult = new StringBuilder();

        //��� �湮 ���� Ȯ��
        boolean[] dfsVisited = new boolean[N +1];
        boolean[] bfsVisited = new boolean[N +1];

        dfs(V, dfsVisited, dfsResult);
        bfs(V, bfsVisited, bfsResult);



        bw.write(dfsResult + "\n" + bfsResult);
        bw.flush();
        bw.close();
        br.close();

    }

    //���� �켱 Ž��(DFS)
    public static void dfs(int node, boolean[] visited, StringBuilder sb) {
        //�湮 ���� �˻�
        if(visited[node]) return;

        //�̹湮 ����� �� true
        visited[node] = true;

        // �湮�� ��� �߰�
        sb.append(node + " ");

        //���� ��� ��� ȣ��
        for (int nextNode : nodeList[node]) {
            dfs(nextNode, visited, sb);
        }
    }


    public static void bfs(int node, boolean[] visited, StringBuilder sb) {
        //��带 ���� ť ����
        Queue<Integer> queue = new LinkedList<Integer>();

        //��带 ť�� �߰�
        queue.offer(node);

        //ť�� �ִ� ��带 Ž��
        while (!queue.isEmpty()) {
            //ť���� ��� ����
            node = queue.poll();

            //�ش� ��� �湮 ���� �˻�
            if (visited[node]) continue;

            //��� �湮 ����
            visited[node] = true;

            //�湮�� ��� ��� �߰�
            sb.append(node + " ");

            //���� ��� ť�� �߰�
            for (int nextNode : nodeList[node]) {
                queue.add(nextNode);
            }
        }


    }

}
