import java.util.Scanner;
public class Verposma{
		Scanner teclado;
		int salarios[];
		String nombres[];
		public void inicializar(){
			teclado = new Scanner (System.in);
			salarios = new int[3];
			nombres = new String[3];
			for(int i = 0; i < 3; i++){
				if(i >0){
				teclado.nextLine();}
				System.out.println("Indica tu nombre");
				nombres[i] = teclado.next();
				System.out.println("Indica el salario");
				salarios[i] = teclado.nextInt();				
			}
		}
		public void mayor_salario(){
			int aux = salarios[0],j=0;
			for(int i = 0; i < nombres.length-1; i++){
				if(aux < salarios[i+1])
					aux = salarios[i+1];
			}
			for(int i = 0; i < nombres.length; i++){ if(aux == salarios[i])j=i;}
			System.out.println("La persona con mayor sueldo es " +nombres[j]+ " con " +aux);
		}
	
		
	public static void main(String[] args){
		Verposma prueba = new Verposma();
		prueba.inicializar();
		prueba.mayor_salario();
	}
		
} 