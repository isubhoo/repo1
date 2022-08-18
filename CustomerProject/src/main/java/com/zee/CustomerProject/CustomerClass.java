package com.zee.CustomerProject;

public class CustomerClass {
	String name;
	String url;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getName() {
		return name;
	}
	
	public String getUrl() {
		return url;
	}
	public String toString() {
		return "name: " + name + " url: " +url;
	}
}
