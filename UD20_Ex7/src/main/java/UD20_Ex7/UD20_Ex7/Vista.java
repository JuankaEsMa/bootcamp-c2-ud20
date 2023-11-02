package UD20_Ex7.UD20_Ex7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldCantidad;
	private JTextField textFieldResultado;
	JButton btnConvertir;
	
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setBounds(10, 10, 115, 13);
		contentPane.add(lblNewLabel);
		
		textFieldCantidad = new JTextField();
		textFieldCantidad.setBounds(135, 7, 96, 19);
		contentPane.add(textFieldCantidad);
		textFieldCantidad.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(241, 10, 66, 13);
		contentPane.add(lblNewLabel_1);
		
		textFieldResultado = new JTextField();
		textFieldResultado.setBounds(317, 7, 96, 19);
		contentPane.add(textFieldResultado);
		textFieldResultado.setColumns(10);
		textFieldResultado.setEnabled(false);
		
		btnConvertir = new JButton("Convertir a euro");
		btnConvertir.setBounds(69, 69, 147, 21);
		contentPane.add(btnConvertir);
		btnConvertir.addActionListener(a->convertir());
		
		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.setBounds(226, 69, 85, 21);
		contentPane.add(btnCambiar);
		btnCambiar.addActionListener(a->cambiarTexto());

	}
	
	public void cambiarTexto() {
		if(btnConvertir.getText() == "Convertir a euro") {
			btnConvertir.setText("Convertir a pesetas");
		}else {
			btnConvertir.setText("Convertir a euro");
		}
	}
	
	public void convertir() {
		if(textFieldCantidad.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null,"Has de escribir algo en cantidad");
		}else {
			try {
				double cantidad = Double.parseDouble(textFieldCantidad.getText());
				double resultado;
				if(btnConvertir.getText() == "Convertir a euro") {
					resultado = cantidad / 166.386;
				}else {
					resultado = cantidad * 166.386;
				}
				textFieldResultado.setText(String.format("%.2f",resultado));
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "La cantidad ha de ser un número");
			}
				
		}
		
	}

}
