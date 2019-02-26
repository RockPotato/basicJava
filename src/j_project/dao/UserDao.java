package j_project.dao;

import java.util.ArrayList;

import j_project.vo.UserVO;

public interface UserDao 
{
	UserVO selectUser(String key, String value);

	void insertUser(UserVO user);

	ArrayList<UserVO> selectUserList();
	
}
