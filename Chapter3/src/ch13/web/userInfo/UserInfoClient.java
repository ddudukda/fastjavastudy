package ch13.web.userInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDao;
import ch13.domain.userInfo.dao.mysql.UserInfoMysqlDao;
import ch13.domain.userInfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbtype = prop.getProperty("DBTYPE");
		
		UserInfo userinfo = new UserInfo();
		userinfo.setUserId("testID");
		userinfo.setPasswd("12345");
		userinfo.setUserName("Tomas");
		UserInfoDao userinfodao = null;
		
		if(dbtype.equals("ORACLE")) {
			userinfodao = new UserInfoOracleDao();
		}
		else if(dbtype.equals("MYSQL")) {
			userinfodao = new UserInfoMysqlDao();
		}else {
			System.out.println("db error");
			return;
		}
			
		userinfodao.insertUserInfo(userinfo);
		userinfodao.updateUserInfo(userinfo);
		userinfodao.deleteUserInf(userinfo);
	}

}
