package cl.java.DB;

//framework ORM estudiarlo.***

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

public class login {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField;
	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * @param frame the frame to set
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * @return the textField_1
	 */
	public JTextField getTextField_1() {
		return textField_1;
	}

	/**
	 * @param textField_1 the textField_1 to set
	 */
	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	/**
	 * @return the textField
	 */
	public JTextField getTextField() {
		return textField;
	}

	/**
	 * @param textField the textField to set
	 */
	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Showcard Gothic", Font.PLAIN, 19));
		frame.setBounds(100, 100, 343, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 198, 157, 28);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(86, 279, 157, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblBellako = new JLabel("Usuario");
		lblBellako.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBellako.setBounds(86, 180, 74, 14);
		frame.getContentPane().add(lblBellako);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(86, 258, 68, 14);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnLogin.setBounds(113, 350, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblBllako = new JLabel("B3LLako$");
		lblBllako.setFont(new Font("Colonna MT", Font.BOLD, 38));
		lblBllako.setBounds(79, 79, 169, 59);
		frame.getContentPane().add(lblBllako);
		
		JButton btnRegistrar = new JButton("registro");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnRegistrar.setBounds(113, 384, 89, 23);
		frame.getContentPane().add(btnRegistrar);
	}
}
