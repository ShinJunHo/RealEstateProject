package com.bit.realestate;

import java.util.ArrayList;
import java.util.List;

public class RealestateDaoImple implements RealestateDao {
	private List<Realestate> realestate;
	
	public RealestateDaoImple() {
		// TODO Auto-generated constructor stub
		realestate=new ArrayList<Realestate>();
		/*������ �ʱ�ȭ*/
		Realestate re1=new Realestate("������ ����Ʈ �޸�",100000000,"������","����Ʈ");
		Realestate re2=new Realestate("��걸 ���ǽ��� �޸�",50000000,"��꿪","���ǽ���");
		Realestate re3=new Realestate("������ ���� �Ǹ�",1200000000,"�Ǵ��Ա���","����");
		Realestate re4=new Realestate("100/1000 ���� ����",100,"���翪","����");
		
		realestate.add(re1);
		realestate.add(re2);
		realestate.add(re3);
		realestate.add(re4);
		
	
	}
	/*
	@Override
	public List<Realestate> getAllRealestate() {
		// TODO Auto-generated method stub
		System.out.println("RealEstate ����� Ȯ���մϴ�.");
		
		return realestate;
	}*/
	@Override
	public void getAllRealestate() {
		// TODO Auto-generated method stub
		System.out.println("RealEstate ����� Ȯ���մϴ�.");
		for (Realestate re :realestate ){
			System.out.println("����:["+re.getName()+"]\n����:["+re.getPrice()+"]\n��ġ:["+re.getLocation()+"]\n�з�:["+re.getCategory()+"]");
			System.out.println();
		}
		
		
		
		
		
		//return realestate;
	}

	@Override
	public void updateRealestate() {
		// TODO Auto-generated method stub
		System.out.println("RealEstate ����� ������Ʈ �մϴ�.");
	}
	//Realestate re
	@Override
	public void deleteRealestate() {
		// TODO Auto-generated method stub
		System.out.println("RealEstate ����� ����ϴ�.");
		
		/*index��ġ �޴°� �����ϱ�.*/
		//int index=realestate.indexOf(re);
		//realestate.remove(index);
	}

}
