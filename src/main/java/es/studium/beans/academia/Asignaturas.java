package es.studium.beans.academia;

public class Asignaturas {

	// Atributos
	private String nombre;
	private int horas;
	private double notas;
	private int codigo;

	// Constructor vacío
	public Asignaturas() {
		nombre = "";
		horas = 0;
		notas = 0.0;
		codigo = 0;

	}

	// Constructor por parámetros
	public Asignaturas(String nombre, int horas, double notas, int codigo) {
		this.nombre = nombre;
		this.horas = horas;
		this.notas = notas;
		this.codigo = codigo;
	}

	// getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Asignaturas [nombre=" + nombre + ", horas=" + horas + ", notas=" + notas + ", codigo=" + codigo + "]";
	}

}
