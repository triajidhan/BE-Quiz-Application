package com.triajiramadhan.quiz.dto.base;

public class BaseDataGetResDto<T> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
