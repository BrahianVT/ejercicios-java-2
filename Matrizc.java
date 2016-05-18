// Programa que pide matriz de 2*5 y la llena solo por columna
import java.util.Scanner;
public class Matrizc{
	Scanner teclado;
	int mat[][];
	public void inicializar(){
		teclado = new Scanner(System.in);
		mat = new int[2][5];
			for (int i = 0; i < 5; i++){
				System.out.println("indica los datos de la columna "+(i+1));
				for(int j = 0; j < 2; j++){
					mat[j][i] = teclado.nextInt();
				}
			}	
		
	}
	public void imprimir(){
			for(int i = 0; i < 2; i++){
				for(int j = 0; j < 5; j++){
					System.out.print(mat[i][j] + " ");
				}	System.out.println();	
			}
			
	}
	
	public static void main (String [] args){
		Matrizc matriz = new Matrizc();
		matriz.inicializar();
		matriz.imprimir();
	}
		
} 
		
