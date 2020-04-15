package frsf.died.apptv.domain;

public class CriterioCalificacionMinimaMaxima implements CriterioBusqueda<Serie>{

	private Integer calificMin;
	private Integer calificMax;
	
	public Integer getCalificMin() {
		return calificMin;
	}

	public void setCalificMin(Integer calificMin) {
		this.calificMin = calificMin;
	}

	public Integer getCalificMax() {
		return calificMax;
	}

	public void setCalificMax(Integer calificMax) {
		this.calificMax = calificMax;
	}

	@Override
	public Boolean cumple(Serie t) {
		return t.getCalificacion()<calificMax && t.getCalificacion()>calificMin;
	}

	
}
