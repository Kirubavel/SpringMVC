package jbr.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import jbr.springmvc.dao.WithdrawDao;
import jbr.springmvc.model.Account;
import jbr.springmvc.model.AccountUser;

public class WithdrawServiceImpl implements WithdrawService {
	@Autowired
	  WithdrawDao WithdrawDao;
	
	
	public Account withdrawAccount(AccountUser account) {
		 return WithdrawDao.withdrawAccount(account);
		 
}


	@Override
	public boolean updateBalance(long amount, AccountUser account) {
		
		return WithdrawDao.updateBalance(amount,account);
	}

}

