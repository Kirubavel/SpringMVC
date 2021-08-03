package jbr.springmvc.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import jbr.springmvc.model.Account;
import jbr.springmvc.model.AccountUser;

public class SummaryDaoImpl implements SummaryDao {
	 @Autowired
	  DataSource datasource;

	  @Autowired
	  JdbcTemplate jdbcTemplate;
	  
	  public Account validateAccount(AccountUser account) {
		  String sql1 = "select * from account where username='" + account.getUsername() + "' ";
		  
		  List<Account> account1 = jdbcTemplate.query(sql1, new AccountMapper());
		  return account1.size() > 0 ? account1.get(0) :  null;
	  }


	
}
class AccountMapper implements RowMapper<Account> {

	  public Account mapRow(ResultSet rs, int arg1) throws SQLException {
	   Account account = new Account();
	   
	   account.setUsername(rs.getString("username"));
	   account.setAccountnumber(rs.getInt("accountnumber"));
	   account.setBalance(rs.getLong("balance"));
	   account.setBranch(rs.getString("branch"));
	   return account;
	  }   
}
