package UD20_Ex3.UD20_Ex3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int contadorBoton1 = 0;
	int contadorBoton2 = 0;
	
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Boton 1: ");
		lblNewLabel.setBounds(107, 10, 55, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblContador1 = new JLabel("0");
		lblContador1.setBounds(172, 10, 45, 13);
		contentPane.add(lblContador1);
		
		JLabel lblNewLabel_2 = new JLabel("Botón 2:");
		lblNewLabel_2.setBounds(205, 10, 55, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblContador2 = new JLabel("0");
		lblContador2.setBounds(270, 10, 45, 13);
		contentPane.add(lblContador2);
		
		JButton btn1 = new JButton("Botón 1");
		btn1.setBounds(120, 61, 85, 21);
		contentPane.add(btn1);
		
		JButton  btn2 = new JButton("Botón 2");
		btn2.setBounds(220, 61, 85, 21);
		contentPane.add(btn2);
		
		ActionListener btnListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btn1) {
					contadorBoton1++;
				}else {
					contadorBoton2++;
				}
				lblContador1.setText(contadorBoton1+"");
				lblContador2.setText(contadorBoton2+"");
			}
			
		};
		btn1.addActionListener(btnListener);
		btn2.addActionListener(btnListener);
	}
	

}
