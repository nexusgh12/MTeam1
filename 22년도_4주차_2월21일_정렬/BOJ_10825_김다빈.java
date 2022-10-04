package study006;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
 
public class BOJ_10825_��ٺ� {
	/*
	 * IO (Input, Output)�� �׻� ����(IO Exception)�� �߱� ������ try-catch �������� ��� ����ϴ� ���� �Ϲ����̴�.
	 
	 * ��� ��Ʈ���� ���� ���� �ݾƾ��Ѵ�.
		Stream : ���� ���� �о���̰� ���� ���� ������ ���
		InputStream : �Է� ��ġ(Ű���� ��)�� ���� ����ڿ��� �Է¹��� ������ �о�´�.
		OutputStream : ����ڿ��� �Է¹��� ������ �����ġ(����� ��)�� ����Ѵ�. System.out.print�� ���
		FileInputStream : ������ ������ �о�´�.
	 	FileOutputStream : ������ ������ ���� ����.
		BufferedInputStream : �о�� ������ �ѹ��� ��Ƽ� �о�帮�� ������Ʈ������ ��� ���������� �Ұ����ϴ�.
		BufferedOutputStream : �� ������ �� ���� ��Ƽ� ���Ͽ� ���� ������Ʈ������ ��� ���������� �Ұ����ϴ�.
		 
	 * Reader�� Writer
		Reader : ���� ������ �о�帮�� ��Ʈ������ ���ڸ� �д´�.
		Writer : ���� ������ ���� ��Ʈ��
		BufferedReader : �о�� ������ �� ���� ��Ƽ� �о�帮�� ���� ��Ʈ��
		BufferedWriter : �� ������ �� ���� ��Ƽ� ���Ͽ� ���� ������Ʈ��
		
	 */
	
	
    public static void main(String args[]) throws Exception {
    	//	BufferedReader ��� 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //	br(BufferedReader)�� ���ڿ��� �Է¹޾� ���������� ��ȯ
        int N = Integer.parseInt(br.readLine());
        //	���� 2�����迭 arr�� [�Է¹��� ��][4]; -> N��ŭ�� ���� �ݺ��Ǿ�� �ϹǷ�, 4 = �̸�, ��, ��, ������
        String[][] arr = new String[N][4];
        //	i�� N��ŭ �ݺ��Ѵ�.
        for (int i = 0; i < N; i++) {
            //	�迭[0] = ���� �Է¹޴´�. split����ؼ� " "�� �������� �����ϰ� �Ѵ�.
        	arr[i] = br.readLine().split(" ");
        }
        
        //	Comparator�� Comparable ���
        //	Comparable : Ŭ������ �⺻ ���� ������ �����ϴ� �������̽�
        //	Comparator : �⺻ ���� ���ذ��� �ٸ��� ������ �� ����ϴ� �������̽�
        Arrays.sort(arr, new Comparator<String[]>() {
        	//	�������̵� : �޼����� �����Ƿ� �θ�Ŭ������ ������ �ִ� �޼��带 ��ӹ޾� �ڽĿ� �°� �����ؼ� ���
            @Override
            public int compare(String[] s1, String[] s2) {
                if (Integer.parseInt(s1[1]) == Integer.parseInt(s2[1])) {
                    if (Integer.parseInt(s1[2]) == Integer.parseInt(s2[2])) {
                        if (Integer.parseInt(s1[3]) == Integer.parseInt(s2[3])) {
                            
                            //������ ������ ���ٸ� ���� ��������
                            return s1[0].compareTo(s2[0]);
                        }
        
                        //�������� ���� �������� ���� ��, ���� ������ ��������
                        return Integer.compare(Integer.parseInt(s2[3]), Integer.parseInt(s1[3]));
 
                    }
                    //���� ���� ���� ��, ���� ������ ��������
                    return Integer.compare(Integer.parseInt(s1[2]), Integer.parseInt(s2[2]));
                }
                //���������� ��������
                return Integer.compare(Integer.parseInt(s2[1]), Integer.parseInt(s1[1]));
            }
 
        });
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0]);
 
        }
    }
}