package uy.lion.busReminder.prototype;

import java.util.List;

public class Persona {

	private List<Rutina> viajesSemanales;

	public Persona(List<Rutina> colViajesSemanales) {
		this.viajesSemanales = colViajesSemanales;
	}

	public List<Rutina> getViajesSemanales() {
		return viajesSemanales;
	}

	public void setViajesSemanales(List<Rutina> colViajesSemanales) {
		this.viajesSemanales = colViajesSemanales;
	}

}
