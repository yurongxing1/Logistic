package cn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.pojo.Material;
import cn.pojo.User;

/**
 * 仓库支出明细DAO层接口
 * @author Yu rongxing
 *
 */
public interface MaterialDao {

	/**
	 * 查询全部信息
	 * @return
	 */
	public List<Material> findMater();
	
	/**
	 * 模糊查询
	 * @param name
	 * @return
	 */
	public List<Material> findMohu(@Param("user_name")String user_name);
	
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	public int delematerid(Integer id);
	
	/**
	 * 查询用户id和姓名
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
