package frsf.died.clasesinternas;

import frsf.died.clasesinternas.ClaseB.Elemento;

public class ClaseA {
	
	private Integer x;
	private Integer valor1;
	private Integer valor2;
	
	private ClaseA() {
		
	}
	
	public static class Builder{

		private ClaseA instancia = null;
		public Builder() {
			this.instancia = new ClaseA();
		}
		
		public Builder valorX(Integer x1) {
			instancia.x = x1;
			return this;
		}
		
		public Builder valor1(Integer x1) {
			instancia.valor1 = x1;
			return this;
		}
		
		public Builder valor2(Integer x1) {
			instancia.valor2 = x1;
			return this;
		}
		
		public ClaseA construir() {
			if(instancia.valor1 <0 || instancia.valor1 == null) throw new RuntimeException(" no se puede");
			return instancia;
		}
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "ClaseA [x=" + x + ", valor1=" + valor1 + ", valor2=" + valor2 + "]";
	}

	
}
