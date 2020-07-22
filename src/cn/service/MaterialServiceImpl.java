package cn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.dao.MaterialDao;
import cn.pojo.Material;
import cn.pojo.User;

@Transactional
@Service("MaterService")
public class MaterialServiceImpl implements MaterialService{

	@Autowired
	private MaterialDao materdao;
	
	public MaterialDao getMaterdao() {
		return materdao;
	}

	public void setMaterdao(MaterialDao materdao) {
		this.materdao = materdao;
	}

	/**
	 * 查询全部信息
	 */
	@Override
	public List<Material> findMater() {
		return materdao.findMater();
	}

	/**
	 * 模糊查询
	 */
	@Override
	public List<Material> findMohu(String user_name) {
		return materdao.findMohu(user_name);
	}

	/**
	 * 删除
	 */
	@Override
	public int delematerid(Integer id) {
		return materdao.delematerid(id);
	}

	/**
	 * 查询姓名
	 */
	@Override
	public List<Material> findusername() {
		return materdao.findusername();
	}
	/**
	 * 添加信息
	 */
	@Override
	public int addMater(Material material) {
		return materdao.addMater(material);
	}

}
