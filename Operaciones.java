import java.util.Scanner;
public class Operaciones{
		int dato1, dato2;
		public void inicializa(int num1 , int num2){
			this.dato1 = num1;
			this.dato2 = num2;
		}
		public int sum(){
		return dato1 + dato2;
		}
		public int res(){
		return dato1 - dato2;
		}
		public int multi(){
		return dato1 * dato2;
		}
		public float div(){
		if(dato2 == 0)
			return 0;
		else
		return dato1 / dato2;
		}

	public static void main(String[] args){
		int suma, resta,mul,num1,num2;
		float divicion;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indica el numero1");
		num1 = teclado.nextInt();
		System.out.println("Indica segundo numero");
		num2 = teclado.nextInt();
		Operaciones opera = new Operaciones();
		opera.inicializa(num1,num2);
		suma = opera.sum();
		resta = opera.res();
		mul = opera.multi();
		divicion = opera.div();
		System.out.println("La suma es : "+suma);
		System.out.println("La resta es : "+resta);
		System.out.println("La multiplicacion es : "+mul);
		if(divicion ==0)
		System.out.println("No se puede dividir entre cero");
		else
		System.out.println("La divicion es : "+divicion);
	}
} 