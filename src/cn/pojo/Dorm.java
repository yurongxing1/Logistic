package cn.pojo;

import java.util.List;

/**
 * 宿舍表实体类
 * @author Yu rongxing
 *
 */
public class Dorm {

	private Integer id;//主键id
	private String dorm_name;//宿舍名
	private String dorm_berth;//床位数
	private List<Student> studentList;
	
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDorm_name() {
		return dorm_name;
	}
	public void setDorm_name(String dorm_name) {
		this.dorm_name = dorm_name;
	}
	public String getDorm_berth() {
		return dorm_berth;
	}
	public void setDorm_berth(String dorm_berth) {
		this.dorm_berth = dorm_berth;
	}
}
