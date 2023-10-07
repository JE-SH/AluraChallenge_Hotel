package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import factory.ConectionFactory;

public class HuespedDao {
	
	private Connection con;
	
	public HuespedDao() {
		this.con = new ConectionFactory().crearConeccion();
	}
	
	public Boolean verificarHuesped(Integer id) {
		try {
			final PreparedStatement statement = con.prepareStatement("Select id from huespedes where id = ?");
			statement.setInt(1, id);
			statement.execute();
			
			final ResultSet result = statement.getResultSet();
			
			while(result.next())
			{
				if(result.getInt("id")>0)
					return true;
			}
			return false;
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
