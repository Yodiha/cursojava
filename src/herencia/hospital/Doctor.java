package herencia.hospital;

public class Doctor extends EmpleadosHospital {
	private String especialidad;

	public Doctor(String nombre, int edad) {
		super(nombre, edad);
	}

	public Doctor(String nombre, int edad, String especialidad) {
		super(nombre, edad);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public void diagnosticoPaciente() {
		if()
			

		System.out.println(" El paciente " + getNombre() + "esta enfermo ");
	}
}
