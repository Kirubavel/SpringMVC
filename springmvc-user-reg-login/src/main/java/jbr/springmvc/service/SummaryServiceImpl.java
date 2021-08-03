package jbr.springmvc.service;
import org.springframework.beans.factory.annotation.Autowired;

import jbr.springmvc.dao.SummaryDao;
import jbr.springmvc.model.Account;
import jbr.springmvc.model.AccountUser;

public class SummaryServiceImpl implements SummaryService{
	
	@Autowired
	  SummaryDao summaryDao;
	
	
	public Account validateAccount(AccountUser account) {
		 return summaryDao.validateAccount(account);
		 
}
}
	
