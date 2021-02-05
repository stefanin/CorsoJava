package it.corso.java.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class EsempioDatabase {
	
	private Connection con;

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		EsempioDatabase d = new EsempioDatabase();
		try {
				System.out.println(d.getConnection().isClosed());
				d.elencoTag();
				
			}
			catch (Exception e) {
			 e.printStackTrace();
			}
		

			
		 


	}
	 */
	
	public Connection getConnection() {
		if(con == null) {
			MysqlDataSource datasource = new MysqlDataSource();
			datasource.setServerName("127.0.0.1");
			datasource.setPort(3306);
			datasource.setDatabaseName("m49");
			datasource.setUser("root");
			datasource.setPassword("m49sql");
			try {
					con = datasource.getConnection();
				}
				catch (Exception e) {
				 e.printStackTrace();
				}
			
			
		}
		return con;
	}
	
	public void elencoTag() throws SQLException {
		String vSQL="SELECT * FROM `TAGLocation` ";
		
		PreparedStatement ps = getConnection().prepareStatement(vSQL);
		try {
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(2));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		
	}
}
