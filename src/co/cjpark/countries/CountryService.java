package co.cjpark.countries;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public abstract class CountryService {
		//추상클래스 - abstract 붙임
	
	public Connection conn;  //private 는 상속이 안되기때문에 connection 기능 쓴다
	public PreparedStatement psmt;
	public ResultSet rs;
	
//	private String driver="oracle.jdbc.driver.OracleDriver";
//	private String url="jdbc:oracle:thin:@localhost:1521:xe";
//	private String user="hr";
//	private String password="hr";
	
	private String driver;
	private String url;
	private String user;
	private String password;
	
	public CountryService() {				//생성자 통해서 DB 연결
		dbConfiguration();			//외부 설정파일을 읽어오는 메소드
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	private void dbConfiguration() {		//외부 설정파일을 읽어오는 메소드
		Properties properties = new Properties();
		Reader reader;
		try {
			reader = new FileReader("config/db.properties");				//  경로 주고 쓴다  /co/cjpark/countries/db.properties
			properties.load(reader);
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public abstract List<CountryDto> allSelect()throws SQLException;
	public abstract CountryDto select(int key)throws SQLException;
	public abstract int insert(CountryDto dto)throws SQLException;
	public abstract int update(CountryDto dto)throws SQLException;
	public abstract int delete(CountryDto dto)throws SQLException;
	
}
