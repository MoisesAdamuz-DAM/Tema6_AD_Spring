package es.studium.beans.academia;

public class Alumnos {
	// Atributos
	private String nombre;
	private String direccion;
	private int matricula;

	// Constructor vacío
	public Alumnos() {
		nombre = "";
		direccion = "";
		matricula = 0;
	}

	// Constructor por parámetros
	public Alumnos(String nombre, String direccion, int matricula) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.matricula = matricula;
	}

	// getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Alumnos [nombre=" + nombre + ", direccion=" + direccion + ", matricula=" + matricula + "]";
  }
}
