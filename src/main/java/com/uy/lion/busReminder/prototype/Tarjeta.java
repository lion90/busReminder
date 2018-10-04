package uy.lion.busReminder.prototype;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tarjeta {

	private BigDecimal saldoAlCargar;
	private String tipoSaldo;
	private LocalDate fechaRecarga;
	private List<TipoViaje> tiposDeViajePermitidos;

	public Tarjeta(BigDecimal saldoAlCargar, String tipoSaldo, LocalDate fechaRecarga) {
		this.saldoAlCargar = saldoAlCargar;
		this.tipoSaldo = tipoSaldo;
		this.fechaRecarga = fechaRecarga;
		this.tiposDeViajePermitidos = new ArrayList<TipoViaje>();
	}

	public Tarjeta(BigDecimal saldoAlCargar, String tipoSaldo, LocalDate fechaRecarga,
			List<TipoViaje> tiposDeViajePermitidos) {
		super();
		this.saldoAlCargar = saldoAlCargar;
		this.tipoSaldo = tipoSaldo;
		this.fechaRecarga = fechaRecarga;
		this.tiposDeViajePermitidos = tiposDeViajePermitidos;
	}

	public BigDecimal getSaldoAlCargar() {
		return saldoAlCargar;
	}

	public void setSaldoAlCargar(BigDecimal saldoAlCargar) {
		this.saldoAlCargar = saldoAlCargar;
	}

	public String getTipoSaldo() {
		return tipoSaldo;
	}

	public void setTipoSaldo(String tipoSaldo) {
		this.tipoSaldo = tipoSaldo;
	}

	public LocalDate getFechaRecarga() {
		return fechaRecarga;
	}

	public void setFechaRecarga(LocalDate fechaRecarga) {
		this.fechaRecarga = fechaRecarga;
	}

	public List<TipoViaje> getTiposDeViajePermitidos() {
		return tiposDeViajePermitidos;
	}

	public void setTiposDeViajePermitidos(List<TipoViaje> tiposDeViajePermitidos) {
		this.tiposDeViajePermitidos = tiposDeViajePermitidos;
	}
}