package Algorithm.PGMS.�Ҽ�ã��;

import java.util.ArrayList;

public class PGMS_�Ҽ�ã��_������ {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("17"));
    }
}

class Solution {
    //�Ҽ��� ����
    static int answer = 0;

    //numbers �湮 ���� üũ�ϴ� �迭
    static boolean visited[] = new boolean[7];

    //numbers�� �� �ڸ����� ���� �� �ִ� ������ ������ ArrayList
    static ArrayList<Integer> arr = new ArrayList<>();

    // 3) numbers�� �� �ڸ����� �����ϱ� ���� ����Լ�
    public static void recursive(String n, String temp, int length){

        // 11) ���� �������� ���� �ڸ��� == temp�� ����� �ڸ��� ���� Ȯ��
        if(temp.length()==length){
            // 12) �ߺ��� ������ ���� ArrayList�� �̹� �����ϴ� ������ Ȯ��
            if (!arr.contains(Integer.parseInt(temp))) {
                arr.add(Integer.parseInt(temp));
                return;
            }
        }

        // 4) n���� ���� ��  numbers�� Ž��
        for (int i = 0; i < n.length(); i++) {
            // 5) �湮 üũ �̹� �湮�� �ε����� ����Ѵ�.
            if (visited[i]) {
                continue;
            }

            // 6) �ӽú��� temp�� ���ڿ��� �����Ͽ� ���� ����
            temp += n.charAt(i);

            // 7) �湮 ó��
            visited[i] = true;

            // 8) ��� �Լ� ���� -> ���� ���ڸ� ���� ������� length ������ ����
            recursive(n, temp, length);

            // 9) ������ �Ϸ�Ǹ� ������ �湮ó���� �ε����� false�� ����
            visited[i] = false;

            // 10) temp �������� ������ �ڸ��� ���ڸ� �����ϰ� ����
            temp = temp.substring(0,temp.length()-1);
        }

    }

    // 15) �Ҽ� �Ǻ� �Լ�
    public static void calcPrimeNumber(int n) {
        // 16) 0�� 1�� �Ҽ��� �ƴϹǷ� �����Ѵ�.
        if (n == 0 || n == 1)   return;

        // 17) ���������� ������ �������� �Ҽ��� �ƴϹǷ� �޼ҵ� ����.
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0) return;
        }

        // 18) ���� ������ ��� ����ϸ� answer�� ���� ����
        answer++;
    }
    public int solution(String numbers) {
        // 1) numbers�� �� �ڸ����� ���� �ӽ� ����
        String temp = "";

        // 2) �Էµ� ���� ���� �ڸ����� ���� ����Լ� �ݺ� ����
        for (int i = 1; i <= numbers.length(); i++) {
            recursive(numbers,temp,i);
        }
        // 13) ������ ��� ���� ��� ArrayList�� Ž���Ѵ�.
        for(int num: arr){
            // 14) �� ������ �Ҽ����� Ȯ��
            calcPrimeNumber(num);
        }

        return answer;
    }
}
