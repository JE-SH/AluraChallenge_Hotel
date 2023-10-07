package Modelo;

import java.math.BigDecimal;

public class Reserva {
	private String fecha_entrada;
	private String fecha_salida;
	private Double valor;
	private Integer forma_pago;
	private Integer id_huesped;
	
	public Reserva(String fecha_entrada, String fecha_salida, Double valor, Integer forma_pago, Integer id_huesped) {
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.valor = valor;
		this.forma_pago = forma_pago;
		this.id_huesped = id_huesped;
	}

	public Reserva(String fecha_entrada, String fecha_salida, Double valor, Integer forma_pago) {
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.valor = valor;
		this.forma_pago = forma_pago;
	}
//GETTERS
	public String getFecha_entrada() {
		return fecha_entrada;
	}

	public String getFecha_salida() {
		return fecha_salida;
	}

	public Double getValor() {
		return valor;
	}

	public Integer getForma_pago() {
		return forma_pago;
	}

	public Integer getId_huesped() {
		return id_huesped;
	}
//SETTERS
	public void setId_huesped(Integer id_huesped) {
		this.id_huesped = id_huesped;
	}
	
	

}
