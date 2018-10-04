package uy.lion.busReminder.prototype;

import java.math.BigDecimal;

public class Rutina {
	private TipoViaje tipoViaje;
	private BigDecimal cantidad;

	public Rutina(TipoViaje tipoViaje, BigDecimal cantidad) {
		this.tipoViaje = tipoViaje;
		this.cantidad = cantidad;
	}

	public TipoViaje getTipoViaje() {
		return tipoViaje;
	}

	public void setTipoViaje(TipoViaje tipoViaje) {
		this.tipoViaje = tipoViaje;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

}
