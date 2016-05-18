//recursividad
public class Recursividad {
	static int[] vec = {312 , 614, 88 , 22 , 54};
	public void imprimir(int x){
		if(x > 0) {
			imprimir(x - 1);
			System.out.println(x);
		}
	}
	int factorial (int x){
		if (x > 0){
			int valor = x * factorial(x - 1);
			return valor;
		}else
			return 1;
	}
	void ordenar(int []v , int cant){
		if(cant > 1){
			for(int f = 0; f < cant -1; f++){
				if(v[f] > v[f+1]){
					int aux = v[f];
					v[f] = v[f+1];
					v[f+1] =aux;
				}
				ordenar(v , cant - 1);
			}
		}
	}
	void imprimir2 () {
        for (int f = 0 ; f < vec.length ; f++)
            System.out.print (vec [f] + "  ");
        System.out.println("\n");
    }
	public static void main (String[] args){
		Recursividad prueba = new Recursividad();
		prueba.imprimir(5);
		System.out.println("El factorial de 5 es : "+ prueba.factorial(5));
		prueba.imprimir2();
		prueba.ordenar(vec , vec.length);
		prueba.imprimir2();
	}
}