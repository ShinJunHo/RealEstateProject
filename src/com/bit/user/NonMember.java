package com.bit.user;

import com.bit.directdeal.DirectdealDao;
import com.bit.directdeal.DirectdealDaoImple;
import com.bit.market.MarketPriceDao;
import com.bit.market.MarketPriceDaoImple;
import com.bit.realestate.RealestateDao;
import com.bit.realestate.RealestateDaoImple;

public class NonMember implements User {
	
	RealestateDao re;
	DirectdealDao dd;
	MarketPriceDao mp;
	@Override
	public void doOperation() {
		// TODO Auto-generated method stub
		/*
		 * 비회원은 flag를 이용해 권한을 나눠주는 구현을 하면 완성할 수 있다.
		 * 나머지 기능
		 * */
		
		System.out.println("\n\t<<비회원>>입니다. \n[목록 확인]만 가능합니다.\n");
		System.out.println("비회원 권한 외의 선택을 할 시 회원가입 유도.");
		System.out.println("\n부동산  목록을 확인합니다.");
		re=new RealestateDaoImple();
		re.getAllRealestate();

		
		System.out.println("직거래 목록을 확인합니다.");
		dd=new DirectdealDaoImple();
		dd.getAllDirectdeal();
		
		System.out.println("지역의 시세를 확인합니다.");
		mp=new MarketPriceDaoImple();
		mp.getSelectedPlacePrice(1);
		
	}

}
