import java.util.Scanner;
public class Empleado{
	Scanner teclado;
	String nombre;
	float sueldo;
	public void inicializa(){
		teclado =  new Scanner (System.in);
		System.out.println("Indica tu nombre");
		nombre = teclado.nextLine();
		System.out.println("Indica tu sueldo");
		sueldo = teclado.nextFloat();		
	}
	public void imprime(){
		System.out.println("Tu nombre es: "+nombre);
		System.out.println("Tu sueldo es "+sueldo);
	}
	public void paga_impuestos(){
		if(sueldo > 3000)
		System.out.println("Tu deves paga impuestos");
	}

	public static void main(String[] args){
	Empleado empleado1 = new Empleado();
	empleado1.inicializa();
	empleado1.imprime();
	empleado1.paga_impuestos();
	}
} 