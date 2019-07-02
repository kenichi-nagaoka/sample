package com.example.demo.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class HelloForm {
	
	@NotBlank
	String notBlankField;
	
	@NotEmpty
	String notEmptyField;
	
	@NotNull
	String notNullField;
	
	public String getNotBlankField() {
		return notBlankField;
	}

	public void setNotBlankField(String notBlankField) {
		this.notBlankField = notBlankField;
	}

	public String getNotEmptyField() {
		return notEmptyField;
	}

	public void setNotEmptyField(String notEmptyField) {
		this.notEmptyField = notEmptyField;
	}

	public String getNotNullField() {
		return notNullField;
	}

	public void setNotNullField(String notNullField) {
		this.notNullField = notNullField;
	}
}
