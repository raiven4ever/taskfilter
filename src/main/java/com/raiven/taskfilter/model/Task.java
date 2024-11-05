package com.raiven.taskfilter.model;

public class Task {
	
	public static final String OPEN = "OPEN";
	public static final String PENDING = "PENDING";
	public static final String CLOSED = "CLOSED";
	public static final String IN_PROGRESS = "IN PROGRESS";
	
	private Integer number;
	private String taskName;
	private String status;

	public Task(Integer number, String taskName, String status) {
		this.number = number;
		this.taskName = taskName;
		this.status = status;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
