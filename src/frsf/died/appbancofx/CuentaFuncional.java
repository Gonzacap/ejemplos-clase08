package frsf.died.appbancofx;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class CuentaFuncional {
	
	// template method
	
	protected Double saldo;
	protected Integer puntosSuperQuiero;

	protected BiConsumer<CuentaFuncional,Double> deposito;
	protected BiConsumer<CuentaFuncional,Double> puntos;
	protected BiConsumer<CuentaFuncional,Double> extraccion;

	
	
	public final void transferir(Double monto,CuentaFuncional destino) {
		deposito.accept(destino,monto);
		puntos.accept(this,monto);
		extraccion.accept(this,monto);
	}
	
	
	@Override
	public String toString() {
		return this.saldo+" _ "+this.puntosSuperQuiero;
	}

}
