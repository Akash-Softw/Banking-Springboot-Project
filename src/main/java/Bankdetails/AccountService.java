package Bankdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account viewPolicy(Long accountNumber) {
        return accountRepository.findById(accountNumber).get();
    }

    public void deletePolicy(Long accountNumber) {
        accountRepository.deleteById(accountNumber);
    }

    public Account updateAccount(String accountNo, Account updatedAccount) {
        return null;
    }

    public Account getAccountByAccountNo(String accountNo) {
        return null;
    }

    public boolean deleteAccount(String accountNo) {
        return false;
    }
}

