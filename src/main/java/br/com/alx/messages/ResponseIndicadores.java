package br.com.alx.messages;

import java.io.Serializable;

public class ResponseIndicadores implements Serializable{
	
	private static final long serialVersionUID = -5266506645381423096L;
	
	private int status;
	private String info;
	private final String fonte= "http://www.bolsafinanceira.com";
	private Object data;

	public ResponseIndicadores() {
		super();
	}

	public ResponseIndicadores(int status, String info, Object data) {
		super();
		this.status = status;
		this.info = info;
		this.data = data;
	}

	public int getStatus() {
		return status;
	}
 
	public void setStatus(int status) {
		this.status = status;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
