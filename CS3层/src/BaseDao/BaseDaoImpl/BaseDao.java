package BaseDao.BaseDaoImpl;

import utils.DBUtils;
import org.apache.commons.beanutils.BeanUtils;

import demoMain.User;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseDao {
	public int update(String sql,Object[] params){
		//连接对象
        Connection conn = null;
        //数据库操作对象
        PreparedStatement pstmt=null;
        int b=0;
        {
            try {
                conn = DBUtils.getConnection();
                pstmt = conn.prepareStatement(sql);
                for (int i = 0; i < params.length ; i++) {
                    pstmt.setObject(i+1,params[i]);
                }
                b = pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                DBUtils.close(conn,pstmt);
            }
        }
        return b;
    }
    public <T>List<T> select(String sql, Object[] params, Class T) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet res = null;
        T t=null;
        List list=new ArrayList();
        try {
            conn = DBUtils.getConnection();
            pstmt = conn.prepareStatement(sql);
            if (params!=null){
                for (int i = 0; i < params.length; i++) {
                    pstmt.setObject(i + 1, params[i]);
                }
            }
            res = pstmt.executeQuery();
            ResultSetMetaData metaData = res.getMetaData();
            while (res.next()) {
                t= (T) T.newInstance();
                int columnCount = metaData.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    String columnName = metaData.getColumnName(i + 1);
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    Object object = res.getObject(columnName);
                    BeanUtils.copyProperty(t,columnLabel,object);
                }
                list.add(t);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(conn, pstmt, res);
        }
        return list;
    }
    public ResultSet selectResultSet(String sql, Object[] params, Class T) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet res = null;
        try {
            conn = DBUtils.getConnection();
            pstmt = conn.prepareStatement(sql);
            if (params!=null){
                for (int i = 0; i < params.length; i++) {
                    pstmt.setObject(i + 1, params[i]);
                }
            }
            res = pstmt.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.close(conn, pstmt);
        }
        return res;
    }

}
