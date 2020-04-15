package frsf.died.apptv.domain;

@FunctionalInterface
public interface CriterioBusqueda<T> {

	public Boolean cumple(T t);
}
