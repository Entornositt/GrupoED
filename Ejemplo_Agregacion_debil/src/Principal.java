   
public class Principal {

	public static void main(String[] args) {
		Empleado emp = new Empleado("Luis Pérez", "616777888", "Ventas");
		Nomina nomi = new Nomina(2000, emp);
		System.out.println(nomi.ver());
		// Puedo cambiar el teléfono al empleado a través de su nómina
		nomi.getTrabajador().setTelefono("615555666");
		System.out.println(nomi.ver());
			
		nomi = null; 
		System.out.println("El objeto empleado sigue activo " + emp.ver());

	  }
	}