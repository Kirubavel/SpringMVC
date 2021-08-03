package jbr.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import jbr.springmvc.dao.DepositDao;

import jbr.springmvc.model.Account;
import jbr.springmvc.model.AccountUser;


public class DepositServiceImpl implements DepositService{
	@Autowired
	  DepositDao depositDao;
	
	
	public Account depositAccount(AccountUser account) {
		 return depositDao.depositAccount(account);
		 
}


	@Override
	public boolean updateBalance(long amount, AccountUser account) {
		// TODO Auto-generated method stub
		return depositDao.updateBalance(amount,account);
	}

}
