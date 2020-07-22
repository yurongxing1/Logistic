package cn.pojo;

/**
 * 性别表
 * @author Yu rongxing
 *
 */
public class Sex {
	private Integer id;//主键id
	private String sex_name;//性别
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSex_name() {
		return sex_name;
	}
	public void setSex_name(String sex_name) {
		this.sex_name = sex_name;
	}
}
