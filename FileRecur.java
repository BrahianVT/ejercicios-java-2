//recorrer archivo con recursividad
import java.io.File;
import java.io.IOException;
public class FileRecur {
	
	void leer (String inicio, String altura){
		File ar = new File(inicio);
		String [] dir = ar.list();
		for(int i = 0; i < dir.length; i++){
			File ar2 = new File(inicio + dir[i]);
			if(ar2.isFile())
				System.out.println(altura + dir[i]);
			if(ar2.isDirectory()){
				System.out.println(altura +" Diccionario:" + dir[i].toUpperCase());
				leer(inicio+dir[i]+"\\", altura+"   "); 
			}
		}
	}
	public static void main (String[] args) throws IOException{
		FileRecur rec = new FileRecur();
		rec.leer("d:\\windows\\","");
			
	}
}