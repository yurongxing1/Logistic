package cn.service;

import java.util.List;

import cn.dao.DormDao;
import cn.pojo.Dorm;

/**
 * 宿舍信息service层接口
 * @author Yu rongxing
 *
 */
public interface DormService {

	/**
	 * 查询全部人员
	 * @return
	 */
	public List<Dorm> findDorm();
}
