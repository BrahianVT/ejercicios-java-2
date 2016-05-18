
import java.util.Scanner;
public class Constructor{
	private Scanner teclado;
	private float sueldos[];
	private int n;
	public Constructor(){
		teclado = new Scanner(System.in);
		System.out.println("Indica cuantos sueldos");
		n = teclado.nextInt();
		sueldos = new float[n];
		for(int i = 0; i < sueldos.length; i++){
			System.out.println("Indique el sueldo " + (i+1));
			sueldos[i] = teclado.nextFloat();
		}
		
	}

	public void imprimir(){
		
		for(int i = 0; i < sueldos.length; i++)
			System.out.println(sueldos[i]);
					
	}
		

 
	
	public static void main (String [] args){
	 Constructor prueba = new Constructor();
	 prueba.imprimir();
	}
		
} 
		
