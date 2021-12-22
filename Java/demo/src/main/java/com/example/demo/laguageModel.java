package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Language")
public class laguageModel {
	
	private int LanguageId;
	private String Language;
	public int getLanguageId() {
		return LanguageId;
	}
	public void setLanguageId(int languageId) {
		LanguageId = languageId;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	
	
}
