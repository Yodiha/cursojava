package herencia.hospital;

public class Hospital {

	public static void main(String[] args) {
		String nombre;
		String[] sintomas = { "fiebre", "Dolor de cabeza" };
		Paciente paciente = new Paciente("juan", 26, sintomas);
		Enfermo enfermo=new Enfermo("pedro", 95, "Alergia"); 
		Habitacion habitacion = new Habitacion( 3 ,"");
		EmpleadosHospital empleados = new EmpleadosHospital("juan", 45,"tarde");
	}
}
