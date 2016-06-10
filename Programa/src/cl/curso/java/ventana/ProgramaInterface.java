package cl.curso.java.ventana;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ProgramaInterface {

	public static void main(String[] args) {
		JFrame ventana=new JFrame();
		JLabel label=new JLabel("Hola mundo");
		ventana.setSize(400, 400);
		ventana.getContentPane().add(label);
		ventana.setVisible(true);
		Ventana nueva=new Ventana();
	}

}
