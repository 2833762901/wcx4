package BaseDao.BaseDaoImpl;

import demoMain.Linkman;
import demoMain.User;

import java.sql.ResultSet;
import java.util.List;

import BaseDao.Dao;

public class BaseDaoImpl extends BaseDao implements Dao {
    @Override
    public boolean selectUser(User user) {
        String sql="select * from user where userPhone=? and password=?";
        Object[] params={user.getUserPhone(),user.getPassword()};
        List<Object> list = super.select(sql, params, User.class);
        return list==null?false:true;
    }

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		String sql="insert into user values (?,?,?)";
		Object[] params={user.getUserName(),user.getUserPhone(),user.getPassword()};
		return super.update(sql, params)==0?false:true;
	}

	@Override
	public boolean addLinkman( Linkman linkman) {
		// TODO Auto-generated method stub
		String sql="insert into linkman values (null,?,?,?,?,?,?,?)";
		Object[] params={linkman.getLkmKey(),linkman.getLkmName(),linkman.getLkmMobile(),linkman.getLkmEmail(),linkman.getLkmGroup(),linkman.getLkmAddr(),linkman.getLkmRemark()};
		return super.update(sql, params)==0?false:true;
	}

	@Override
	public Linkman selectLinkman(Linkman linkman) {
		// TODO Auto-generated method stub
		String sql="select * from linkman where lkmMobile=? and lkmKey=?";
		Object[] params={linkman.getLkmMobile(),linkman.getLkmKey()};
		List list=super.select(sql, params, Linkman.class);
		return  list.size()==0?null:(Linkman)list.get(0);
	}

	@Override
	public List<Linkman> listLinkmans(String userPhone) {
		// TODO Auto-generated method stub
		String sql="select * from linkman where lkmKey=?";
		Object[] params={userPhone};
		return super.select(sql, params, Linkman.class);
	}

	@Override
	public List<Linkman> obscureListByName(String lkmName, String userPhone) {
		// TODO Auto-generated method stub
		String name="%"+lkmName+"%";
		String sql="select * from linkman where lkmKey=? and lkmName like ?";
		Object[] params={userPhone,name};
		return super.select(sql, params, Linkman.class);
	}

	@Override
	public List<Linkman> obscureListBymob(String lkmName, String userPhone) {
		// TODO Auto-generated method stub
		String name="%"+lkmName+"%";
		String sql="select * from linkman where lkmKey=? and lkmMobile like ?";
		Object[] params={userPhone,name};
		return super.select(sql, params, Linkman.class);
	}

	@Override
	public boolean updateLinkman(Linkman linkman) {
		// TODO Auto-generated method stub
		String sql="update linkman set  lkmName=?,lkmMobile=?, lkmEmail=?,lkmAddr=?,lkmGroup=?, lkmRemark=? where lkmId=?;";
		Object[] params={linkman.getLkmName(),linkman.getLkmMobile(),linkman.getLkmEmail(),linkman.getLkmAddr(),linkman.getLkmGroup(),linkman.getLkmRemark(),linkman.getLkmId()};
		return super.update(sql, params)==0?false:true;
	}

	@Override
	public boolean deleteLinkman(Linkman linkman) {
		// TODO Auto-generated method stub
		String sql="delete from linkman where lkmId=?";
		Object[] params={linkman.getLkmId()};
		return super.update(sql, params)==0?false:true;
	}

}
