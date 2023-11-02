package UD20_Ex2.UD20_Ex2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblBotonPulsado;
	public Vista() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblBotonPulsado = new JLabel("");
		lblBotonPulsado.setBounds(30, 10, 140, 20);
		contentPane.add(lblBotonPulsado);
		
		ActionListener btnPulsado = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				lblBotonPulsado.setText("Has pulsado el " + btn.getText());
			}
			
		};
		
		JButton btn1 = new JButton("Button 1");
		btn1.setBounds(180, 10, 85, 25);
		contentPane.add(btn1);
		btn1.addActionListener(btnPulsado);
		
		JButton btn2 = new JButton("Button 2");
		btn2.setBounds(275, 10, 85, 25);
		contentPane.add(btn2);
		btn2.addActionListener(btnPulsado);

	}

}
