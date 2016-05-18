import java.util.Scanner;
//clase
public class Persona{
	//atributos
	private Scanner teclado;
	private String nombre;
	private int edad;
	//metodos
	public void inicializar(){
		teclado = new Scanner(System.in);
		System.out.println("Ingresa el nombre");
		nombre = teclado.nextLine();
		System.out.println("Ingresa edad");
		edad = teclado.nextInt();
		}
	public void imprimir(){
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
	}
	public void es_mayor_edad(){
		if (edad >= 18)
			System.out.println("Es mayor de edad");
		else
			System.out.println("No es mayor de edad");
	}
	 

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.inicializar();
		persona1.imprimir();
		persona1.es_mayor_edad();
	}
}