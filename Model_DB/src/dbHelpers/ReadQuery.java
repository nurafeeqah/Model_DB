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
public class ReadQuery {

	private Connection connection;
	private ResultSet results;

	public ReadQuery(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName;

		//set up the driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void doRead() {
		String query = "select * from model";

		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results = ps.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getHTMLTable() {
		String table = "";
		table += "<table border=1>";

		try {
			while(this.results.next()) {
				Model model = new Model();
				model.setModelID(this.results.getInt("modelID"));
				model.setModelName(this.results.getString("modelName"));
				model.setModelAuthor(this.results.getString("modelAuthor"));
				model.setModelDate(this.results.getString("modelDate"));

				table +="<tr>";
				
				table +="<td>";
				table += model.getModelName();
				table +="</td>";
				
				table +="<td>";
				table += model.getModelAuthor();
				table +="</td>";
				
				table +="<td>";
				table += model.getModelDate();
				table +="</td>";
				
				table +="<td>";
				table += "<a href=update?modelID=" + model.getModelID() + ">update</a> <a href=delete?modelID=" + model.getModelID() + ">delete</a>";
				table +="</td>";
				
				table +="</tr>";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		table += "</table>";
		return table;
	}

}
