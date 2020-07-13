
public class Producto {
	private String codigo;
	private double precio;
	
	public Producto() {
		this.codigo="";
		this.precio=0;
	}
	
	public Producto(String c, double p) {
		this.codigo=c;
		this.precio=p;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String toString() {
		
		return "id: "+this.getCodigo()+"\nPrecio: "+this.getPrecio();
	}
}
