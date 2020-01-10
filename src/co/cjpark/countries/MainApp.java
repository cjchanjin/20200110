package co.cjpark.countries;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) throws SQLException {
		List<CountryDto> list = new ArrayList<CountryDto>();
		CountryServiceImpl country = new CountryServiceImpl();
		list = country.allSelect();
				
//		toPrint(list);
		select();
//		insert();
//		update();
//		delete();
		
	}
	private static void toPrint(List<CountryDto> list) {
		for(CountryDto dto : list) {
			System.out.print(dto.getCountry_id() + " : ");
			System.out.print(dto.getCountry_name() + " : ");
			System.out.println(dto.getRegion_id() + " : ");
		}
	}
	
	public static void select() {
		CountryServiceImpl ctr = new CountryServiceImpl();
		CountryDto dto = new CountryDto();
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 지역 ID(숫자)를 입력하세요");
		int key = sc.nextInt();			//실제 키보드에서 입력한 id를 저장
		try {
			dto = ctr.select(key);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();
		System.out.println(dto.getCountry_id() + " " +dto.getCountry_name() + " " + dto.getRegion_id());
	}
	
	private static void insert() {
		CountryServiceImpl ctr = new CountryServiceImpl();
		CountryDto dto = new CountryDto();
		dto.setCountry_id("KR");
		dto.setCountry_name("KOREA");
		dto.setRegion_id(3);
		try {
			int n = ctr.insert(dto);
			if(n != 0)
				System.out.println("정상입력되었음");
			else
				System.out.println("입력이 실패하였음");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void update() {
		CountryServiceImpl ctr = new CountryServiceImpl();
		CountryDto dto = new CountryDto();
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 사용자 ID를 입력하세요.");
		int key = sc.nextInt();			//실제 키보드에서 입력한 id를 저장
		sc.nextLine();
		try {
			dto = ctr.select(key);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("변경할 Country Name을 입력하세요.");
		dto.setCountry_name(sc.nextLine());
		try {
			int n = ctr.update(dto);
			if(n !=0)
				System.out.println("정상적으로 변경 되었습니다.");
			else
				System.out.println("변경 실패");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
	public static void delete () {
		CountryServiceImpl ctr = new CountryServiceImpl();
		CountryDto dto = new CountryDto();
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 국가 ID를 입력하세요");
		dto.setCountry_id(sc.nextLine());
		try {
			int n = ctr.delete(dto);
			if(n !=0 )
				System.out.println("정상적으로 삭제되었습니다.");
			else
				System.out.println("삭제 되지 않았습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
	
		
}
