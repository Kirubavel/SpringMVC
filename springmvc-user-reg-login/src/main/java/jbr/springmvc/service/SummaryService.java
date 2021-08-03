package jbr.springmvc.service;
import jbr.springmvc.model.Account;
import jbr.springmvc.model.AccountUser;

public interface SummaryService {
	
	Account validateAccount(AccountUser account);

}
