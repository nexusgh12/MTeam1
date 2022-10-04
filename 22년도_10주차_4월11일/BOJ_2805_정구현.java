package Algorithm.BaekjoonOnlineJudge.BOJ_2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2805_������{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputArray = br.readLine().split(" ");

            int treeCount = Integer.parseInt(inputArray[0]); // ������ ��
            int minLengthTree = Integer.parseInt(inputArray[1]); // ��� ���������� ������ ����


            String[] preTreeArray = br.readLine().split(" ");
            int[] treeArray = new int[treeCount]; // ���� ���̵��� �迭
            for(int i=0; i<preTreeArray.length; i++){
                treeArray[i] = Integer.parseInt(preTreeArray[i]);
            }
            Arrays.sort(treeArray); // ������������ ����
            int lastInt = treeArray[treeCount-1];

            int maxHeight = lastInt; // �鳯�� �ִ� ����
            int minHeight = 0; // �鳯�� �ּ� ����
            int middle = 0;

            while(maxHeight >= minHeight){
                middle = (minHeight+maxHeight)/2;

                int cutTree = 0; // �鳯�� ������ �߶��� �� ���� ���� ����
                long sumCutTree = 0; // �߶� ���� ���̵��� ��, long�� ������ ������ ���� int ������ �Ѿ ���� �ִ�.

                for(int j=0; j<treeArray.length; j++){

                    cutTree = treeArray[j] - middle; // �̺�Ž������ ������ �鳯�� ���̸� ã�ư���. �߰� ������ �������� �߶󺸰�
                    // ������ ����������.

                    if(cutTree <0){
                        cutTree = 0; // �߸��� ������ 0�̱� ������ ���̳ʽ� ���� ������ �� ����.
                    }
                    sumCutTree += cutTree;
                }

                if(sumCutTree >= minLengthTree){ // ������ �߶� ���� ���̵��� ���� �ּ������� �������ߵǴ� ���� ���̺��� Ŭ ��

                    minHeight = middle + 1; // ȯ���� �����ؼ� �� ���� �߶󰡷��� �鳯�� ���̸� ������ ������ ���ݸ� �߶󰡾� �Ѵ�.

                }else if(sumCutTree < minLengthTree){ // ������ �߶� ���� ���̵��� ���� �ּ������� �������� �Ǵ� ���� ���̺��� ���� ��

                    maxHeight = middle - 1; // �ʿ��� �������̺��� �߶� ���� ���̵��� ���� �۱� ������ �鳯�� ���̸� ���缭 �� ��� ����� �Ѵ�.

                }

            }

            System.out.println(maxHeight);    // �鳯�� ���̸� ������ �� �ִ� ���̿��� �ִ밪
        }
}
