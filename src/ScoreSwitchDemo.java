/*
 *���ߣ�
 *ʱ�䣺
 *���ܣ��Ĵ�ʹ��switch��������ѧ���ɼ��������Ӧ�ĵȼ�
 */

import java.util.*;

class ScoreSwitchDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ������ʾ���ӿ���̨��ȡѧ���ɼ�
        System.out.println("������ѧ���ɼ���");
        String s1 = in.nextLine();  //�ӿ���̨�����ַ���

        // ��String-->int
        int score = Integer.parseInt(s1);
        System.out.println("�ɼ�Ϊ:" + score);

        // �жϳɼ��ȼ�
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("��");
                break;
            case 8:
                System.out.println("��");
                break;
            case 7:
                System.out.println("��");
                break;
            case 6:
                System.out.println("����");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("������");
                break;
            default:
                System.out.println("���ݴ������������룡");
        }
        in.close();
    }
}

