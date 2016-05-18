import java.util.Scanner;
public class Matriz_prin{
	Scanner teclado;
	int mat[][];
	public void inicializar(){
		teclado = new Scanner(System.in);
		mat = new int[4][4];
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				System.out.println("Indica el dato de la matriz en posicion "+ "[" + i + "]"+ "[" +j+ "]");
				mat[i][j] = teclado.nextInt();
			}	System.out.println();
		}
	}
	public void imprimir(){
			for(int j = 0; j < 4; j++){
				System.out.print(mat[j][j] + " ");
			}	System.out.println();
	}
	
	public static void main (String [] args){
		Matriz_prin matriz = new Matriz_prin();
		matriz.inicializar();
		matriz.imprimir();
	}
		
} 
		
