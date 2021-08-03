package jbr.springmvc.model;

import java.math.BigDecimal;

public class Account {
private String username;
private int accountnumber;
private long balance;
private String branch;

public String getUsername() {
	
	return username;
}

public void setUsername(String username) {
	this.username = username;
	
} 
public int getAccountnumber() {
    return accountnumber;
}

public void setAccountnumber(int accountnumber) {
    
 this.accountnumber = accountnumber;

}
public long getBalance() {
    return balance;
}

public void setBalance(long balance) {
    
 this.balance = balance;
}
public String getBranch() {
    return branch;
}

public void setBranch(String branch) {
    
 this.branch = branch;
}








}
