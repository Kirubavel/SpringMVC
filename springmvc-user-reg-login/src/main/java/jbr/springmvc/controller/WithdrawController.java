package jbr.springmvc.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.model.Account;
import jbr.springmvc.model.AccountUser;
import jbr.springmvc.model.deposit;
import jbr.springmvc.service.WithdrawService;

@Controller
public class WithdrawController {
	
@Autowired
	  WithdrawService withdrawService;

	@RequestMapping(value = "/withdraw", method = RequestMethod.GET)
	public ModelAndView showWithdraw(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("withdraw");
		    mav.addObject("withdraw", new Account());
		return mav;
	}
	
	 @RequestMapping(value = "/withdrawProcess", method = RequestMethod.POST)
	    public ModelAndView withdrawProcess(HttpServletRequest request, HttpServletResponse response, 
	    		@ModelAttribute("withdraw") deposit deposit1 ,HttpSession session) {
         ModelAndView mav = null;
 
			
			AccountUser userAcc = new AccountUser();
	   		  
	 		   userAcc.setUsername(session.getAttribute("username").toString());
	 		  Boolean validate;
	 		  Account account1= withdrawService.withdrawAccount(userAcc);
	 		  if(account1.getBalance() > Long.parseLong(deposit1.getAmount())) {
	 			   long new_balance = account1.getBalance() - Long.parseLong(deposit1.getAmount());
	 			   validate = withdrawService.updateBalance(new_balance, userAcc);
	 			  if (validate) {		    	
	   		    	    mav = new ModelAndView("withdraw");
	   		    	    mav.addObject("message", "Amount Withdrawn Successfully");
	   		    }
	   		    else  {
	   		    	mav=new ModelAndView("withdraw");
	   		    	mav.addObject("message","Transaction error");
	   		    	
	   		    }
	   		    
	 		  }else  {
	   		    	mav=new ModelAndView("withdraw");
	   		    	mav.addObject("message","Withdraw amount is greater than account balance");
	   		    	
	   		    }   
	   		      			return mav;
	   }
	   } 

	        
			
			
			
			
	
