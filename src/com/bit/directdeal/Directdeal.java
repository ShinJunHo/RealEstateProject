package com.bit.directdeal;

public class Directdeal {
	private String title;
	private int price;
	private String name;
	private String phone;
	private String desc;
	
	Directdeal() {
		// TODO Auto-generated constructor stub
		System.out.println("\n 직거래 초기생성자 입니다.");
	}
	Directdeal(String title, int price, String name, String phone, String desc) {
		// TODO Auto-generated constructor stub
		this.title=title;
		this.price=price;
		this.name=name;
		this.phone=phone;
		this.desc=desc;
	
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
