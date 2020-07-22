package cn.dao;

import java.util.List;

import cn.pojo.Dorm;

/**
 * 宿舍dao层接口
 * @author Yu rongxing
 *
 */
public interface DormDao {

	/**
	 * 查询全部信息
	 * @return
	 */
	public List<Dorm> findDorm();
}
