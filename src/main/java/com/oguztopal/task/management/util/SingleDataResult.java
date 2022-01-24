package com.oguztopal.task.management.util;

import com.oguztopal.task.management.model.OperationResult;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SingleDataResult<T> extends OperationResult {

	private T data;

	public SingleDataResult(T data, boolean isSuccess , String resultDesc ){
		super(isSuccess,resultDesc);
		this.data = data;
	}

	public SingleDataResult(T data , boolean isSuccess){
		super(isSuccess);
		this.data = data;
	}

}
