import java.util.Scanner;
public class Alumno{
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	public Alumno(){
		teclado = new Scanner(System.in);
		System.out.println("Indica el nombre");
		nombre = teclado.next();
		System.out.println("Indica tu edad");
		edad = teclado.nextInt();
	}
	public void imprimir(){
		System.out.println("Tu nombre es: "+nombre);
		System.out.println("Indica tu edad es: "+edad);
	}
	public void mayor_edad(){
		if (edad >= 18)
		System.out.println("Eres mayor de edad");
		else
		System.out.println("No eres mayor de edad");
	}
	
	public static void main (String [] args){
	Alumno datos =new Alumno();
	datos.imprimir();
	datos.mayor_edad();
	
	}
}
		
