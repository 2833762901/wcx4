package wcx2;
import java.util.Scanner;
//����Ϊ����ͨѶ¼���ܿ��ƣ���������
public class MenuPhone {
 public static void main(String[] args) {
     User[] users = new User[50]; // ����һ���������飬���ڴ�����е�ͨѶ¼��Ϣ
     // ���������Begin-End֮�䰴��ע���и�������ʾ��д��ȷ�Ĵ���
     /********** Begin **********/
     Scanner sc = new Scanner(System.in);
     // ʵ���� PhoneManage ����
     PhoneManage phoneManage = new PhoneManage();
     while (true) { //����һ��ѭ�������ظ�ִ�д�ѭ���Ĳ���
         System.out.println("ͨѶ¼��Ϣ����ҳ��");
         System.out.println("**********");
         System.out.println("1.����");
         System.out.println("2.�鿴");
         System.out.println("3.ɾ��");
         System.out.println("4.�޸�");
         System.out.println("5.�˳�");
         System.out.println("**********");
         System.out.println("������ѡ��Ĳ�����");
         // ��ȡ��������
         String str = sc.next();
         if ("1".equals(str)) {
             // �����û�
             phoneManage.addPhone(users,sc);
         } else if ("2".equals(str)) {
             // ��ѯ�����û���Ϣ
             phoneManage.showPhone(users);
         } else if ("3".equals(str)) {
             // ɾ���û���Ϣ
             phoneManage.deletePhone(users,sc);
         } else if ("4".equals(str)) {
             // �޸��û���Ϣ
             phoneManage.changePhone(users,sc);
         } else if ("5".equals(str)) {
             // �˳�����
             System.out.println("�˳��ɹ���");
             break;
         } else {
             System.out.println("ѡ�����");
         }
     }

 }
}