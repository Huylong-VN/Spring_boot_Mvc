package com.example.project.Service;

import com.example.project.Business.AccountBus;
import com.example.project.model.Account;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class AccountService implements IcommonService<Account> {
    private AccountBus bus;
    public AccountService() {
        bus=new AccountBus();
    }
    public Account login(Account account) {
        return bus.login(account);
    }
    @Override
    public List<Account> getAll() {
        return bus.getAll();
    }
    @Override
    public Account getByID(String id) {
        return bus.getSingleByID(id);
    }
    @Override
    public List<Account> getByKeyWord(String keyword) {
        return bus.getByKeyword(keyword);
    }
    @Override
    public void add(Account intro) {
        bus.add(intro);
    }
    @Override
    public void edit(Account info) { bus.Update(info);}
    @Override
    public void delete(Account id) { bus.delete(id);}
}
