package com.curso.java.interfaces.ejerciciointerfaz;

public class Comensal1 extends Cliente {
	private Boolean tieneReserva;

	public Comensal1(String nombre) {
		super(nombre);

	}

	public Comensal1(String nombre, Boolean tieneReserva) {
		super(nombre);
		this.tieneReserva = tieneReserva;
	}

	public Boolean getTieneReserva() {
		return tieneReserva;
	}

	public void setTieneReserva(Boolean tieneReserva) {
		this.tieneReserva = tieneReserva;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public void tomarCafe(TazaDeCafe tazadecafe) {
		System.out.println("comensal1" + getNombre());
	}

}
