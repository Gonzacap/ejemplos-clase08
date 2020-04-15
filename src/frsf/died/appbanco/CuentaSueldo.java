package frsf.died.appbanco;

public class CuentaSueldo extends Cuenta{

	@Override
	public void depositar(Double monto) {
		Double comision = monto * 0.002;	
		this.saldo += (monto -comision);		
	}

	@Override
	public void extraer(Double monto) {
		Double comision = monto * 0.005;	
		this.saldo -= (monto +comision);
	}

	@Override
	public void sumarPuntos(Double monto) {
		this.puntosSuperQuiero += (int) (monto/500);
	}

}
