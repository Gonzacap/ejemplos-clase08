package frsf.died.clasesinternas;

import frsf.died.clasesinternas.ClaseB.Elemento;

public class App {
	
	
	public static void main(String[] args) {
		ClaseA.Builder builder = new ClaseA.Builder();
		
		builder.valor1(44).valor2(88).valorX(2);

		ClaseA inst2 = builder.construir();
		
		ClaseA inst = new ClaseA.Builder().valor1(34).valor2(435).valorX(32).construir();
	
		System.out.println(inst);
		System.out.println(inst2);
	}

}
