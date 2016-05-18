import java.util.Scanner;
public class correo{
	Scanner teclado;
	String correo;
	public correo(){
		teclado = new Scanner(System.in);
		System.out.println("Indica el correo");
		correo = teclado.nextLine();
	}
	public void validar(){
	 char a = '@';
	 int posi = correo.indexOf(a);
	 if(posi == -1)
	 System.out.println("Correo invalido sin @");
	 else
	 System.out.println("Correo valido");
	}

	public static void main (String [] args){
		correo prueba = new correo();
		prueba.validar();
    }
		
	}

		