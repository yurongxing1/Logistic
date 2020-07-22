package cn.dao;

import java.util.List;

import cn.pojo.Hygienism;

/**
 * 宿舍卫生状况DAO层接口
 * @author Yu rongxing
 *
 */
public interface HygienismDao {

	public List<Hygienism> findAllhyg();
}
