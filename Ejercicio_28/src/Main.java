import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);	
		boolean on=true; String r="si";int op=0;double b=0;
		ArrayList<Producto> prod =new ArrayList<Producto>();
		ArrayList<Inventario> prodI =new ArrayList<Inventario>();
		

		Inventario i= new Inventario();
		
			//System.out.println("Desea capturar: 1.Producto, 2.Salir");
			//op=teclado.nextInt();
			
			Producto p= new Producto();
			System.out.println("Ingrese los datos del producto: ");
			System.out.print("Ingrese el codigo: ");
			p.setCodigo(teclado.nextLine());
			System.out.print("Ingrese el precio: $");
			p.setPrecio(teclado.nextDouble());

				System.out.println("El producto esta inventariado");
				i.setCodigo(p.getCodigo());
				i.setPrecio(p.getPrecio());
				
				System.out.println("¿de cuanto va a ser el aumento del costo?");
				i.setBeneficio(teclado.nextDouble());
				System.out.println(i.toString());
				prodI.add(i);
				


			System.out.println("\n\nProducto Registrado: ");
			
	
		System.out.println(prodI.get(0).toString());
	}
}

