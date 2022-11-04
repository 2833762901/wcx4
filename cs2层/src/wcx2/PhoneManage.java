package wcx2;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
 class DBUtil {
    public static Connection getConnection(){
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/wcx?"
         + "user=root&password=111111&useUnicode=true&characterEncoding=UTF8";
         //localhost�Ǳ���IP��3306�Ƕ˿ںţ�stock�����ݿ�����root������
         //���ݿ���û�����123456���������룬������ݿ����㱾���ϣ�IP��
         //�˿�Ӧ�þͲ��ø���
            try {
                Class.forName("com.mysql.jdbc.Driver");
                 conn = DriverManager.getConnection(url);
            } catch (ClassNotFoundException e) {
                // TODO �Զ����ɵ� catch ��
                e.printStackTrace();
            } catch (SQLException e) {
                // TODO �Զ����ɵ� catch ��
                e.printStackTrace();
            }
           return conn;
    }
    //�������ݿ�ǵù�
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            // TODO �Զ����ɵ� catch ��
            e.printStackTrace();
        }
    }
}
public class PhoneManage {
    /**
     * ���� users
     * �����û���Ϣ
     */
    public void addPhone(User[] users,Scanner sc) {
        // ������������û���Ϣ�����û�������
        System.out.println("������������");
        String name = sc.next();
        System.out.println("�������ֻ��ţ�");
        String tel = sc.next();
        User u = new User(name,tel);
        // ������������������
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = u;
                break;
            }
        }
    }
 
 
 
    /**
     * ���� users
     * ��ѯͨѶ¼�б�
     */
    public void showPhone(User[] users){
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                System.out.println(users[i].getName() + "\t" + users[i].getTel());
            }
        }
    }
 
 
 
    /**
     * ���� users
     * ɾ��ͨѶ¼�û���Ϣ
     */
    public void deletePhone(User[] users,Scanner sc){
        // ��ȡ����������û���
        System.out.println("������������");
        String delname = sc.next(); // �ڿ���̨����
        // �����û������Ҹ��û�����󽫸��û����û�����������ɾ��
        for (int i = 0; i < users.length; i++) {
            User y = users[i]; // ������ users[i] ��ֵ�� y
            if (y != null && delname.equals(y.getName())) {
                users[i] = null;
                System.out.println("ɾ���ɹ���");
                break;
            }
        }
    }
 
 
    public void changePhone(User[] users,Scanner sc) {
        // ��ȡҪ�޸��û�������
        System.out.println("��������Ҫ�޸��û������ƣ�");
        String editname = sc.next();
        // ���û������������ҵ���Ӧ���û���Ϣ
        for (User z : users) {
            if (z != null && editname.equals(z.getName())) {
                // �����û��ĵ绰�޸�Ϊ����������µ绰����
                System.out.println("�������µ绰��");
                z.setTel(sc.next());
                System.out.println("�޸ĳɹ���");
                break;
            }
        }
    }
 
}