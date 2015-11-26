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
		 * ��ȸ���� flag�� �̿��� ������ �����ִ� ������ �ϸ� �ϼ��� �� �ִ�.
		 * ������ ���
		 * */
		
		System.out.println("\n\t<<��ȸ��>>�Դϴ�. \n[��� Ȯ��]�� �����մϴ�.\n");
		System.out.println("��ȸ�� ���� ���� ������ �� �� ȸ������ ����.");
		System.out.println("\n�ε���  ����� Ȯ���մϴ�.");
		re=new RealestateDaoImple();
		re.getAllRealestate();

		
		System.out.println("���ŷ� ����� Ȯ���մϴ�.");
		dd=new DirectdealDaoImple();
		dd.getAllDirectdeal();
		
		System.out.println("������ �ü��� Ȯ���մϴ�.");
		mp=new MarketPriceDaoImple();
		mp.getSelectedPlacePrice(1);
		
	}

}
