package cn.service;

import java.util.List;

import cn.pojo.Hygienism;

/**
 * 卫生情况service层接口
 * @author Yu rongxing
 *
 */
public interface HygienismService {

	/**
	 * 查询宿舍卫生状况
	 * @return
	 */
	public List<Hygienism> findAllhyg();
}
