package Service;

import java.sql.ResultSet;
import java.util.List;

import demoMain.Linkman;
import demoMain.User;

public interface Service {
    boolean selectUser(User user);


	boolean addUser(User user);


	void baocun(User user);


	boolean addLinkman(Linkman linkman);


	List<Linkman> listLinkmans(Linkman linkman);


	boolean updateLinkman(Linkman linkman);


	boolean deleteLinkman(Linkman linkman);
}
