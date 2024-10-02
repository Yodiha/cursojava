package tiendaonline;

public class Libro extends Producto {

	private int ISBN;
	private String Titulo;

	public Libro(String ref, double precio) {
		super(ref, precio);

	}

	public Libro(String ref, double precio, int iSBN, String titulo) {
		super(ref, precio);
		ISBN = iSBN;
		Titulo = titulo;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", Titulo=" + Titulo + ", toString()=" + super.toString() + "]";
	}

}
