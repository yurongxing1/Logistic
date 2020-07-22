package cn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.dao.StudentDao;
import cn.pojo.Student;
/**
 * 学生信息service实现类
 * @author Yu rongxing
 *
 */
@Transactional
@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studao;
	
	public StudentDao getStudao() {
		return studao;
	}

	public void setStudao(StudentDao studao) {
		this.studao = studao;
	}

	/**
	 * 查询全部学生信息
	 */
	@Override
	public List<Student> findStu() {
		return studao.findStu();
	}

	/**
	 * 模糊查询
	 */
	@Override
	public List<Student> findStuMohu(String student_name) {
		return studao.findStuMohu(student_name);
	}

	/**
	 * 查询宿舍id和宿舍号
	 */
	@Override
	public List<Student> findDorm() {
		return studao.findDorm();
	}

	/**
	 * 添加学生信息
	 */
	@Override
	public int addStudent(Student student) {
		return studao.addStudent(student);
	}

	/**
	 * 删除信息
	 */
	@Override
	public int deleStudent(Integer id) {
		return studao.deleStudent(id);
	}

}
