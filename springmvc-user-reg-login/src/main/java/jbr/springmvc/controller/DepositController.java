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
import jbr.springmvc.service.DepositService;

@Controller
public class DepositController {
	
@Autowired
	  DepositService depositService;

	@RequestMapping(value = "/deposit", method = RequestMethod.GET)
	public ModelAndView showDeposit(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("deposit");
		    mav.addObject("deposit", new Account());
		return mav;
	}
	
	 @RequestMapping(value = "/depositProcess", method = RequestMethod.POST)
	    public ModelAndView depositProcess(HttpServletRequest request, HttpServletResponse response, 
	    		@ModelAttribute("deposit") deposit deposit1 ,HttpSession session) {
         ModelAndView mav = null;
 
			
			AccountUser userAcc = new AccountUser();
	   		  
	 		   userAcc.setUsername(session.getAttribute("username").toString());
	 		   
	 		  Account account1= depositService.depositAccount(userAcc);
	   		   long new_balance = account1.getBalance() + Long.parseLong(deposit1.getAmount());
	   		   Boolean validate = depositService.updateBalance(new_balance, userAcc);
	   		    if (null != account1 ) {		    	
	   		    	    mav = new ModelAndView("deposit");
	   			       
	   			        mav.addObject("message", new_balance +" "+ "Deposited Successfully");
	   			       
	   			     
	   		      } 
	   		   
	   		    else {
	      			      mav = new ModelAndView("deposit");
	   				      mav.addObject("message", "User Details Not Exist");
	   			      }
	   			return mav;
	   }
	   } 

	        
			
			
			
			
	
