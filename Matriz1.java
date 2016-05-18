// Programa que primer fila, ultima y primer columna
import java.util.Scanner;
public class Matriz1{
	Scanner teclado;
	int mat[][];
	public void inicializar(){
		teclado = new Scanner(System.in);
		mat = new int[3][4];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				System.out.println("Indica el dato de la matriz en posicion "+ "[" + i + "]"+ "[" +j+ "]");
				mat[i][j] = teclado.nextInt();
			}	System.out.println();
		}
	}
	public void imprimir(){
			System.out.println("Primera fila");
			for(int i = 0; i < 1; i++){
				for(int j = 0; j < 4; j++){
					System.out.print(mat[i][j] + " ");
				}		
			}
			System.out.println();
			System.out.println("Ultima fila");
			for(int i = 2; i < 3; i++){
				for(int j = 0; j < 4; j++){
					System.out.print(mat[i][j] + " ");
				}		
			}
			System.out.println();
			System.out.println("Primera columna");
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 1; j++){
					System.out.println(mat[i][j] + " ");
				}		
			}
	}
	
	public static void main (String [] args){
		Matriz1 matriz = new Matriz1();
		matriz.inicializar();
		matriz.imprimir();
	}
		
} 
		
