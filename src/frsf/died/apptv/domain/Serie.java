package frsf.died.apptv.domain;

public class Serie implements Comparable<Serie>{

	private String titulo;
	private Genero genero;
	private Integer calificacion;
	private Integer visualizaciones;
	private Double costo;
	private Integer capitulos;
	
	public Serie() {
		super();
	}
	
	@Override
	public int compareTo(Serie o) {
		return this.titulo.compareTo(o.titulo);
	}

	public Serie(String titulo, Genero genero, Integer calificacion, Integer visualizaciones, Double costo,
			Integer capitulos) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.calificacion = calificacion;
		this.visualizaciones = visualizaciones;
		this.costo = costo;
		this.capitulos = capitulos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Integer getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}

	public Integer getVisualizaciones() {
		return visualizaciones;
	}

	public void setVisualizaciones(Integer visualizaciones) {
		this.visualizaciones = visualizaciones;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public Integer getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(Integer capitulos) {
		this.capitulos = capitulos;
	}


	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", calificacion=" + calificacion + ", visualizaciones=" + visualizaciones
				+ "]";
	}


	
	
	
	
}
