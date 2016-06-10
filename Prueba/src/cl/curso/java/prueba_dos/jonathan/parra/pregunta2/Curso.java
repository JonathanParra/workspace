package cl.curso.java.prueba_dos.jonathan.parra.pregunta2;
/**
 * 
 * @author Jonathan Parra
 *
 */

public class Curso implements Imprimible{
	private String nombre;
	private Alumno[] alumno;
	/**
	 * constructor por defecto
	 */
	public Curso(){
		nombre=null;
		for(int ix=0;ix<alumno.length;ix++){
			getAlumno()[ix]=null;
		}
	}
	/**
	 * 
	 * Constructor por parametros
	 */
	public Curso(String nombre, Alumno[] alumno) {
		super();
		this.nombre = nombre;
		this.alumno = alumno;
	}
	/**
	 * Getters and Setters
	 * @return nombre y Alumnos[]
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Alumno[] getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno[] alumno) {
		this.alumno = alumno;
	}
	/**
	 * imprime el promedio total  del curso.
	 * @return
	 */
	public double promedioCurso(){
		int promedio=0;
		for(int ix=0;ix<alumno.length;ix++){
			promedio+=getAlumno()[ix].getPromedio();
		}
		promedio=promedio/alumno.length;
		return promedio;
	}
	/**
	 * obtiene el mejor promedio del curso
	 */
	 public void mejorPromedio(){
		 double mejorPromedio=getAlumno()[0].getPromedio();
		 int indice=0;
		 for(int ix=1;ix<alumno.length;ix++){
			 if( mejorPromedio < getAlumno()[ix].getPromedio()){
				 mejorPromedio=getAlumno()[ix].getPromedio();
				 indice=ix;
			 }	 
		 }
		System.out.println("El alumno con mejor promedioes : "+ getAlumno()[indice].getNombre()+" Promedio : "+getAlumno()[indice].getPromedio());	 
	 }
	 /**
	  * imprime el nombre del curso y sus alumnos
	  */
	 public void imprimir(){
		 System.out.println("Curso : "+getNombre()+"\n");
		 System.out.println("Nombre Alumnos \t Promedio");
		 for(int ix=0;ix<alumno.length;ix++){
			 System.out.print((ix+1)+".-");
			 getAlumno()[ix].imprimir();
		 }
		 
	 }
	
	
	//----------------finClass---------------
}
