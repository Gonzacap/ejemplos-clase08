package frsf.died.appbanco;

public class CuentaPremium extends Cuenta {


	@Override
	public void extraer(Double monto) {
		this.saldo -= monto;
	}

	@Override
	public void depositar(Double monto) {
		this.saldo += monto;
	}
	
	@Override
	public void sumarPuntos(Double monto) {
		this.puntosSuperQuiero = (int) (this.puntosSuperQuiero + (monto / 10));		
	}

}
