package frsf.died.clasesinternas;

public class ClaseB {

	private Double precio;
	private Elemento e;
	
	public class Elemento{
		private String nombre;
		private Integer valor;
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Integer getValor() {
			return valor;
		}
		public void setValor(Integer valor) {
			this.valor = valor;
		}
		
		
	}
	
	public void construir() {
		this.e = new Elemento();
		e.nombre = " aaaa";
		e.valor= 9999;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Elemento getE() {
		return e;
	}

	public void setE(Elemento e) {
		this.e = e;
	}
	
	
}
