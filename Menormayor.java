import java.util.Scanner;
public class Menormayor{
	public void obtener_valores(){
		Scanner tecla = new Scanner(System.in);
		int val1, val2, val3;
		System.out.println("Indica el primer dato");
		val1 = tecla.nextInt();
		System.out.println("Indica el segundo dato");
		val2 = tecla.nextInt();
		System.out.println("Indica el tercer dato");
		val3 = tecla.nextInt();
		int menor, mayor;
		menor = encontrar_menor(val1,val2,val3);
		mayor = encontrar_mayor(val1,val2,val3);
		System.out.println("El valor menor es: "+menor);
		System.out.println("El valor mayor es: "+mayor);
	}
	public int encontrar_menor(int v1, int v2, int v3){
	if(v1 < v2 && v1 < v3)
		return v1;
	else{
		if(v2 < v3)
			return v2;
		else
			return v3;
		}
	}
	
	public int encontrar_mayor(int v1, int v2, int v3){
		if(v1 > v2 && v1 > v3)
			return v1;
		else{
			if(v2 > v3)
				return v2;
			else
				return v3;
		}
	}
	
		
	public static void main(String[] args){
		Menormayor encontrar = new Menormayor();
		encontrar.obtener_valores();
	}
		
} 