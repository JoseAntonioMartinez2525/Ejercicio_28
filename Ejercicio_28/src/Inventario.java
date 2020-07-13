import java.util.Scanner;

public class Inventario extends Producto {

	private double beneficio;

	public Inventario() {
	this.beneficio=0;
	this.setCodigo("");
	this.setPrecio(0);
	
	}
	
	public Inventario(String c, double p, double b) {
		
		this.setCodigo(c);
		this.setPrecio(p);
		this.beneficio=b;
		
	}	
	public double getBeneficio() {
		return beneficio;
	

	}

	public void setBeneficio(double b) {
		this.beneficio = b;
	}
	
	public double aumento() {
		double b= this.beneficio;
		double a;
		a=(this.getPrecio()*(b))+this.getPrecio();
		return a;
	}
	public String toString() {
		
		return "id: "+this.getCodigo()+"\nPrecio: "+this.getPrecio()+"\nCosto: $"+this.aumento();
	}
	

}
