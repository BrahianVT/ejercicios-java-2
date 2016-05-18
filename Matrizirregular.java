// Imprime el pais de lapersona con mayor salario 
import java.util.Scanner;
public class Matrizirregular{
	Scanner teclado;
	int n ,m = 3;
	int mat_irreg[][];
	public void inicializar(){
		int subm;
		teclado = new Scanner(System.in);
		System.out.println("Indica cuantas filas");
		n = teclado.nextInt();
		mat_irreg = new int[n][];
		
		for(int i = 0; i < mat_irreg.length; i++){
			System.out.println("Indique cuantos componentes tiene la fila " + (i+1));
			subm = teclado.nextInt();
			mat_irreg[i] = new int[subm];
			for(int j = 0; j < mat_irreg[i].length; j++){
				System.out.println("Indique el componente " + (j+1));
				mat_irreg[i][j] = teclado.nextInt();
			}
		}
		
	}

	public void imprimir(){
		for(int i = 0; i < mat_irreg.length; i++){
			for(int j = 0; j < mat_irreg[i].length; j++){
				System.out.print(mat_irreg[i][j] + " ");
			}System.out.println();
		}
	
		}
	
 
	
	public static void main (String [] args){
	 Matrizirregular prueba = new Matrizirregular();
	 prueba.inicializar();
	 prueba.imprimir();
	}
		
} 
		
