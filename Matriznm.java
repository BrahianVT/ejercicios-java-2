// Programa que pide matriz filas y columnas para llenar una matriz y luego imprime 
import java.util.Scanner;
public class Matriznm{
	Scanner teclado;
	int mat[][],n,m;
	public void inicializar(){
		teclado = new Scanner(System.in);
		System.out.println("indica las filas ");
		n = teclado.nextInt();
		System.out.println("indica las columnas ");
		m = teclado.nextInt();
		mat = new int[n][m];
			for (int i = 0; i < n; i++){
				System.out.println("Indica los datos ");
				for(int j = 0; j < m; j++){
					mat[i][j] = teclado.nextInt();
				}
			}	
		
	}
	public void imprimir(){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					System.out.print(mat[i][j] + " ");
				}	System.out.println();	
			}
			System.out.println("La ultima fila es:");
			for(int j = 0; j < m; j++){
				System.out.print(mat[mat.length-1][j] + " ");
			}
	}
	
	public static void main (String [] args){
		Matriznm matriz = new Matriznm();
		matriz.inicializar();
		matriz.imprimir();
	}
		
} 
		
