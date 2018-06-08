import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

public class FormularioResultado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioResultado frame = new FormularioResultado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormularioResultado() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FormularioResultado.class.getResource("/imagens/icons8-help-80.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResultados = new JLabel("Resultados");
		lblResultados.setForeground(Color.WHITE);
		lblResultados.setBackground(Color.BLACK);
		lblResultados.setBounds(10, 11, 75, 14);
		contentPane.add(lblResultados);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 35, 414, 153);
		contentPane.add(scrollPane);
		
		JButton btnVoltarMenu = new JButton("Voltar Menu");
		btnVoltarMenu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVoltarMenu.setForeground(Color.WHITE);
		btnVoltarMenu.setBackground(Color.BLACK);
		btnVoltarMenu.setBounds(161, 199, 117, 51);
		contentPane.add(btnVoltarMenu);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.BLACK);
		label.setBounds(0, 0, 434, 261);
		contentPane.add(label);
		label.setOpaque(true);
	}
}
