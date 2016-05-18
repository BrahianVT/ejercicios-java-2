// Imprime el nombre de lapersona con mayor salario 
import java.util.Scanner;
public class Mayvec{
	Scanner teclado;
	int salarios[][],sal_total[],n ,m = 3;
	String nombre[];
	public void inicializar(){
		teclado = new Scanner(System.in);
		System.out.println("indica numero de persona analizar ");
		n = teclado.nextInt();
		nombre = new String[n];
		salarios = new int[n][m];
		sal_total = new int[n];
		int aux = 0; 
		for (int i = 0; i < n; i++){
					System.out.println("Indica el nombre :"+(i+1));
					nombre[i] = teclado.next();
				for(int j = 0; j < m; j++){
					System.out.println("Indica el sueldo :"+(j+1));
					salarios[i][j] = teclado.nextInt();
					aux = aux + salarios[i][j];
				}
			sal_total[i] = aux / 3;
			aux = 0;
			}	
		
	}

	public void imprimir(){
			
		}
	
	public static void main (String [] args){
	 Mayvec prueba = new Mayvec();
	 prueba.inicializar();
	}
		
} 
		
