package com.bit.realestate;

public class Realestate {
	private String name;
	private int price;
	private String location;
	private String category;
	
	Realestate(){
		//System.out.println("\nRealestate �ʱ� ������ ȣ���Դϴ�.");
	}
	/*�����ε� �߰� ����*/
	Realestate(String name, int price, String location,String cate){
	//	System.out.println("\nRealestate �����ε� ������ ȣ���Դϴ�.");
		this.name = name;
		this.price = price;
		this.location = location;
		this.category = cate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
