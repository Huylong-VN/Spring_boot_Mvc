package com.example.project.Controller;
import com.example.project.Service.AccountService;
import com.example.project.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController

public class AccountController{
    @Autowired
    private final AccountService accountService;
    public AccountController(AccountService accountService) { this.accountService = accountService; }
    // Get All Account
    @GetMapping(value = "/Account")
    public List<Account> getAll(){ return accountService.getAll();}

    @PostMapping(value = "/login/send")
    public Account login(@RequestBody Account json){ return accountService.login(json); }
    //CRUD Account
    @PostMapping(value = "/Account")
    public void add(@RequestBody Account account){
        accountService.add(account);
    }
    @PutMapping(value = "/Account")
    public void edit(@RequestBody Account account){accountService.edit(account);}
    @DeleteMapping(value = "/Account")
    public void delete(@RequestBody Account account){accountService.delete(account);}
}
