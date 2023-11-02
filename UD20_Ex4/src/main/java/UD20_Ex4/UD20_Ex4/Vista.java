package UD20_Ex4.UD20_Ex4;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextArea lblNewLabel_1;

	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		panel.setBounds(65, 10, 345, 230);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_1 = new JTextArea("");
		lblNewLabel_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(0, 0, 345, 230);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Eventos");
		lblNewLabel.setBounds(10, 114, 45, 13);
		contentPane.add(lblNewLabel);
		
		addWindowListener(new WindowListener(){

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				lblNewLabel_1.append("Ventana abierta \n");
			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				lblNewLabel_1.setText(lblNewLabel_1.getText()+"Ventana cerrandose \n");

			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				lblNewLabel_1.setText(lblNewLabel_1.getText()+"Ventana Cerrada \n");

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				lblNewLabel_1.setText(lblNewLabel_1.getText()+"Ventana Minimizada \n");

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				lblNewLabel_1.setText(lblNewLabel_1.getText()+"Ventana Desminimizada \n");

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				lblNewLabel_1.setText(lblNewLabel_1.getText()+"Ventana Activada " + "\n");

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				lblNewLabel_1.setText(lblNewLabel_1.getText()+"Ventana Desactivada \n");

			}
			
		});

	}
}
