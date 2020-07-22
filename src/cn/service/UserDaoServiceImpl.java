package cn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.dao.UserDao;
import cn.pojo.User;

@Transactional
@Service("userService")
public class UserDaoServiceImpl implements UserDaoService {
	@Autowired
	private UserDao userdao;
	
	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	/**
	 * 登录查询
	 */
	@Override
	public User findDl(String user_name, String user_pwd) {
		return userdao.findDl(user_name, user_pwd);
	}

	/**
	 * 注册用户
	 */
	@Override
	public int addUser(User user) {
		return userdao.addUser(user);
	}

	/**
	 * 查询全部
	 */
	@Override
	public List<User> findAll() {
		return userdao.findAll();
	}

	/**
	 * 模糊查询
	 */
	@Override
	public List<User> findMohu(String user_name, Integer user_sex) {
		return userdao.findMohu(user_name, user_sex);
	}

	/**
	 * 删除用户信息
	 */
	@Override
	public int deluserid(Integer id) {
		return userdao.deluserid(id);
	}

	/**
	 * 回显信息
	 */
	@Override
	public User findHui(Integer id) {
		return userdao.findHui(id);
	}

	/**
	 * 修改信息
	 */
	@Override
	public int updateUser(User user) {
		return userdao.updateUser(user);
	}
	

}
