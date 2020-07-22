package cn.pojo;

import java.util.List;

/**
 * 用户信息表实体类
 * @author Yu rongxing
 *
 */
public class User {

	private Integer id;//主键id
	private String user_name;//用户姓名
	private String user_pwd;//密码
	private Integer user_sex;//性别id
	private String user_age;//年龄
	private Integer user_authorityid;//权限id
	private String user_phone;//手机号码
	private String user_number;//身份证号码
	private String user_address;//住址
	
	private Sex sex;
	private Authority authorityList;
	
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	public Authority getAuthorityList() {
		return authorityList;
	}
	public void setAuthorityList(Authority authorityList) {
		this.authorityList = authorityList;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public Integer getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(Integer user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_age() {
		return user_age;
	}
	public void setUser_age(String user_age) {
		this.user_age = user_age;
	}
	public Integer getUser_authorityid() {
		return user_authorityid;
	}
	public void setUser_authorityid(Integer user_authorityid) {
		this.user_authorityid = user_authorityid;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_number() {
		return user_number;
	}
	public void setUser_number(String user_number) {
		this.user_number = user_number;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
}
