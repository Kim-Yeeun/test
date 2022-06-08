package com.yev.test.vo;

public class TestVo {

	private String id;
	private String name;
	
	public TestVo() {
		
	}

	public TestVo(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
	    return this.id + "," + this.name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
