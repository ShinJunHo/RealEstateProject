package com.bit.user;

import com.bit.directdeal.DirectdealDao;
import com.bit.directdeal.DirectdealDaoImple;
import com.bit.market.MarketPriceDao;
import com.bit.market.MarketPriceDaoImple;
import com.bit.realestate.RealestateDao;
import com.bit.realestate.RealestateDaoImple;

public class Member implements User {
	
	RealestateDao re;
	DirectdealDao dd;
	MarketPriceDao mp;
	@Override
	public void doOperation() {
		// TODO Auto-generated method stub
		//switch-case로 구분을 해서 프로그램을 돌리던지
		//UI로 프로그램을 돌리던지 할 수 있는데 
		// 기본적인 프로그램의 동작 로직은 이렇게 돌아간다.
		System.out.println("\n\t<<회원>>입니다.");
		System.out.println("부동산  목록을 확인합니다.\n");
		re=new RealestateDaoImple();
		re.getAllRealestate();

		
		System.out.println("직거래 목록을 확인합니다.");
		dd=new DirectdealDaoImple();
		dd.getAllDirectdeal();
		
		mp=new MarketPriceDaoImple();
		mp.getSelectedPlacePrice(1);
		
	}

}
