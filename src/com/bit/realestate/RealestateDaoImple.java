package com.bit.realestate;

import java.util.ArrayList;
import java.util.List;

public class RealestateDaoImple implements RealestateDao {
	private List<Realestate> realestate;
	
	public RealestateDaoImple() {
		// TODO Auto-generated constructor stub
		realestate=new ArrayList<Realestate>();
		/*데이터 초기화*/
		Realestate re1=new Realestate("강남구 아파트 급매",100000000,"강남역","아파트");
		Realestate re2=new Realestate("용산구 오피스텔 급매",50000000,"용산역","오피스텔");
		Realestate re3=new Realestate("광진구 빌라 판매",1200000000,"건대입구역","빌라");
		Realestate re4=new Realestate("100/1000 월세 원룸",100,"양재역","월세");
		
		realestate.add(re1);
		realestate.add(re2);
		realestate.add(re3);
		realestate.add(re4);
		
	
	}
	/*
	@Override
	public List<Realestate> getAllRealestate() {
		// TODO Auto-generated method stub
		System.out.println("RealEstate 목록을 확인합니다.");
		
		return realestate;
	}*/
	@Override
	public void getAllRealestate() {
		// TODO Auto-generated method stub
		System.out.println("RealEstate 목록을 확인합니다.");
		for (Realestate re :realestate ){
			System.out.println("제목:["+re.getName()+"]\n가격:["+re.getPrice()+"]\n위치:["+re.getLocation()+"]\n분류:["+re.getCategory()+"]");
			System.out.println();
		}
		
		
		
		
		
		//return realestate;
	}

	@Override
	public void updateRealestate() {
		// TODO Auto-generated method stub
		System.out.println("RealEstate 목록을 업데이트 합니다.");
	}
	//Realestate re
	@Override
	public void deleteRealestate() {
		// TODO Auto-generated method stub
		System.out.println("RealEstate 목록을 지웁니다.");
		
		/*index위치 받는거 수정하기.*/
		//int index=realestate.indexOf(re);
		//realestate.remove(index);
	}

}
