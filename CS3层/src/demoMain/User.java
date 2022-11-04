package demoMain;

public class User {
    private String userName;
    private String  userPhone;
    private String password;
    
    public User() {
    }
    
    public User(String userPhone, String password) {
        this.userPhone = userPhone;
        this.password = password;
    }
    
    public User(String userName, String userPhone, String password) {
        this.userName = userName;
        this.userPhone = userPhone;
        this.password = password;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
