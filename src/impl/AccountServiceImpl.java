package impl;

import java.util.List;

import model.Account;
import model.Status;
import service.AccountService;

public class AccountServiceImpl implements AccountService {

	private AuthServiceImpl AuthService;
	
	//constructor's
	public AccountServiceImpl(AuthServiceImpl AuthService) {
		this.AuthService = AuthService;
	}
	
	@Override
	public List<Account> getAllAccount() {
		return AuthService.users;
	}

	@Override
	public void createNewAccount(Account account) {
		AuthService.users.add(account);
	}

	@Override
	public Account getAccountByUsername(String username) {
		for(Account x : AuthService.users) {
			if (username.equals(x.getUsername())) {
				return x;
			}
		}
		return null;
	}

	@Override
	public void deleteAccount(String username) {
		if (AuthService.users.removeIf(x -> x.getUsername().equals(username))){
			System.out.println("Delete Successfully!");
		} else {
			System.out.println("Acount does not exit!");
		}	
	}

	@Override
	public void changeStatus(String username, Status status) {
		for(Account x : AuthService.users) {
			if (username.equals(x.getUsername())) {
				x.setStatus(status);
				System.out.println("Change Status Successfully!");
				return;
			}
		}
		System.out.println("Acount does not exit!");

		return;
		
	}

}
