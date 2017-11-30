package br.com.alx.models;

import java.io.Serializable;

public class ModelPrincipal implements Serializable{
	
	private static final long serialVersionUID = 6317548054974261756L;
	
	private String de;
	private String para;
	
	public ModelPrincipal(String de, String para) {
		super();
		this.de = de;
		this.para = para;
	}
	public ModelPrincipal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDe() {
		return de;
	}
	public void setDe(String de) {
		this.de = de;
	}
	public String getPara() {
		return para;
	}
	public void setPara(String para) {
		this.para = para;
	}
	
	
	
	

}
