package com.test;


/**
 * 
 * @author HuangYunHe
 * @version 创建时间：2018年6月12日 下午1:33:39
 */
public class City {
	/**
	 * id 城市主键
	 */
	private Integer id ;
	/**
	 * name 城市名称
	 */
	private String name ;
	/**
	 * code 行政编码
	 */
	private String code ;
	/**
	 * pid 父级城市主键
	 */
	private Integer pid ;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public City(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
