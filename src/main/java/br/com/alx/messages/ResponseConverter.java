package br.com.alx.messages;

public class ResponseConverter {
	
	private int status;
	private String info;
	
	private Object data;

	public ResponseConverter(int status, String info, Object data) {
		super();
		this.status = status;
		this.info = info;
		this.data = data;
	}

	public ResponseConverter() {
		super();
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
