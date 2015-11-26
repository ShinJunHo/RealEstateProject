package com.bit.directdeal;

import java.util.ArrayList;
import java.util.List;

public class DirectdealDaoImple implements DirectdealDao {
	private List<Directdeal> directdeal;
	
	public DirectdealDaoImple() {
		// TODO Auto-generated constructor stub
		directdeal =new ArrayList<Directdeal>();
		/*������ �ʱ�ȭ */
		Directdeal dd1=new Directdeal("���� 3���� ���� 10�� �˴ϴ�.",1000000000,"ȫ�浿","010-4455-7788","�󼼼���κ�");
		Directdeal dd2=new Directdeal("��2 �Ե����� ������ 1�� �帳�ϴ�.",0,"���Ե�","010-7777-7777","�����帲");
		Directdeal dd3=new Directdeal("63���� �޸��մϴ�.",630000,"������","010-6363-6363","�󼼼��� ������ ���帶ũ");
		Directdeal dd4=new Directdeal("��Ʈ�ǹ� �޸��մϴ�",1000000000,"��Ʈ��Ʈ","02-0202-3456","���� ����Ʈ������ ������");
		
		directdeal.add(dd1);
		directdeal.add(dd2);
		directdeal.add(dd3);
		directdeal.add(dd4);
		
	
	}
	/*
	@Override
	public List<Directdeal> getAllDirectdeal() {
		// TODO Auto-generated method stub
		System.out.println("���ŷ� ������� ���������.");
		
		return null;
	}
	*/
	@Override
	public void getAllDirectdeal() {
		// TODO Auto-generated method stub
		System.out.println("���ŷ� ������� ���������.");
		for(Directdeal dd:directdeal){
			System.out.println("����:["+dd.getTitle()+"]\n����:["+dd.getPrice()+"]\n�̿���:["+dd.getName()+"]\n����ó:["+dd.getPhone()+"]\n�󼼼���:["+dd.getDesc()+"]");
			System.out.println();
		}
		
	}

	@Override
	public void updateDirectdeal() {
		// TODO Auto-generated method stub
		System.out.println("���ŷ� �׸��� update �մϴ�.");
	}
	//Directdeal dd
	@Override
	public void deleteDirectdeal() {
		// TODO Auto-generated method stub
		System.out.println("���ŷ� �׸� ����.");
	}
	
}
