package jbr.springmvc.dao;
import jbr.springmvc.model.Account;
import jbr.springmvc.model.AccountUser;

public interface SummaryDao {
	
	Account validateAccount(AccountUser account);

}
