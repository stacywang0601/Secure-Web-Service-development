package domain.imp;

import dao.IAccountdao;
import dao.jdbc.Accountdao;
import domain.IAccountManager;

public class AccountManager implements IAccountManager {
	private String bankPrefix = "9558";
	@Override
	public boolean login(String cardnum, String pin) {
		IAccountdao accountdao = null;
		boolean flag = false;
		if(this.bankPrefix.equals(cardnum.substring(0,4))){
			accountdao = new Accountdao();
			flag = accountdao.findAccoutByIdandPin(cardnum, pin);
		}else{
			//远程调用
			
		}
		
		return flag;
	}

	@Override
	public boolean changepin(String cardnum, String pin, String newpin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double querybalance(String cardnum) {
		IAccountdao accountdao = null;
		double money = -1;
		if(this.bankPrefix.equals(cardnum.substring(0,4))){
			accountdao = new Accountdao();
			money = accountdao.queryaccount(cardnum);
		}else{
		//远程调用
			
			
		}
		
		return money;
	}

	@Override
	public boolean fetch(String cardnum, double money) {
		IAccountdao accountdao = null;
		boolean flag = false;
		if(this.bankPrefix.equals(cardnum.substring(0,4))){
			accountdao = new Accountdao();
			flag = accountdao.fetch(cardnum, money);
		}else{
			//远程调用
			
		
		}
		
		return flag;
	}

	@Override
	public boolean deposit(String cardnum, double money) {
		IAccountdao accountdao = null;
		boolean flag = false;
		if(this.bankPrefix.equals(cardnum.substring(0,4))){
			accountdao = new Accountdao();
			flag = accountdao.deposit(cardnum, money);
		}else{
			//远程调用
			
		}
		
		return flag;
	}

}
