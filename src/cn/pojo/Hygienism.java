package cn.pojo;

import java.util.Date;

/**
 * 宿舍卫生信息实体类
 * @author Yu rongxing
 *
 */
public class Hygienism {

	private Integer id;//主键id
	private Integer hygienism_dormid;//宿舍号外键
	private Date hygienism_date;//日期
	private String hygienism_conditionid;//卫生状况外键
	private Dorm dorm;
	private Condition condition;
	
	public Dorm getDorm() {
		return dorm;
	}
	public void setDorm(Dorm dorm) {
		this.dorm = dorm;
	}
	public Condition getCondition() {
		return condition;
	}
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getHygienism_dormid() {
		return hygienism_dormid;
	}
	public void setHygienism_dormid(Integer hygienism_dormid) {
		this.hygienism_dormid = hygienism_dormid;
	}
	public Date getHygienism_date() {
		return hygienism_date;
	}
	public void setHygienism_date(Date hygienism_date) {
		this.hygienism_date = hygienism_date;
	}
	public String getHygienism_conditionid() {
		return hygienism_conditionid;
	}
	public void setHygienism_conditionid(String hygienism_conditionid) {
		this.hygienism_conditionid = hygienism_conditionid;
	}
}
