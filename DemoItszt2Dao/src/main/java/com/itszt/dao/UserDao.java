package com.itszt.dao;

import com.itszt.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {

	@Insert("insert into user(username,userpwd) values(#{username},#{userpwd})")
	@SelectKey(before = false,statement = "select last_insert_id()" ,keyProperty = "uid" ,keyColumn = "uid",resultType = Integer.class)
	public void addUser(User user);
	@Select("select * from user where uid=#{uid}")
	public User findUserByID( int uid);
	@Select("select * from user")
	public List<User> findUses();
}
