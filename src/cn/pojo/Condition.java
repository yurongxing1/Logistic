package cn.pojo;

/**
 * 宿舍卫生状况表
 * @author Yu rongxing
 *
 */
public class Condition {

	private Integer id;//主键id
	private String condition_name;//卫生状况
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCondition_name() {
		return condition_name;
	}
	public void setCondition_name(String condition_name) {
		this.condition_name = condition_name;
	}
}
