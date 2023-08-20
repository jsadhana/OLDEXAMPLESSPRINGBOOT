package org.hcl.bean;

public class App {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public App()
	{
		super();
	}
	public App(String name) {
		super();
		this.name = name;
	}

}