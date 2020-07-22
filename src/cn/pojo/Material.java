package cn.pojo;

import java.util.Date;

/**
 * 仓库实体类
 * @author Yu rongxing
 *
 */
public class Material {

	private Integer id;//主键id
	private String material_name;//物资名称
	private String material_money;//金额
	private Integer material_userid;//用户表id
	private String material_quantity;//数量
	private Date material_data;		//支出日期
	private User user;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getMaterial_data() {
		return material_data;
	}
	public void setMaterial_data(Date material_data) {
		this.material_data = material_data;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMaterial_name() {
		return material_name;
	}
	public void setMaterial_name(String material_name) {
		this.material_name = material_name;
	}
	public String getMaterial_money() {
		return material_money;
	}
	public void setMaterial_money(String material_money) {
		this.material_money = material_money;
	}
	public Integer getMaterial_userid() {
		return material_userid;
	}
	public void setMaterial_userid(Integer material_userid) {
		this.material_userid = material_userid;
	}
	public String getMaterial_quantity() {
		return material_quantity;
	}
	public void setMaterial_quantity(String material_quantity) {
		this.material_quantity = material_quantity;
	}
}
