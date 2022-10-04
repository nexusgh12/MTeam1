package Algorithm.BaekjoonOnlineJudge.BOJ_1244;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1244_������ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        // ����ġ�� ����
        int s_num =Integer.parseInt(br.readLine());

        //�� ����ġ�� ����(����ġ�� ������ŭ ����)
        int switches[] = new int[s_num];
        st = new StringTokenizer(br.readLine());

        //�迭 �ʱ�ȭ
        for (int i = 0; i < s_num; i++) {
            switches[i] = Integer.parseInt(st.nextToken());
        }

        //�л��� ����
        int p_num = Integer.parseInt(br.readLine());

        while(p_num>0){

            st = new StringTokenizer(br.readLine());
            //�л��� ������ ����ġ ��ġ
            int gender = Integer.parseInt(st.nextToken());
            int location = Integer.parseInt(st.nextToken());

            //������ ���
            if(gender==1){
                for(int i = location-1; i<s_num; i+=location){
                    //0�̸� 1��, 1�̸� 0���� ����
                    switches[i] = switches[i] == 0? 1: 0;
                }
            }
            //�����ϰ��
            else{
                location = location -1;
                switches[location] = (switches[location]+1) % 2;
                for(int i=1;i<switches.length;i++) {
                    if((location-i) >=0 && (location+i)<switches.length) {
                        if(switches[location -i] == switches[location+i]) {
                            switches[location-i] = (switches[location-i]+1) % 2;
                            switches[location+i] = (switches[location+i]+1) % 2;
                        }
                        else
                            break;
                    }
                }
            }
            p_num--;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<switches.length;i++) {
            sb.append(switches[i]+" ");
            if((i+1) %20 == 0) {
                sb.setLength(sb.length()-1);
                System.out.println(sb.toString());
                sb.delete(0, sb.length());
            }

            if(i == switches.length-1 && (i+1)%20 != 0) {
                sb.setLength(sb.length()-1);
                System.out.print(sb.toString());
            }
        }



    }
}
