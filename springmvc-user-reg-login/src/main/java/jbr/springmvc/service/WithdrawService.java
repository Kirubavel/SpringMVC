package jbr.springmvc.service;

import jbr.springmvc.model.Account;
import jbr.springmvc.model.AccountUser;

public interface WithdrawService {
	Account withdrawAccount(AccountUser account);

	boolean updateBalance(long amount, AccountUser account);
}



