package Algorithm.PGMS.���¼��ڴ���;

public class PGMS_���¼��ڴ��ϱ�_������ {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        int answer = 45;
        for(int i=0; i<numbers.length; i++){
            answer += -numbers[i];
        }
    }
}
