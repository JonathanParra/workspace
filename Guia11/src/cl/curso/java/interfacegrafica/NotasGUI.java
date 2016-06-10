package cl.curso.java.interfacegrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NotasGUI {

	private JFrame frmNotas;
	private JTextField notas1;
	private JTextField notas2;
	private JTextField notas3;
	private JTextField promedioText;
	private JLabel lblPromedio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotasGUI window = new NotasGUI();
					window.frmNotas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NotasGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNotas = new JFrame();
		frmNotas.setBackground(Color.WHITE);
		frmNotas.getContentPane().setBackground(Color.ORANGE);
		frmNotas.setIconImage(Toolkit.getDefaultToolkit().getImage(NotasGUI.class.getResource("/javax/swing/plaf/metal/icons/Inform.gif")));
		frmNotas.setTitle("Notas");
		frmNotas.setBounds(100, 100, 450, 300);
		frmNotas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNotas.getContentPane().setLayout(null);
		
		JLabel nota1 = new JLabel("Ingrese notas");
		nota1.setBounds(161, 51, 86, 14);
		frmNotas.getContentPane().add(nota1);
		
		notas1 = new JTextField();
		notas1.setBounds(246, 48, 86, 20);
		frmNotas.getContentPane().add(notas1);
		notas1.setColumns(10);
		
		notas2 = new JTextField();
		notas2.setBounds(246, 93, 86, 20);
		frmNotas.getContentPane().add(notas2);
		notas2.setColumns(10);
		
		JLabel nota2 = new JLabel("Ingrese notas 1");
		nota2.setBounds(150, 96, 86, 14);
		frmNotas.getContentPane().add(nota2);
		
		JLabel nota3 = new JLabel("Ingrese notas 2");
		nota3.setBounds(150, 131, 86, 14);
		frmNotas.getContentPane().add(nota3);
		
		notas3 = new JTextField();
		notas3.setBounds(246, 131, 86, 20);
		frmNotas.getContentPane().add(notas3);
		notas3.setColumns(10);
		
		JButton btnNewButton = new JButton("calcular promedio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(nota1.getText());
				System.out.println(nota2.getText());
				System.out.println(nota3.getText());
				int promedio = Integer.parseInt(notas1.getText()) + Integer.parseInt(notas2.getText()) + Integer.parseInt(notas3.getText());
				System.out.println(promedio/3);
				promedioText.setText(""+promedio/3);
			}
		});
		btnNewButton.setBounds(161, 195, 171, 23);
		frmNotas.getContentPane().add(btnNewButton);
		
		promedioText = new JTextField();
		promedioText.setBounds(206, 229, 86, 20);
		frmNotas.getContentPane().add(promedioText);
		promedioText.setColumns(10);
		
		lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(109, 232, 46, 14);
		frmNotas.getContentPane().add(lblPromedio);
	}
}
