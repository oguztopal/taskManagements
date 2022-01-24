package com.oguztopal.task.management.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OperationResult {

	private Boolean isSuccess;
	private String resultDesc;

	public OperationResult(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
}
