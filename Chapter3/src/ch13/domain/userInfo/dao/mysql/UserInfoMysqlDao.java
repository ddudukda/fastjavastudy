package ch13.domain.userInfo.dao.mysql;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into mysqlDB userId = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into mysqlDB userId = " + userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInf(UserInfo userInfo) {
		System.out.println("Delete from mysqlDB userId = " + userInfo.getUserId());

		
	}

}
