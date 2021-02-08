package es.studium.beans.academia;

import java.util.ArrayList;
import java.util.List;

public class Centros {

	// Atributos
	private String nombre;
	private String direccion;
	private List<Alumnos> alumnos;
	private int codigo;

	// Constructor vacío
	public Centros() {
		nombre = "";
		direccion = "";
		alumnos = new ArrayList<Alumnos>();
		codigo = 0;
	}

	// Constructor por parámetros
	public Centros(String nombre, String direccion, List<Alumnos> alumnos, int codigo) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.alumnos = alumnos;
		this.codigo = codigo;
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

	public List<Alumnos> getAlumnos() {
		return alumnos;

	}

	public void setAlumnos(List<Alumnos> alumnos) {
		this.alumnos = alumnos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return "Centros [nombre=" + nombre + ", direccion=" + direccion + ", alumnos=" + alumnos + ", codigo=" + codigo + "]";
	}
}
