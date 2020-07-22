package cn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.dao.HygienismDao;
import cn.pojo.Hygienism;

@Transactional
@Service("HygService")
public class HygienismServiceImpl implements HygienismService {

	@Autowired
	private HygienismDao hygdao;
	
	public HygienismDao getHygdao() {
		return hygdao;
	}

	public void setHygdao(HygienismDao hygdao) {
		this.hygdao = hygdao;
	}

	/**
	 * 查询全部
	 */
	@Override
	public List<Hygienism> findAllhyg() {
		return hygdao.findAllhyg();
	}

}
