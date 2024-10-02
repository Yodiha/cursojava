package tiendaonline;

public class Producto {
	private String ref;
	private double precio;

	public Producto(String ref, double precio) {
		super();
		this.ref = ref;
		this.precio = precio;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [ref=" + ref + ", precio=" + precio + ", toString()=" + super.toString() + "]";
	}

}
