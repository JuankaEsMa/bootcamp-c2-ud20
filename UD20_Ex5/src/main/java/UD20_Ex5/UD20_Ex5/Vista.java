package UD20_Ex5.UD20_Ex5;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextArea textArea;
	
	public Vista() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.setBounds(167, 10, 85, 21);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(a->clear());
		
		textArea = new JTextArea();
		textArea.setBounds(10, 41, 416, 212);
		contentPane.add(textArea);
		
		addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				textArea.append("Ratón ha clickado la ventana \n");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				textArea.append("Ratón ha presionado la ventana \n");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				textArea.append("Ratón ha soltado la ventana \n");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				textArea.append("Ratón entró en la ventana\n");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				textArea.append("Ratón salió de la ventana \n");
			}
			
		});
		repaint();
	}
	
	public void clear() {
		textArea.setText("");
	}
}
