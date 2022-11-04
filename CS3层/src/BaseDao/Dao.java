package BaseDao;

import java.sql.ResultSet;
import java.util.List;

import demoMain.Linkman;
import demoMain.User;

public interface Dao {
    boolean selectUser(User user);

	boolean addUser(User user);

	boolean addLinkman(Linkman linkman);

	List<Linkman> listLinkmans(String userPhone);

	List<Linkman> obscureListByName(String lkmName, String userPhone);

	List<Linkman> obscureListBymob(String lkmName, String userPhone);

	Linkman selectLinkman(Linkman linkman);

	boolean updateLinkman(Linkman linkman);

	boolean deleteLinkman(Linkman linkman);
}
