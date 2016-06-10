package cl.curso.java.control_cinco.jParra;

import java.util.Comparator;

public class Empleado extends Persona implements Comparator<Empleado>{
	private Departamento depa;
	private int salario;
	private static boolean x;
	
	/**
	 * @return the depa
	 */
	public Departamento getDepa() {
		return depa;
	}

	/**
	 * @param depa the depa to set
	 */
	public void setDepa(Departamento depa) {
		this.depa = depa;
	}

	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	/**
	 * @return the x
	 */
	public boolean isX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public static void setX(boolean ex) {
		x = ex;
	}

	public Empleado(){
		x=false;
	}
	
	/**
	 * @param depa
	 * @param salario
	 */
	public Empleado(Departamento depa, int salario) {
		super();
		this.depa = depa;
		this.salario = salario;
	}



	@Override
	public boolean equals(Object obj){
		return obj instanceof Empleado && this.getRut()==((Empleado)obj).getRut();
	}

	@Override
	public int compare(Empleado o1, Empleado o2) {
		if(!(this.isX())){
			if(o1.getNombre().charAt(0) < o2.getNombre().charAt(0)){
				return 1;
			}
		}
		if(this.isX()){
			if(o1.getDepa().equals(o2.getDepa())){
				return 0;
			}
		}
		
			return -1;		
			
	}
	
	
}
