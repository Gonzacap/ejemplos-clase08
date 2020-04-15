package frsf.died.apptv.domain;

public class App {
	
	public static void main(String[] args) {
		Serie s1 = new Serie("Exotic Joe", Genero.POLICIAL, 55, 7103, 22.5, 8);
		Serie s2 = new Serie("Mindhunter", Genero.CRIMEN, 82, 2021, 22.5, 6);
		Serie s3 = new Serie("Homeland", Genero.SUSPENSO, 77, 9262, 22.5, 7);
		Serie s4 = new Serie("Ozark", Genero.CRIMEN, 99, 4232, 22.5, 16);
		Serie s5 = new Serie("Better Call Saul", Genero.SUSPENSO, 88, 6252, 29.5, 9);
		
		Catalogo cat = new Catalogo();
		cat.agregar(s1).agregar(s2).agregar(s3).agregar(s4).agregar(s5);
		
		cat.imprimirOrdenadoPorTitulo();
		cat.imprimirOrdenadoPorCalificacion();
		
		CriterioBusqueda<Serie> criterio = new CriterioCalificacionMinimaMaxima();
		((CriterioCalificacionMinimaMaxima)criterio).setCalificMin(80);
		((CriterioCalificacionMinimaMaxima)criterio).setCalificMax(90);
		System.out.println(cat.buscar(criterio));
		
		System.out.println(cat.buscar(s -> s.getCalificacion()>80 && s.getCalificacion()<90));
		
		System.out.println(cat.buscar(s -> s.getCalificacion()>75 && s.getCalificacion()<90, s -> s.getVisualizaciones()>3500));
		
	}

}
