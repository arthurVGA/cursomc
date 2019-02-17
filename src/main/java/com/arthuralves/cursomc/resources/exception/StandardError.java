package com.arthuralves.cursomc.resources.exception;

public class StandardError {
	private Integer status;
	private String msg;
	private Long timeStamp;
	
	/* CONTRUCTOR */
	public StandardError(Integer status, String msg, Long timeStamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStamp = timeStamp;
	}

	/* GETTERS */
	public Integer getStatus() {
		return status;
	}
	public String getMsg() {
		return msg;
	}
	public Long getTimeStamp() {
		return timeStamp;
	}

	/* SETTERS */
	public void setStatus(Integer status) {
		this.status = status;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
}