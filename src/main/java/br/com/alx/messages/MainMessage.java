package br.com.alx.messages;

import java.io.Serializable;

public class MainMessage implements Serializable{
	
	private static final long serialVersionUID = 6317548054974261756L;
	
	private String from;
	private String to;
	
	public MainMessage(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}
	public MainMessage() {
		super();
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}

}
