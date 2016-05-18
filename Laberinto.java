//recorrer laberinto
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Laberinto extends JFrame implements ActionListener{
	JLabel l[][];
	JButton b1 ,b2;
	boolean salida;
	Laberinto(){
		setLayout(null);
		l = new JLabel[10][10];
		for(int j = 0; j < 10; j++){
			for(int i = 0; i < 10; i++){
				l[j][i] = new JLabel();
				l[j][i].setBounds(20 + i*20 , 50 + j*20,20,20);
				add(l[j][i]);
			}
		}
		b1 = new JButton("Recorrer");
		b1.setBounds(10,300,100,25);
		add(b1);
		b1.addActionListener(this);
		b2 = new JButton("Iniciar");
		b2.setBounds(120,300,100,25);
		add(b2);
		b2.addActionListener(this);
		crear();	
	}
	void crear(){
		for(int j = 0; j < 10; j++){
			for(int i = 0; i < 10; i++){
				int a = (int)(Math.random()*4);
				l[j][i].setForeground(Color.black);
				if(a == 0)
					l[j][i].setText("1");
				else
					l[j][i].setText("0");
			}
		}
	l[9][9].setText("S");
	l[0][0].setText("0");
	}
	void recorrer(int filas ,int colum){
		if(filas >= 0 && filas < 10 && colum >= 0 && colum < 10 && salida ==false){
			if(l[filas][colum].getText().equals("s"))
				salida = true;
			else
				if(l[filas][colum].getText().equals("0")){
				l[filas][colum].setText("9");
				l[filas][colum].setForeground(Color.red);
				recorrer(filas , colum + 1);
				recorrer(filas + 1 , colum);
				recorrer(filas, colum - 1);
				recorrer(filas - 1 , colum);
		}
	}
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == b1){
			salida = false;
			recorrer(0,0);
			if(salida)
				setTitle("tiene salida");
			else	
			setTitle("no tiene salida");
				
		}
		if (e.getSource()==b2)
            crear();
	}
	public static void main (String[] args){
		Laberinto lab = new Laberinto();
		lab.setBounds(0,0,300,400);
		lab.setVisible(true);
		lab.setTitle("laberinto");
		lab.setDefaultCloseOperation(lab.EXIT_ON_CLOSE);
	}
}