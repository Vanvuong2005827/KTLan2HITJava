package impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Account;
import model.Address;
import model.Person;
import model.Role;
import model.Status;
import service.AuthService;

public class AuthServiceImpl implements AuthService {
	
	static Scanner scanner = new Scanner(System.in);
    public List<Account> users = new ArrayList<Account>();
	public Account CurrentUser = null;
	
	public AuthServiceImpl() {
		users.add(new Account("9", "Đinh Văn Vượng", 18, new Address("Tân Trung", "Ninh Bình"), "27/08/2005", "Dinhvuong2005", "12345678", Role.ADMIN, Status.ACTIVE));
	}
	
	@Override
	public void login(Scanner scanner) {
		System.out.println("Enter username");
		String username = scanner.nextLine();
		System.out.println("Enter password");
		String password = scanner.nextLine();
		
		for(Account account : users) {
			if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
				CurrentUser = account;
				System.out.println("Login Successfully!");
				return;
			}
		}
		
		System.out.println("Wrong username or password, please try again!");
		return;
		
	}

	@Override
	public void logout() {
		if (CurrentUser == null) {
			System.out.println("You are not to login!");
		} else {
			System.out.println("Logout Successfully!");
			CurrentUser = null;
		}
		return;
	}

	@Override
	public void changePassword(String username, String oldPassword, String newPassword) {

			if (CurrentUser.getUsername().equals(username) && CurrentUser.getPassword().equals(oldPassword)) {
				CurrentUser.setPassword(newPassword);
				System.out.println("Change Password Successfully!");
				return;
		} else System.out.println("Wrong username or password, please try again!");
	}
	
}
