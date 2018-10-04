package uy.lion.busReminder.prototype;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Bean {

	public LocalDate calcularSiguienteVencimiento(Persona oPersona, Tarjeta oTarjeta) {
		BigDecimal nGastoSemanal = new BigDecimal(0);
		List<Rutina> colViajesSemanales = oPersona.getViajesSemanales();

		for (Rutina dtRutina : colViajesSemanales) {
			nGastoSemanal.add(dtRutina.getCantidad());
		}

		System.out.println(
				"Estos son los estrims ñery!!! " + colViajesSemanales.stream().map((x) -> x.getCantidad()).reduce((x, y) -> x.add(y)).get());

		BigDecimal nSemanasTotales = oTarjeta.getSaldoAlCargar().divide(nGastoSemanal);
		// Al usar la parte entera termino avisando antes.
		return oTarjeta.getFechaRecarga().plusWeeks(nSemanasTotales.longValue());
	}

}
