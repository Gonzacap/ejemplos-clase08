package frsf.died.appbanco;

public abstract class Cuenta {
	
	// template method
	
	protected Double saldo;
	protected Integer puntosSuperQuiero;

	public final void transferir(Double monto,Cuenta destino) {
		// paso 1
		destino.depositar(monto);
		
		// paso 2
		this.sumarPuntos(monto);
		
		// paso3
		this.extraer(monto);
	}
	
	public abstract void depositar(Double monto);

	public abstract void extraer(Double monto);

	public abstract void sumarPuntos(Double monto);
	
	@Override
	public String toString() {
		return this.saldo+" _ "+this.puntosSuperQuiero;
	}

}
