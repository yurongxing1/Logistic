package cn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.pojo.User;

/**
 * 用户DAO层接口
 * @author Yu rongxing
 *
 */
public interface UserDao {
	
	/**
	 * 登录查询
	 * @param user_name
	 * @param user_pwd
	 * @return
	 */
	public User findDl(@Param("user_name")String user_name,@Param("user_pwd")String user_pwd);
	
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	public int addUser(User user);
	
	/**
	 * 查询所有用户信息
	 * @param user
	 * @return
	 */
	public List<User> findAll();
	
	/**
	 * 根据姓名和性别模糊查询
	 * @param user_name
	 * @param user_age
	 * @return
	 */
	public List<User> findMohu(@Param("user_name")String user_name,@Param("user_sex")Integer user_sex);
	
	/**
	 * 根据用户id删除用户
	 * @param id
	 * @return
	 */
	public int deluserid(@Param("id") Integer id);
	
	/**
	 * 数据回显
	 * @param id
	 * @return
	 */
	public User findHui(@Param("id") Integer id);
	
	/**
	 * 修改信息
	 * @param user
	 * @return
	 */
	public int updateUser(User user);
	
}


