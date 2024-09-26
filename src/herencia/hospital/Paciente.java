package herencia.hospital;

public class Paciente extends Persona {
	private String[] sintomas;

	public Paciente(String nombre, int edad) {
		super(nombre, edad);
	}

	public Paciente(String nombre, int edad, String[] sintomas) {
		super(nombre, edad);
		this.sintomas = sintomas;

	}

	public String[] getSintomas() {
		return sintomas;
	}

	public void setSintomas(String[] sintomas) {
		this.sintomas = sintomas;
	}

	@Override
	public void comer() {
		System.out.println(" El paciente " + getNombre() + " esta comiendo en la cafeteria ");

	}

}
