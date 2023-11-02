package UD20_Ex6.UD20_Ex6;

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
	private JTextField textFieldAltura;
	private JTextField textFieldPeso;
	private JTextField textFieldResultado;


	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Altura(m)");
		lblNewLabel.setBounds(40, 28, 60, 13);
		contentPane.add(lblNewLabel);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setBounds(110, 25, 96, 19);
		contentPane.add(textFieldAltura);
		textFieldAltura.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Peso(kg)");
		lblNewLabel_1.setBounds(235, 28, 60, 13);
		contentPane.add(lblNewLabel_1);
		
		textFieldPeso = new JTextField();
		textFieldPeso.setBounds(305, 25, 96, 19);
		contentPane.add(textFieldPeso);
		textFieldPeso.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(121, 90, 85, 21);
		contentPane.add(btnCalcular);
		btnCalcular.addActionListener(a->calcular());
		
		JLabel lblNewLabel_2 = new JLabel("IMC");
		lblNewLabel_2.setBounds(216, 94, 32, 13);
		contentPane.add(lblNewLabel_2);
		
		textFieldResultado = new JTextField();
		textFieldResultado.setEnabled(false);
		textFieldResultado.setBounds(258, 91, 96, 19);
		contentPane.add(textFieldResultado);
		textFieldResultado.setColumns(10);
		
		
	}
	public void calcular() {
		if(textFieldAltura.getText().isEmpty() || textFieldPeso.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Has de completar la altura y el Peso");
		}else {
			try {
				double altura = Double.parseDouble(textFieldAltura.getText());
				double peso = Double.parseDouble(textFieldPeso.getText());
				if(altura == 0) {
					throw new ArithmeticException();
				}
				double imc = peso/(altura*altura);
				System.out.println(altura);
				System.out.println(peso);
				System.out.println(imc);
				textFieldResultado.setText(String.format("%.2f",imc));
			}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "El peso y la altura tienen que ser números");
			}catch(ArithmeticException a) {
				JOptionPane.showMessageDialog(null, "La altura no puede ser 0");
			}
		}
	}
}
