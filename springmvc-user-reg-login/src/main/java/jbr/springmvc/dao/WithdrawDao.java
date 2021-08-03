package jbr.springmvc.dao;

import jbr.springmvc.model.Account;
import jbr.springmvc.model.AccountUser;

public interface WithdrawDao {
	Account withdrawAccount(AccountUser account);

	boolean updateBalance(long amount, AccountUser account);
}


