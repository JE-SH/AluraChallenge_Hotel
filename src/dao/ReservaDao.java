package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Modelo.Reserva;
import factory.ConectionFactory;

public class ReservaDao {

	private Connection connection;

	public ReservaDao() {
		this.connection = new ConectionFactory().crearConeccion();
	}

	public void guardarReserva(Reserva reserva) {
		try {
			final PreparedStatement statement = connection.prepareStatement("Insert into reservas"
					+ "(fecha_entrada,fecha_salida,valor,forma_pago,id_huesped) values (?,?,?,?,?)");
			try (statement) {
				statement.setString(1, reserva.getFecha_entrada());
				statement.setString(2, reserva.getFecha_salida());
				statement.setDouble(3, reserva.getValor());
				statement.setInt(4, reserva.getForma_pago());
				statement.setInt(5, reserva.getId_huesped());

				statement.execute();

			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
