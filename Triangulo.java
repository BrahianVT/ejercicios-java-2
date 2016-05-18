import java.util.Scanner;
//clase
public class Triangulo{
	//atributos
	private Scanner teclado;
	private int lado1, lado2, lado3;
	//metodos
	public void inicializar(){
		teclado = new Scanner(System.in);
		System.out.println("Ingresa el lado1");
		lado1 = teclado.nextInt();
		System.out.println("Ingresa el lado2");
		lado2 = teclado.nextInt();
		System.out.println("Ingresa el lado3");
		lado3 = teclado.nextInt();
		}
	public void imprimir_lado_mayor(){
		if (lado1 > lado2 && lado1>lado3)
			System.out.println("El lado mayor es :"+lado1);
		else{
			if(lado2 > lado3){
				System.out.println("El lado mayor es :"+lado2);
			}
			else
				System.out.println("El lado mayor es :"+lado3);
		}
	}
	public void es_isoceles(){
		if (lado1 == lado2 && lado1 == lado3)
			System.out.println("Es isoceles");
		else
			System.out.println("No es isoceles");
	}
	 

	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo();
		triangulo.inicializar();
		triangulo.imprimir_lado_mayor();
		triangulo.es_isoceles();
	}
}