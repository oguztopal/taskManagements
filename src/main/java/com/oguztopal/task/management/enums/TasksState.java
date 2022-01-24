package com.oguztopal.task.management.enums;

public enum TasksState {

	TODO(1,"TODO"),
	IN_PROGRESS(2,"IN_PROGRESS"),
	DONE(3,"DONE");


	private int tasksStatementType;
	private String description;


	private TasksState(int tasksStatementType, String description) {
		this.tasksStatementType = tasksStatementType;
		this.description = description;
	}


	public int getPaymentType() {
		return tasksStatementType;
	}


	public void setPaymentType(int paymentType) {
		this.tasksStatementType = paymentType;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


}
