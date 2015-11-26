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
		System.out.println("\n\t<<������>>�Դϴ�.");
		System.out.println("\n�����ڴ� ��� ��ȸ ��� ���� ������ �����մϴ�.");
		
		re=new RealestateDaoImple();
		System.out.println("�ε��� ��� ��ȸ");
		re.getAllRealestate();
		System.out.println("\n�ε��� ��� ������Ʈ");
		
		re.updateRealestate();
		System.out.println("\n�ε��� ��� ���� ���");
		
		re.deleteRealestate();
		
		
		System.out.println("���ŷ� ����� Ȯ���մϴ�.");
		dd=new DirectdealDaoImple();
		dd.getAllDirectdeal();
		System.out.println("\n���ŷ� ��� ������Ʈ");
		dd.updateDirectdeal();
		System.out.println("\n���ŷ� ��� ����");
		dd.deleteDirectdeal();

		System.out.println("\n�ü� ����� Ȯ���մϴ�.");
		mp=new MarketPriceDaoImple();
		mp.getSelectedPlacePrice(1);
		mp.updateMarketPrice();
		mp.deleteMarketPrice();
		
		
	}

}
