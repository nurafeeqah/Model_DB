/**
 * 
 */
package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Model;

/**
 * @author NurAfeeqah
 *
 */
public class ReadRecord {
	
	private Connection connection;
	private ResultSet results;
	
	private Model model = new Model();
	private int modelID;
	
	public ReadRecord(String dbName, String uname, String pwd, int modelID) {
		
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		this.modelID = modelID;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doRead() {
		String query = "select * from model where modelID = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, this.modelID);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			model.setModelID(this.results.getInt(1));
			model.setModelName(this.results.getString("modelName"));
			model.setModelAuthor(this.results.getString("modelAuthor"));
			model.setModelDate(this.results.getString("modelDate"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Model getModel() {
		return this.model;
	}
	

}
