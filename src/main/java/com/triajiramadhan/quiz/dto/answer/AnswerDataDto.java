package com.triajiramadhan.quiz.dto.answer;

public class AnswerDataDto {

	private String id;
	private String answer;
	private Boolean isAnswer;
	private Integer version;
	private Boolean isActive;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public Boolean getIsAnswer() {
		return isAnswer;
	}

	public void setIsAnswer(Boolean isAnswer) {
		this.isAnswer = isAnswer;
	}

	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public Integer getVersion() {
		return version;
	}
	
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public Boolean getIsActive() {
		return isActive;
	}
	
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}
