package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User, String>{
	
		/*User findByName(String name);

	    User findByNameAndAge(String name, Integer age);

	    @Query("from User u where u.name=:name")
	    User findUser(@Param("name") String name);
	    
	    //@Modifying  
	    @Query("delete from User s where s.id=:id")  
	    void deleteById(List<Long> id);   */

	    /*//根据id删除StormManage
	    @Query(value = "delete from user where id=?1 ", nativeQuery = true)
	    //@Modifying
	    public void deleteUserById(int id);

	    //修改Storm的state的状态
	    @Query(value = "update user u set u.age=?1 where u.id=?2 ", nativeQuery = true)
	    @Modifying
	    public void updateUserAge(int age,String id);

	    @Query(value = "insert into user values(1,2,3)",nativeQuery = true)
	    @Modifying
	    public void insertUser(String id,int age,String name);*/
}