package uy.lion.busReminder.prototype;

import java.math.BigDecimal;

public class TipoViaje {

	private BigDecimal precio;

	public TipoViaje(BigDecimal precio) {
		super();
		this.precio = precio;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

}
