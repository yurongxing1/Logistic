package cn.service;

import java.util.List;

import cn.pojo.User;

/**
 * User类Service层接口
 * @author Yu rongxing
 *
 */
public interface UserDaoService {

	/**
	 * 登录查询
	 * @param user_naem
	 * @param user_pwd
	 * @return
	 */
	public User findDl(String user_name,String user_pwd);
	
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	public int addUser(User user);
	
	/**
	 * 查询用户全部信息
	 * @return
	 */
	public List<User> findAll();
	
	/**
	 *根据姓名和性别模糊查询
	 * @param user_name
	 * @param user_sex
	 * @return
	 */
	public List<User> findMohu(String user_name,Integer user_sex);
	
	/**
	 * 删除用户信息
	 * @param id
	 * @return
	 */
	public int deluserid(Integer id);
	
	/**
	 * 回显信息
	 * @param id
	 * @return
	 */
	public User findHui(Integer id);
	
	/**
	 * 修改信息
	 * @param user
	 * @return
	 */
	public int updateUser(User user);
}
