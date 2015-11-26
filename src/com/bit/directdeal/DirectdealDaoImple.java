package com.bit.directdeal;

import java.util.ArrayList;
import java.util.List;

public class DirectdealDaoImple implements DirectdealDao {
	private List<Directdeal> directdeal;
	
	public DirectdealDaoImple() {
		// TODO Auto-generated constructor stub
		directdeal =new ArrayList<Directdeal>();
		/*데이터 초기화 */
		Directdeal dd1=new Directdeal("가평 3만평 대지 10억 팝니다.",1000000000,"홍길동","010-4455-7788","상세설명부분");
		Directdeal dd2=new Directdeal("제2 롯데월드 선착순 1명 드립니다.",0,"나롯데","010-7777-7777","거저드림");
		Directdeal dd3=new Directdeal("63빌딩 급매합니다.",630000,"나육삼","010-6363-6363","상세설명 서울의 랜드마크");
		Directdeal dd4=new Directdeal("비트건물 급매합니다",1000000000,"비트비트","02-0202-3456","강남 소프트웨어의 자존심");
		
		directdeal.add(dd1);
		directdeal.add(dd2);
		directdeal.add(dd3);
		directdeal.add(dd4);
		
	
	}
	/*
	@Override
	public List<Directdeal> getAllDirectdeal() {
		// TODO Auto-generated method stub
		System.out.println("직거래 모든정보 가지고오기.");
		
		return null;
	}
	*/
	@Override
	public void getAllDirectdeal() {
		// TODO Auto-generated method stub
		System.out.println("직거래 모든정보 가지고오기.");
		for(Directdeal dd:directdeal){
			System.out.println("제목:["+dd.getTitle()+"]\n가격:["+dd.getPrice()+"]\n이용자:["+dd.getName()+"]\n연락처:["+dd.getPhone()+"]\n상세설명:["+dd.getDesc()+"]");
			System.out.println();
		}
		
	}

	@Override
	public void updateDirectdeal() {
		// TODO Auto-generated method stub
		System.out.println("직거래 항목을 update 합니다.");
	}
	//Directdeal dd
	@Override
	public void deleteDirectdeal() {
		// TODO Auto-generated method stub
		System.out.println("직거래 항목 삭제.");
	}
	
}
