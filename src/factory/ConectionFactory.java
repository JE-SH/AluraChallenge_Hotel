package factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConectionFactory {
	
	private DataSource datasource;
	
	public ConectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/hotel_alura?useTimeZone=true&serverTimeZone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("admin");
		
		this.datasource=comboPooledDataSource;
	}
	
	public Connection crearConeccion() {
		try {
			return this.datasource.getConnection();
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
