package com.oguztopal.task.management.util;

import com.oguztopal.task.management.model.OperationResult;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class DataResult<T> extends OperationResult {

	private List<T> data;

	public DataResult(List<T> data, boolean isSuccess , String resultDesc ){
		super(isSuccess,resultDesc);
		this.data = data;
	}

	public DataResult(List<T> data , boolean isSuccess){
		super(isSuccess);
		this.data = data;
	}

}
