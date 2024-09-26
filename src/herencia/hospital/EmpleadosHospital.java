package herencia.hospital;

public class EmpleadosHospital extends Persona {
	private String turno;

	public EmpleadosHospital(String nombre, int edad) {
		super(nombre, edad);

	}

	public EmpleadosHospital(String nombre, int edad, String turno) {
		super(nombre, edad);
		this.turno = turno;
	}

	@Override
	public void comer() {
		System.out.println("El empleado" + getNombre() + "esta cimiendo en el comedor");
	}

	public void fichar() {
		System.out.println("el empleado" + getNombre() + "esta fichando");
	}
}
