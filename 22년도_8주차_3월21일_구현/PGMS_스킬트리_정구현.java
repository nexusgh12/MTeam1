package Algorithm.PGMS.��ųƮ��;

public class PGMS_��ųƮ��_������ {
    public static void main(String[] args) {
        Solution s = new Solution();

    }


}

class Solution{
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String skillTree : skill_trees){
            String tempSkill = skillTree;

            for(int i = 0; i < skillTree.length(); i++){
                String s = skillTree.substring(i,i+1);
                if(!skill.contains(s)){
                    tempSkill= tempSkill.replace(s, ""); //�ʼ� ��ų�� �ƴҰ�� ����ó��

                }
            }
            //temp���ڿ��� �տ������� ó�� �߰ߵǴ� �ε����� ��ȯ
            if(skill.indexOf(tempSkill)==0)
                answer++;
        }


        return answer;

    }
}