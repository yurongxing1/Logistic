package cn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.pojo.Student;

/**
 * 学生信息DAO层接口
 * @author Yu rongxing
 *
 */
public interface StudentDao {

	/**
	 * 查询学生信息
	 * @return
	 */
	public List<Student> findStu();
	
	/**
	 * 根据姓名模糊查询
	 * @param dorm_name
	 * @return
	 */
	public List<Student> findStuMohu(@Param("student_name")String student_name);
	
	/**
	 * 查询宿舍id和姓名
	 * @return
	 */
	public List<Student> findDorm();
	
	/**
	 * 添加学生信息
	 * @param student
	 * @return
	 */
	public int addStudent(Student student);
	
	/**
	 * 删除信息
	 * @param id
	 * @return
	 */
	public int deleStudent(Integer id);
}
