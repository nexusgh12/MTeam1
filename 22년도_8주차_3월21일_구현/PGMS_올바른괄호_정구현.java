package Algorithm.PGMS.�ùٸ���ȣ;

import java.util.Stack;

public class PGMS_�ùٸ���ȣ_������ {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("()()"));
        System.out.println(s.solution("(())()"));
        System.out.println(s.solution(")()("));
        System.out.println(s.solution("(()("));
    }


}

class Solution{
    public boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);


            if(temp == ')' && stack.size() == 0) { //ù��° ��ȣ�� ')'�ϰ�� false ����
                return false;
            } else if(temp == ')' && stack.size() > 0) { //���� ��ȣ�� �ϳ� ����
                stack.pop();
            } else if(temp == '(') {//���� ��ȣ �ϳ� �߰�
                stack.push(temp);
            }
        }

        //������ȣ�� �ϳ� �̻� ����������� fasle ����
        if(stack.size() > 0) answer = false;

        return answer;

    }
}