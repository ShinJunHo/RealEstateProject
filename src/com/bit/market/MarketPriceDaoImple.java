package com.bit.market;

import java.util.HashMap;
import java.util.Map;

public class MarketPriceDaoImple implements MarketPriceDao {
	/*
	 * �ü� Ȯ�� Implement
	 * */
	
	//���࿡ �����͸� �߰��Ѵٸ� ��� �ϴ°� ������?
	//� �������� �ϴ°� ������?
	//private Map<K,V> marketprice;
	
	public MarketPriceDaoImple() {
	// TODO Auto-generated constructor stub
	//	marketprice=new HashMap<K,V>();
	
	}
	@Override
	public void getSelectedPlacePrice(int index) {
		// TODO Auto-generated method stub
		System.out.println("default �ü��� �����ְ� \n ������ ������ ���õ� ������ �ü��� Ȯ���� �� �ֽ��ϴ�.");
		System.out.println("���õ� �ü��� �����ݴϴ�.");
	}
	//MarketPrice mp
	@Override
	public void updateMarketPrice() {
		// TODO Auto-generated method stub
		System.out.println("�ֽ� �ü��� ����մϴ�.");
	}

	@Override
	public void deleteMarketPrice() {
		// TODO Auto-generated method stub
		System.out.println("�Ⱓ���� �ü��� �����մϴ�.");
	}

}
