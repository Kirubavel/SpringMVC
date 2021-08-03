package jbr.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jbr.springmvc.model.Account;
import jbr.springmvc.model.AccountUser;

public class DepositDaoImpl implements DepositDao{
	@Autowired
	  DataSource datasource;

	  @Autowired
	  JdbcTemplate jdbcTemplate;
	  
	  public Account depositAccount(AccountUser account) {
		  String sql2 = "select * from account where username='" + account.getUsername() + "' ";
		  
		  List<Account> account1 = jdbcTemplate.query(sql2, new DepositMapper());
		  return account1.size() > 0 ? account1.get(0) :  null;
	  }

	@Override
	public boolean updateBalance(long amount, AccountUser account) {
	
		
		String sql3 = "update account set balance = '" + amount + "' where username ='" + account.getUsername()  + "' ";
		int sql5 = jdbcTemplate.update(sql3);
		if(sql5 > 0) {
			return true;
		} 
		return false;
		
			}

	

}
class DepositMapper implements RowMapper<Account> {

	  public Account mapRow(ResultSet rs, int arg1) throws SQLException {
	   Account account = new Account();
	   
	   account.setUsername(rs.getString("username"));
	   account.setAccountnumber(rs.getInt("accountnumber"));
	   account.setBalance(rs.getLong("balance"));
	   account.setBranch(rs.getString("branch"));
	   return account;
	  }   
}

