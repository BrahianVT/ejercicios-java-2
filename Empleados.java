//Confeccionar una clase para administrar los días que han faltado los 3 empleados de una empresa.
//Definir un vector de 3 elementos de tipo String para cargar los nombres y una matriz irregular para cargar los días que han faltado cada empleado (cargar el número de día que faltó)
//Cada fila de la matriz representan los días de cada empleado.
//Mostrar los empleados con la cantidad de inasistencias.
//Cuál empleado faltó menos días.
import java.util.Scanner;
public class Empleados{
	Scanner teclado;
	int n ,m = 3;
	String dias[][], nombre[];
	public void inicializar(){
		int subm;
		teclado = new Scanner(System.in);
		System.out.println("Indica cuantos trabajadores");
		n = teclado.nextInt();
		dias = new String[n][];
		nombre = new String[n];
		for(int i = 0; i < dias.length; i++){
			System.out.println("Indica el nombre");
			nombre[i] = teclado.next();
			System.out.println("Indique cuantos dias han faltado " + nombre[i]);
			subm = teclado.nextInt();
			dias[i] = new String[subm];
			for(int j = 0; j < dias[i].length; j++){
				System.out.println("Indique el dia faltado " + (j+1));
				dias[i][j] = teclado.next();
			}
		}
		
	}

	public void imprimir(){
		System.out.println("Tabla de inasistencias ");
		System.out.println("");
		for(int i = 0; i < dias.length; i++){
			System.out.print(nombre[i]+ "  ");
			for(int j = 0; j < dias[i].length; j++){
				System.out.print(dias[i][j] + " ");
			}System.out.println();
		}
	
		}

	public void menos_inasistencias(){
		int aux = dias[0].length,j2=0;
		for(int i = 0; i < dias.length-1; i++){
			if(aux > dias[i+1].length)
			j2 = i;
			}
		
		System.out.print("Quien a faltado menos es:"+ nombre[j2]);
	}
 
	
	public static void main (String [] args){
	 Empleados prueba = new Empleados();
	 prueba.inicializar();
	 prueba.imprimir();
	 prueba.menos_inasistencias();
	}
		
} 
		
