package com.bit.market;

import java.util.HashMap;
import java.util.Map;

public class MarketPriceDaoImple implements MarketPriceDao {
	/*
	 * 시세 확인 Implement
	 * */
	
	//만약에 데이터를 추가한다면 어떻게 하는게 좋을까?
	//어떤 형식으로 하는게 좋을까?
	//private Map<K,V> marketprice;
	
	public MarketPriceDaoImple() {
	// TODO Auto-generated constructor stub
	//	marketprice=new HashMap<K,V>();
	
	}
	@Override
	public void getSelectedPlacePrice(int index) {
		// TODO Auto-generated method stub
		System.out.println("default 시세를 보여주고 \n 지역을 선택해 선택된 지역의 시세를 확인할 수 있습니다.");
		System.out.println("선택된 시세를 보여줍니다.");
	}
	//MarketPrice mp
	@Override
	public void updateMarketPrice() {
		// TODO Auto-generated method stub
		System.out.println("최신 시세를 등록합니다.");
	}

	@Override
	public void deleteMarketPrice() {
		// TODO Auto-generated method stub
		System.out.println("기간외의 시세를 삭제합니다.");
	}

}
