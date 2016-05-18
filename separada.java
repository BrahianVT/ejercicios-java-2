import java.util.Scanner;
public class separada{
	Scanner teclado;
	String oracion;
	public separada(){
		teclado = new Scanner(System.in);
		System.out.println("Indica el correo");
		oracion = teclado.nextLine();
	}
	public void separar(){
	 int espacio = 0;
	 for(int i = 0; i< oracion.length(); i++ ){
	 char carac1 = oracion.charAt(i);
	 if(carac1 ==' ')
		espacio++;
	 }
	 String palabras[] ;
	 palabras = new String[espacio + 1];  int a = 0, cont =0;
	 if (espacio == 0)
		palabras[cont] = oracion;
		else{
			for(int i = 0; i< oracion.length(); i++ ){
				char carac2 = oracion.charAt(i);
				if(carac2 ==' '){
				String aux = oracion.substring(a,i);
				a = i;
				palabras[cont] = aux;
				cont++;
				}
			palabras[cont] = oracion.substring(a,i+1);
			}
		}
	 for(int i = 0; i < espacio+1; i++)
	 System.out.println(palabras[i]);
	
	}

	public static void main (String [] args){
		separada prueba = new separada();
		prueba.separar();
    }
		
	}

		