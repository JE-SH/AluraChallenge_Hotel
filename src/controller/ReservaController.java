package controller;

import Modelo.Reserva;
import dao.ReservaDao;

public class ReservaController {
	
public void guardarReserva(Reserva reserva) {
		new ReservaDao().guardarReserva(reserva);
	}

}
