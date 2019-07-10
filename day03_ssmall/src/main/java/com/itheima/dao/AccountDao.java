package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao {
    @Select("select * from account")
    public List<Account> findAll();


    @Insert("INSERT INTO `ssm`.`account` (`name`, `money`) VALUES ('#{name}', '#{money}') ")
    public void saveAccount(Account account);
}
