package jbr.springmvc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jbr.springmvc.model.Account;
import jbr.springmvc.model.AccountUser;
import jbr.springmvc.service.SummaryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:jbr/config/user-beans.xml" })
public class SummaryServiceTest {
	 
			@Autowired
			private SummaryService summaryService;
			
			@Test
			public void testValidateAccount() {
			    AccountUser account = new AccountUser();
			    account.setUsername("k101");
			    
		        Account account1 = summaryService.validateAccount( account);
		        Assert.assertEquals("k101", account1.getUsername());
			}
			

}
