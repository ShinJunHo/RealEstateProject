package com.bit.main;

import com.bit.user.*;

public class Context {
	User user;
	public int execute(){
		user=new Member();
		user.doOperation();
		
		user=new NonMember();
		user.doOperation();
		
		user=new Administrator();
		user.doOperation();
		
		return 1;
	}
}
