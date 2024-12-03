package service;

import java.util.List;

import model.Account;
import model.Status;

public interface AccountService {
	public List<Account> getAllAccount();
	public void createNewAccount(Account account);
	public Account getAccountByUsername(String username);
	public void deleteAccount(String username);
	public void changeStatus(String username, Status status);

}
