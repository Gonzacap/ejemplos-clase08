package frsf.died.appbanco;

public class App {

public static void main(String[] args) {
	
	Cuenta c1 = new CuentaPremium();
	c1.puntosSuperQuiero=100;
	c1.saldo=1000.0;

	Cuenta c2 = new CuentaSueldo();
	c2.puntosSuperQuiero=50;
	c2.saldo=500.0;

	System.out.println(c1);
	System.out.println(c2);

	c1.transferir(100.0, c2);
	
	System.out.println(c1);
	System.out.println(c2);
}
}
