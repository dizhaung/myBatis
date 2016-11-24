package com.domain;

import java.io.Serializable;

public class Wife implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private Husband husband;
    public Wife() {
        super();
    }
    public Wife(Integer id, String name, Husband husband) {
        super();
        this.id = id;
        this.name = name;
        this.husband = husband;
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
    public Husband getHusband() {
        return husband;
    }

	public void setHusband(Husband husband) {
        this.husband = husband;
    }
    @Override
    public String toString() {
        return "Wife [id=" + id + ", name=" + name + ", husband=" + husband
                + "]";
    }
    

}
