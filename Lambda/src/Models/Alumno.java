package Models;

public class Alumno {
	private String nombre;
	private String apellido;

	public Alumno(String nombre, String apellido)
	{
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public double getPromedio()
	{
		return 0d;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
}
