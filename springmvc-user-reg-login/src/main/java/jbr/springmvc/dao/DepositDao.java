package jbr.springmvc.dao;

import jbr.springmvc.model.Account;
import jbr.springmvc.model.AccountUser;

public interface DepositDao {
	
	Account depositAccount(AccountUser account);

	boolean updateBalance(long amount, AccountUser account);
}
