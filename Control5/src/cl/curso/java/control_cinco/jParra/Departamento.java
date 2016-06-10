package cl.curso.java.control_cinco.jParra;

import java.util.Comparator;

public class Departamento {

	private String nombre;
	private String descripcion;

	/**
	 * @param nombre
	 * @param descripcion
	 */
	public Departamento(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Departamento & this.getNombre()==((Departamento)obj).getNombre();
	}

	
}
