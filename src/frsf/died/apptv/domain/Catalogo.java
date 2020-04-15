package frsf.died.apptv.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Catalogo {
	
	public enum Ordenamiento {TITULO,CALIFICACION,VISUALIZA}; 

	private List<Serie> series;

	public Catalogo() {
		this.series = new ArrayList<Serie>();
	}

	public Catalogo agregar(Serie s) {
		this.series.add(s);
		return this;
	}

	public void imprimir() {
		Collections.sort(series);
		System.out.println(series);
	}	
	
	public void imprimir(Comparator<Serie> comp ) {
		Collections.sort(series,comp);
		System.out.println(series);		
	}
	
	public void imprimir(Ordenamiento o) {
		Comparator<Serie> comp = null;
		switch (o) {
		case CALIFICACION:
			comp = (s1,s2) -> s1.getCalificacion().compareTo(s2.getCalificacion());
			break;
		case VISUALIZA:
			comp = (s1,s2) -> s1.getVisualizaciones().compareTo(s2.getVisualizaciones());
			break;
		default:
			imprimir();
			break;
		}
		Collections.sort(series,comp);
		System.out.println(series);		
	}
	
	public void imprimirOrdenadoPorTitulo() {
		Collections.sort(series);
		System.out.println(series);
	}

	public void imprimirOrdenadoPorCalificacion() {
		Collections.sort(series, (s1, s2) -> s1.getCalificacion().compareTo(s2.getCalificacion()));
		System.out.println(series);
	}

	public List<Serie> buscar(CriterioBusqueda<Serie> criterio) {
		List<Serie> resultado = new ArrayList<Serie>();
		for (Serie unaSerie : this.series)
			if (criterio.cumple(unaSerie))
				resultado.add(unaSerie);
		return resultado;
	}

	public List<Serie> buscar(Predicate<Serie> criterio1,Predicate<Serie> criterio2) {
		List<Serie> resultado = new ArrayList<Serie>();
		for (Serie unaSerie : this.series)
			if (criterio1.and(criterio2).test(unaSerie)) {
				resultado.add(unaSerie);				
			}
		return resultado;
	}
	
}
