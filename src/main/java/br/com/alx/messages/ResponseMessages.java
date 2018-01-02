package br.com.alx.messages;

public enum ResponseMessages {
	SUCCESS(200, "SUCCESS"),
    ERROR(500, "ERROR");

	    private int code;
	    private String msg;

	    private ResponseMessages(int code, String msg) {
	        this.code = code;
	        this.msg = msg;
	    }

	    public int getCode() {
	        return code;
	    }

	    public String getMsg() {
	        return msg;
	    }
}
