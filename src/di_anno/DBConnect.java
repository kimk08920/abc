package di_anno;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
   Connection conn;  //java.sql
   String driver = "oracle.jdbc.driver.OracleDriver"; 
   String url="jdbc:oracle:thin:@localhost:1521:xe";
   String user = "hr";
   String pwd = "hr";
   
   
	public DBConnect() {
		try{
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url, user, pwd);
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public Connection getConn() {
		return conn;
	}

	public static void main(String[] args) {
         DBConnect db = new DBConnect();
		
	}

}
