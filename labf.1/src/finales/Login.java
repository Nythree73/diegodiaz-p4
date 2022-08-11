package finales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField usuariotf;
	private JPasswordField contrase�apf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel titulo = new JLabel("LOGIN");
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		titulo.setBounds(192, 11, 86, 42);
		frame.getContentPane().add(titulo);
		
		JLabel usuario = new JLabel("Usuario");
		usuario.setBounds(34, 78, 46, 14);
		frame.getContentPane().add(usuario);
		
		JLabel contrase�a = new JLabel("Contrase\u00F1a");
		contrase�a.setBounds(34, 121, 76, 14);
		frame.getContentPane().add(contrase�a);
		
		usuariotf = new JTextField();
		usuariotf.setBounds(120, 75, 234, 20);
		frame.getContentPane().add(usuariotf);
		usuariotf.setColumns(10);
		
		JButton botonentrar = new JButton("Entrar");
		botonentrar.setBounds(120, 166, 111, 23);
		botonentrar.setFocusable(false);
		frame.getContentPane().add(botonentrar);
		
		
		JButton botonregistrarse = new JButton("Registrarse");
		botonregistrarse.setFocusable(false);
		botonregistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonregistrarse.setBounds(243, 166, 111, 23);
		frame.getContentPane().add(botonregistrarse);
		
		contrase�apf = new JPasswordField();
		contrase�apf.setBounds(120, 118, 234, 20);
		frame.getContentPane().add(contrase�apf);
	}
}
