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
		//switch-case�� ������ �ؼ� ���α׷��� ��������
		//UI�� ���α׷��� �������� �� �� �ִµ� 
		// �⺻���� ���α׷��� ���� ������ �̷��� ���ư���.
		System.out.println("\n\t<<ȸ��>>�Դϴ�.");
		System.out.println("�ε���  ����� Ȯ���մϴ�.\n");
		re=new RealestateDaoImple();
		re.getAllRealestate();

		
		System.out.println("���ŷ� ����� Ȯ���մϴ�.");
		dd=new DirectdealDaoImple();
		dd.getAllDirectdeal();
		
		mp=new MarketPriceDaoImple();
		mp.getSelectedPlacePrice(1);
		
	}

}
