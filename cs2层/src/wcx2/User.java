package wcx2;
//���������Begin-End֮�䰴��ע���и�������ʾ��д��ȷ�Ĵ���
/********** Begin **********/
//���� User ������
public class User {
 // �û�������˽�����ԣ��������绰����
 private String name; // �û�����
 private String tel; // �û��绰����
 
 // �޲ι���
 public User() {
 }
 // �вι���
 public User(String name, String tel) {
     this.name = name;
     this.tel = tel;
 }
 
 // ���úͻ�ȡ�û�������Ϣ
 public String getName() {
     return name;
 }
 
 public void setName(String name) {
     this.name = name;
 }
 
 public String getTel() {
     return tel;
 }
 
 public void setTel(String tel) {
     this.tel = tel;
 }
 
 
}
