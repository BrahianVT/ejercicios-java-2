import java.util.Scanner;
public class Matriz{
	Scanner teclado;
	int mat[][];
	public void inicializar(){
		teclado = new Scanner(System.in);
		mat = new int[3][5];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 5; j++){
				System.out.println("Indica el dato de la matriz en posicion "+ "[" + i + "]"+ "[" +j+ "]");
				mat[i][j] = teclado.nextInt();
			}	System.out.println();
		}
	}
	public void imprimir(){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 5; j++){
				System.out.print(" "+mat[i][j]);
			}	System.out.println();
		}
	
	}
	
	public static void main (String [] args){
		Matriz matriz = new Matriz();
		matriz.inicializar();
		matriz.imprimir();
	}
		
} 
		
