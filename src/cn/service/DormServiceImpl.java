package cn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.dao.DormDao;
import cn.pojo.Dorm;

@Transactional
@Service("DormService")
public class DormServiceImpl implements DormService {

	@Autowired
	private DormDao dormdao;
	
	public DormDao getDormdao() {
		return dormdao;
	}

	public void setDormdao(DormDao dormdao) {
		this.dormdao = dormdao;
	}

	@Override
	public List<Dorm> findDorm() {
		return dormdao.findDorm();
	}

}
