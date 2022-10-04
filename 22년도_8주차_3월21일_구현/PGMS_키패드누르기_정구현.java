package Algorithm.PGMS.Ű�е崩����;

public class PGMS_Ű�е崩����_������ {
    public static void main(String[] args) {
        int[] num = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        Solution s = new Solution();
        System.out.println(s.solution(num, "right"));

    }


}

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        //�޼հ� �������� �ʱ� ������ġ ����
        int left = 10;//*
        int right = 12;//#
        for (int num : numbers) {
            if (num == 0) num = 11; //���ڰ� 0�ϰ�� ������ġ 11�� ����
            switch (num % 3) {
                case 0 : //3, 6, 9, 12(#) -> Right
                    answer.append("R");
                    right = num; //������ ��ġ ����
                    break;

                case 1 : //1, 4, 7, 10(*) -> Left
                    answer.append("L");
                    left = num; //�޼� ��ġ ����
                    break;

                case 2 : //2, 5, 8, 11(0) -> �����
                    //�Է��ؾ� �� ���ڿ� ���� �հ����� �Ÿ� ���
                    //��ȣ���� �Ÿ� ��� = ((���� ��ȣ - ���� ��ȣ)/3) + ((���� ��ȣ - ���� ��ȣ)%3)
                    int distanceL = (Math.abs(num-left) % 3) + (Math.abs(num-left) / 3);
                    int distanceR = (Math.abs(num-right) % 3) + (Math.abs(num-right) / 3);


                    if (distanceL < distanceR) {//�޼��� ��ġ�� �� �������
                        answer.append("L");
                        left = num;

                    } else if (distanceR < distanceL) {//�������� ��ġ�� �� �������
                        answer.append("R");
                        right = num;
                    } else { //���� �Ÿ��� ������� �������������� �޼��������� ���� Ȯ��
                        answer.append(hand.equals("right") ? "R" : "L");
                        if (hand.equals("right")) right = num;
                        else left = num;
                    }
                    break;

            }
        }
        return answer.toString();
    }
}


