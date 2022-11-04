package Service.ServiceImpl;

import demoMain.Linkman;
import demoMain.User;

import java.sql.ResultSet;
import java.util.List;

import BaseDao.Dao;
import BaseDao.BaseDaoImpl.BaseDaoImpl;
import Service.Service;

public class ServiceImpl implements Service {
    static Dao baseDao=new BaseDaoImpl();
    static User user=null;
    @Override
    public boolean selectUser(User user) {
        return baseDao.selectUser(user);
    }
	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return baseDao.addUser(user);
	}
	@Override
	public void baocun(User user) {
		// TODO Auto-generated method stub
		this.user=user;
	}
	@Override
	public boolean addLinkman(Linkman linkman) {
		// TODO Auto-generated method stub
		//查询该手机号是否已存在
		linkman.setLkmKey(user.getUserPhone());
		if(baseDao.selectLinkman(linkman)==null){
			return baseDao.addLinkman(linkman);
		}else{
			return false;
		}
		
	}
	@Override
	public List listLinkmans(Linkman linkman) {
		// TODO Auto-generated method stub
		if(linkman.getLkmName()==null||"".equals(linkman.getLkmName())){
			return baseDao.listLinkmans(user.getUserPhone());
		}else{
			boolean b=true;
			char[] chars=linkman.getLkmName().toCharArray();
			for(int i=0;i<chars.length;i++){
				if(chars[i]>='0'&&chars[i]<='9'){
					b=false;
					break;
				}
			}
			if(b){
				return baseDao.obscureListByName(linkman.getLkmName(),user.getUserPhone());
			}else{
				return baseDao.obscureListBymob(linkman.getLkmName(),user.getUserPhone());
			}
		}
	}
	
	@Override
	public boolean updateLinkman(Linkman linkman) {
		// TODO Auto-generated method stub
		return baseDao.updateLinkman(linkman);
	}
	@Override
	public boolean deleteLinkman(Linkman linkman) {
		// TODO Auto-generated method stub
		return baseDao.deleteLinkman(linkman);
	}
	
}
