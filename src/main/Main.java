package main;


import java.util.Scanner;

import impl.AccountServiceImpl;
import impl.AuthServiceImpl;
import model.Account;
import model.Role;
import service.AccountService;
import service.AuthService;




public class Main {
	private AuthServiceImpl authService = new AuthServiceImpl();
	private AccountService accountService = new AccountServiceImpl(authService);
	
	static Scanner scanner = new Scanner(System.in);
	
	
	public void Print() {
		for(Account x : accountService.getAllAccount()) {
			System.out.println(x.toString());
		}
	}
	
	public void Create() {
		
		authService.users.add(new Account());
		System.out.println("Nhập id:");
		authService.users.getLast().setId(scanner.nextLine());
		
		System.out.println("Nhập Fullname:");
		authService.users.getLast().setFullName(scanner.nextLine());
		
		System.out.println("Nhập age");
	}
	
	public void UIForAdmin() {
		int choice;
		do {
			System.out.println("===== HỆ THỐNG QUẢN LÝ TÀI KHOẢN =====");
			System.out.println("Xin Chào ADMIN: " + authService.CurrentUser.getUsername());
			System.out.println("Chọn một trong cá chức năng sau:");
			System.out.println("1. Xem danh sách tài khoản");
			System.out.println("2. Tạo tài khoản mới");
			System.out.println("3. Tìm kiếm tài khoản theo username");
			System.out.println("4. Xóa tài khoản");
			System.out.println("5. Thay đổi trạng thái tài khoản (ACTIVE <> BAN)");
			System.out.println("6. Xem thông tin cá nhân");
			System.out.println("0. Đăng xuất");
			
			choice = scanner.nextInt();
			switch (choice) {
				case 1:
					Print();
					break;
				case 2:
					Create();
					break;
			//	throw new IllegalArgumentException("Unexpected value: " + key);
			}
			
		} while (choice != 0);
		
	}
	
	public void UIForUser() {
		
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		Scanner scanner = new Scanner(System.in);

		do {
			main.authService.login(scanner);
			if (main.authService.CurrentUser.getRole().equals(Role.ADMIN)) main.UIForAdmin();
			if (main.authService.CurrentUser.getRole().equals(Role.USER)) main.UIForUser();
		} while (main.authService.CurrentUser == null);
//		if (authService.CurrentUser != null) {
//			if (authService.CurrentUser.getRole().equals(Role.ADMIN)) 
//		}
	} 
	
}
