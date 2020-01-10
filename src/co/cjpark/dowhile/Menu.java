package co.cjpark.dowhile;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		int choice;
		boolean b = true;
		do {
			System.out.println("==========ERP==========");
			System.out.println("       1.     직 원 관 리      ");
			System.out.println("       2.     급 여 관 리      ");
			System.out.println("       3.     부 서 관 리      ");
			System.out.println("       4.     종        료      ");
			System.out.println("=======================");
			System.out.println("원하는 메뉴 번호를 입력하세요.  ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				employeMenu();
				break;
			case 2:
				salaryMenu();
				break;
			case 3:
				departmentMenu();
				break;
			case 4:
				b = false;
				System.out.println("프로그램이 종료 되었습니다.");
				break;
			}
		} while (b);
	}

	public void employeMenu() {
		int choice;
		boolean b = true;
		do {
			System.out.println("==========직원관리==========");
			System.out.println("       1.     직 원 조 회      ");
			System.out.println("       2.     직 원 등 록      ");
			System.out.println("       3.     직 원 갱 신      ");
			System.out.println("       4.     직 원 삭 제      ");
			System.out.println("       5.     돌 아 가 기      ");
			System.out.println("=======================");
			System.out.println("원하는 메뉴 번호를 입력하세요.  ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("직원 조회하는 화면");
				break;
			case 2:
				System.out.println("직원 등록하는 화면");
				break;
			case 3:
				System.out.println("직원 갱신하는 화면");
				break;
			case 4:
				System.out.println("직원 삭제하는 화면");
				break;
			case 5:
				b = false;
				break;
			}
		} while (b);
	}

	public void salaryMenu() {
		int choice;
		boolean b = true;
		do {
			System.out.println("==========급여관리==========");
			System.out.println("       1.     급 여 조 회      ");
			System.out.println("       2.     급 여 등 록      ");
			System.out.println("       3.     급 여 변 경      ");
			System.out.println("       4.     급 여 삭 제      ");
			System.out.println("       5.     돌 아 가 기     ");
			System.out.println("=======================");
			System.out.println("원하는 메뉴 번호를 입력하세요.  ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("급여 조회하는 화면");
				break;
			case 2:
				System.out.println("급여 등록하는 화면");
				break;
			case 3:
				System.out.println("급여 갱신하는 화면");
				break;
			case 4:
				System.out.println("급여 삭제하는 화면");
				break;
			case 5:
				b = false;
				break;
			}
		} while (b);
	}

	public void departmentMenu() {
		int choice;
		boolean b = true;
		do {
			System.out.println("==========부서관리==========");
			System.out.println("       1.     부 서 조 회      ");
			System.out.println("       2.     부 서 등 록      ");
			System.out.println("       3.     부 서 변 경      ");
			System.out.println("       4.     부 서 삭 제      ");
			System.out.println("       5.     돌 아 가 기     ");
			System.out.println("=======================");
			System.out.println("원하는 메뉴 번호를 입력하세요.  ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("부서 조회하는 화면");
				break;
			case 2:
				System.out.println("부서 등록하는 화면");
				break;
			case 3:
				System.out.println("부서 갱신하는 화면");
				break;
			case 4:
				System.out.println("부서 삭제하는 화면");
				break;
			case 5:
				b = false;
				break;
			}
		} while (b);
	}

}
