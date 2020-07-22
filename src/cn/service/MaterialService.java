package cn.service;

import java.util.List;

import cn.pojo.Material;
import cn.pojo.User;


/**
 * 仓库支出明细service层接口
 * @author Yu rongxing
 *
 */
public interface MaterialService {

	/**
	 * 查询全部信息
	 * @return
	 */
	public List<Material> findMater();
	
	/**
	 * 模糊查询
	 * @param user_name
	 * @return
	 */
	public List<Material> findMohu(String user_name);
	
	/**
	 * 根据id删除信息
	 * @param id
	 * @return
	 */
	public int delematerid(Integer id);
	
	/**
	 * 查询用户名
	 * @return
	 */
	public List<Material> findusername();
	
	/**
	 * 添加仓库信息
	 * @param material
	 * @return
	 */
	public int addMater(Material material);
}
