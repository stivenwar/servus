package com.servus.db;

public class Result {
	
	private String result;
	private String message;
	private String mail;
	
	public Result() {
	
	}

	public Result(String result, String message, String mail) {
		this.result = result;
		this.message = message;
		this.mail = mail;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
	

}
