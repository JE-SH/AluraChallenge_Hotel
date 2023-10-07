package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import factory.ConectionFactory;

public class UsuarioDao {
	private Connection con;

	public UsuarioDao() {
		this.con = new ConectionFactory().crearConeccion();
	}

	public Boolean login(String usuario, String clave) {
		try {
			final PreparedStatement preparedStatement = con
					.prepareStatement("SELECT id from usuarios where usuario = ? and clave = ?");
			try (preparedStatement) {
				preparedStatement.setString(1, usuario);
				preparedStatement.setString(2, clave);

				preparedStatement.execute();
				final ResultSet resultset = preparedStatement.getResultSet();
				while (resultset.next()) {
					if (resultset.getInt("id") > 0)
						return true;
				}
				return false;

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
