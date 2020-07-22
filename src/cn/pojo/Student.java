package cn.pojo;

/**
 * 学生表实体类
 * @author Yu rongxing
 *
 */
public class Student {

	private Integer id;//主键id
	private String student_name;//学生姓名
	private Integer student_dormid;//学生宿舍id
	private String student_age;//学生年龄
	private Integer student_sex;//性别id
	private Dorm dorm;
	private Sex sex;
	
	public Dorm getDorm() {
		return dorm;
	}
	public void setDorm(Dorm dorm) {
		this.dorm = dorm;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public Integer getStudent_dormid() {
		return student_dormid;
	}
	public void setStudent_dormid(Integer student_dormid) {
		this.student_dormid = student_dormid;
	}
	public String getStudent_age() {
		return student_age;
	}
	public void setStudent_age(String student_age) {
		this.student_age = student_age;
	}
	public Integer getStudent_sex() {
		return student_sex;
	}
	public void setStudent_sex(Integer student_sex) {
		this.student_sex = student_sex;
	}
}
