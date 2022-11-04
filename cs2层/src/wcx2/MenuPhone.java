package wcx2;
import java.util.Scanner;
//此类为整个通讯录的总控制，负责启动
public class MenuPhone {
 public static void main(String[] args) {
     User[] users = new User[50]; // 创建一个对象数组，用于存放所有的通讯录信息
     // 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
     /********** Begin **********/
     Scanner sc = new Scanner(System.in);
     // 实例化 PhoneManage 对象
     PhoneManage phoneManage = new PhoneManage();
     while (true) { //创建一个循环用于重复执行此循环的操作
         System.out.println("通讯录信息管理页面");
         System.out.println("**********");
         System.out.println("1.新增");
         System.out.println("2.查看");
         System.out.println("3.删除");
         System.out.println("4.修改");
         System.out.println("5.退出");
         System.out.println("**********");
         System.out.println("请输入选择的操作：");
         // 获取键盘输入
         String str = sc.next();
         if ("1".equals(str)) {
             // 新增用户
             phoneManage.addPhone(users,sc);
         } else if ("2".equals(str)) {
             // 查询所有用户信息
             phoneManage.showPhone(users);
         } else if ("3".equals(str)) {
             // 删除用户信息
             phoneManage.deletePhone(users,sc);
         } else if ("4".equals(str)) {
             // 修改用户信息
             phoneManage.changePhone(users,sc);
         } else if ("5".equals(str)) {
             // 退出操作
             System.out.println("退出成功！");
             break;
         } else {
             System.out.println("选择错误！");
         }
     }

 }
}