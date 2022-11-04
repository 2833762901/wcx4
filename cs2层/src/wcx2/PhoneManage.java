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
         //localhost是本地IP，3306是端口号，stock是数据库名，root是连接
         //数据库的用户名，123456是连接密码，如果数据库在你本机上，IP和
         //端口应该就不用改了
            try {
                Class.forName("com.mysql.jdbc.Driver");
                 conn = DriverManager.getConnection(url);
            } catch (ClassNotFoundException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            } catch (SQLException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            }
           return conn;
    }
    //用完数据库记得关
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
    }
}
public class PhoneManage {
    /**
     * 参数 users
     * 新增用户信息
     */
    public void addPhone(User[] users,Scanner sc) {
        // 将键盘输入的用户信息存入用户对象中
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入手机号：");
        String tel = sc.next();
        User u = new User(name,tel);
        // 将对象放入对象数组中
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = u;
                break;
            }
        }
    }
 
 
 
    /**
     * 参数 users
     * 查询通讯录列表
     */
    public void showPhone(User[] users){
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                System.out.println(users[i].getName() + "\t" + users[i].getTel());
            }
        }
    }
 
 
 
    /**
     * 参数 users
     * 删除通讯录用户信息
     */
    public void deletePhone(User[] users,Scanner sc){
        // 获取键盘输入的用户名
        System.out.println("请输入姓名：");
        String delname = sc.next(); // 在控制台输入
        // 根据用户名查找该用户，最后将该用户从用户对象数组中删除
        for (int i = 0; i < users.length; i++) {
            User y = users[i]; // 把所有 users[i] 赋值给 y
            if (y != null && delname.equals(y.getName())) {
                users[i] = null;
                System.out.println("删除成功！");
                break;
            }
        }
    }
 
 
    public void changePhone(User[] users,Scanner sc) {
        // 获取要修改用户的名称
        System.out.println("请输入你要修改用户的名称：");
        String editname = sc.next();
        // 在用户对象数组中找到对应的用户信息
        for (User z : users) {
            if (z != null && editname.equals(z.getName())) {
                // 将该用户的电话修改为键盘输入的新电话号码
                System.out.println("请输入新电话：");
                z.setTel(sc.next());
                System.out.println("修改成功！");
                break;
            }
        }
    }
 
}