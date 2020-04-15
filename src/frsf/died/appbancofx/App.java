package frsf.died.appbancofx;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import frsf.died.appbanco.Cuenta;
import frsf.died.appbanco.CuentaSueldo;

public class App {
	
	public static void main(String[] args) {
		
		CuentaFuncional  c1 = new CuentaFuncional();
		CuentaFuncional  c2 = new CuentaFuncional();
		c1.saldo=1000.0;
		c1.puntosSuperQuiero=100;

		c2.saldo=500.0;
		c2.puntosSuperQuiero=50;

		// cuenta premium
		c1.deposito = (cta,montoTrans) -> cta.saldo+=montoTrans;
		c1.puntos= (cta,montoTrans) -> cta.puntosSuperQuiero+=(int)(montoTrans/10);
		c1.extraccion = (cta,montoTrans) ->cta.saldo-=montoTrans;
		
		// cuenta sueldo
		c2.deposito = (cta,montoTrans) -> cta.saldo+= (montoTrans*0.998);
		c2.puntos= (cta,montoTrans) -> cta.puntosSuperQuiero+= (int)(montoTrans/100);
		c2.extraccion = (cta,montoTrans) ->cta.saldo-=(montoTrans*1.005);


		System.out.println(c1);
		System.out.println(c2);

		c1.transferir(100.0, c2);
		
		System.out.println(c1);
		System.out.println(c2);
		
//		1000.0 _ 100
//		500.0 _ 50
//		900.0 _ 110
//		599.8 _ 50
	
	}

}
