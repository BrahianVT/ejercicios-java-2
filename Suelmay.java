// Imprime el nombre de lapersona con mayor salario 
import java.util.Scanner;
public class Suelmay{
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
					System.out.println("Indica el nombre "+(i+1));
					nombre[i] = teclado.next();
				for(int j = 0; j < m; j++){
					System.out.println("Indica el sueldo "+(j+1));
					salarios[i][j] = teclado.nextInt();
					aux = aux + salarios[i][j];
				}
			sal_total[i] = aux ;
			aux = 0;
			System.out.println("-------------------");
			}	
		
	}

	public void imprimir(){
	System.out.println("Nombres     Salarios     Total");
			for (int k = 0; k < n; k++){
				System.out.print(nombre[k]+ "     ");
				for(int j = 0; j < m; j++){
					System.out.print(salarios[k][j] + " ");
				}
			System.out.println("     " +sal_total[k]);
			}
		}
	public void mayor_salario(){
		int aux2 = sal_total[0],i2 = 0;
		for(int i = 0; i < n-1; i++){
			if(aux2 < sal_total[i+1]){
				aux2 = sal_total[i+1];	
				i2 = i+1;
			}
		}
	System.out.println("La persona que gana mas es "+nombre[i2]); 
	}
	public static void main (String [] args){
	 Suelmay prueba = new Suelmay();
	 prueba.inicializar();
	 prueba.imprimir();
	 prueba.mayor_salario();
	}
		
} 
		
