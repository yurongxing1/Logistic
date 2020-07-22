package cn.pojo;

/**
 * 权限表实体类
 * @author Yu rongxing
 *
 */
public class Authority {
	private Integer id;//主键id
	private String authority_name;//权限
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAuthority_name() {
		return authority_name;
	}
	public void setAuthority_name(String authority_name) {
		this.authority_name = authority_name;
	}
}
