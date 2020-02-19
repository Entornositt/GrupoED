public class Nomina {
	private double sueldo;
	private Empleado trabajador;
	
	public Nomina() {
		
	}
	
	public Nomina(double sueldo, Empleado trabajador) {
		this.sueldo = sueldo;
		this.trabajador = trabajador;
	}

	public double getSueldo() {
		return sueldo;
	}
	
	public void setSueldo() {
		this.sueldo = sueldo;
	}
	
	public Empleado getTrabajador() {
		return trabajador;
	}

	public String ver() {
		return "Nómina por: " + sueldo + " euros, trabajador: " + trabajador.ver();
	}
}