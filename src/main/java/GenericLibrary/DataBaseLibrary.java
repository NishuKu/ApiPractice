package GenericLibrary;
/**
 * 
 * This class contain reusable methods of database 
 * @author nishu
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxCrud.Column;

public class DataBaseLibrary {
	Driver driverRef;
	Connection connection;
	
	/**
	 * 
	 * This method 
	 * @throws SQLException
	 */
	public void connectToDtabase() throws SQLException {
		driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		connection=DriverManager.getConnection(Iconstants.databaseUrl,Iconstants.datbaseUN,Iconstants.databsePWD);
		
	}
	public void closeDatabase() throws SQLException {
		connection.close();
	}
	public String readDtaFromDBAndValidate(String query, int columnindex, String expData) throws SQLException {
		boolean flag =false;
		ResultSet result = connection.createStatement().executeQuery(query);
		while(result.next())
		{
			if(result.getString(columnindex).equals(expData))
			{
				flag =true;
				break;
				
			}
		}
		if(flag)
		{
			System.out.println("data verified");
			return expData;
		}
		else 
		{
		return "";
		}
	}
}
