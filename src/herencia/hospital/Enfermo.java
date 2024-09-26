package herencia.hospital;

public class Enfermo extends Persona {
	private String enfermedad;

	public Enfermo(String nombre, int edad) {
		super(nombre, edad);
	}

	public Enfermo(String nombre, int edad, String enfermedad) {
		super(nombre, edad);
		this.enfermedad = enfermedad;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	@Override
	public void comer() {
		System.out.println(" El enfermo " + getNombre() + " esta comiendo en la habitacion ");
	}

}
