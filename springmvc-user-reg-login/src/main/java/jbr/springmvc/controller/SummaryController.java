package jbr.springmvc.controller;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.servlet.ModelAndView;

	import jbr.springmvc.model.Account;
import jbr.springmvc.model.AccountUser;
import jbr.springmvc.service.SummaryService;
    @Controller
    public class SummaryController {
   		@Autowired
   		  SummaryService summaryService;
   		
   		 @RequestMapping(value = "/summary", method = RequestMethod.GET)
   		  public ModelAndView showAccount(HttpServletRequest request, HttpServletResponse response) {
   		    ModelAndView mav = new ModelAndView("summary");
   		    mav.addObject("summary", new Account());
   		    return mav;
   		  }
   		  

   		  @RequestMapping(value = "/summaryProcess", method = RequestMethod.POST)
   		  public ModelAndView summaryProcess(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
   		    ModelAndView mav = null;

   		   AccountUser userAcc = new AccountUser();
   		  
 		   userAcc.setUsername(session.getAttribute("username").toString());
 		   
   		   Account account1 = summaryService.validateAccount(userAcc);
   		    
   		    if (null != account1 ) {		    	
   		    	    mav = new ModelAndView("summary");
   			        mav.addObject("accountnumber", account1.getAccountnumber());
   			        mav.addObject("balance", account1.getBalance());
   			        mav.addObject("branch", account1.getBranch());
   			     
   		      } 
   		   
   		    else {
      			      mav = new ModelAndView("user");
   				      mav.addObject("message", "User Details Not Exist");
   			      }
   			return mav;
   }
   } 
