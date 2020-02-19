public class Empleado {
	private String nombre;
	private String telefono;
	private String departamento;
	
	public Empleado() {
	
	}
	
	public Empleado(String nombre, String telefono, String departamento) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.departamento = departamento;
	}

	public String getNombre() {
		return nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDepartamento() {
		return departamento;
	}

	public String ver() {
		return this.nombre + " telefono: " + this.telefono + " Departamento: " + departamento;
	}
}