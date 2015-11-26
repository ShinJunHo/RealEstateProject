package com.bit.user;

import com.bit.directdeal.DirectdealDao;
import com.bit.directdeal.DirectdealDaoImple;
import com.bit.market.MarketPriceDao;
import com.bit.market.MarketPriceDaoImple;
import com.bit.realestate.RealestateDao;
import com.bit.realestate.RealestateDaoImple;

public class Administrator implements User {
	
	RealestateDao re;
	DirectdealDao dd;
	MarketPriceDao mp;
	@Override
	public void doOperation() {
		// TODO Auto-generated method stub
		System.out.println("\n\t<<관리자>>입니다.");
		System.out.println("\n관리자는 목록 조회 등록 삭제 모든것이 가능합니다.");
		
		re=new RealestateDaoImple();
		System.out.println("부동산 목록 조회");
		re.getAllRealestate();
		System.out.println("\n부동산 목록 업데이트");
		
		re.updateRealestate();
		System.out.println("\n부동산 목록 삭제 기능");
		
		re.deleteRealestate();
		
		
		System.out.println("직거래 목록을 확인합니다.");
		dd=new DirectdealDaoImple();
		dd.getAllDirectdeal();
		System.out.println("\n직거래 목록 업데이트");
		dd.updateDirectdeal();
		System.out.println("\n직거래 목록 삭제");
		dd.deleteDirectdeal();

		System.out.println("\n시세 목록을 확인합니다.");
		mp=new MarketPriceDaoImple();
		mp.getSelectedPlacePrice(1);
		mp.updateMarketPrice();
		mp.deleteMarketPrice();
		
		
	}

}
