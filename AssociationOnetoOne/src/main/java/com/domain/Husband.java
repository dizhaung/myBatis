package com.domain;

import java.io.Serializable;

public class Husband implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private Wife wife;

	public Husband() {
		super();
	}

	public Husband(int id, String name, Wife wife) {
		super();
		this.id = id;
		this.name = name;
		this.wife = wife;
	}

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

	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	@Override
	public String toString() {
		return "Husband [id=" + id + ", name=" + name + ", wife=" + wife + "]";
	}

}