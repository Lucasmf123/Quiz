import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Toolkit;

public class FormularioPerguntaP extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioPerguntaP frame = new FormularioPerguntaP();
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
	public FormularioPerguntaP() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FormularioPerguntaP.class.getResource("/imagens/icons8-help-80.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setForeground(Color.WHITE);
		label.setBackground(Color.BLACK);
		label.setBounds(10, 11, 414, 45);
		contentPane.add(label);
		label.setOpaque(true);
		setVisible(true);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(10, 84, 185, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(10, 125, 185, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_2.setBounds(10, 167, 185, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_3.setBounds(10, 210, 185, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JButton btnPular = new JButton("Pular!");
		btnPular.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPular.setForeground(Color.WHITE);
		btnPular.setBackground(Color.BLACK);
		btnPular.setBounds(236, 114, 89, 23);
		contentPane.add(btnPular);
		
		JButton btnAjuda = new JButton("Ajuda!");
		btnAjuda.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAjuda.setForeground(Color.WHITE);
		btnAjuda.setBackground(Color.BLACK);
		btnAjuda.setBounds(236, 152, 89, 23);
		contentPane.add(btnAjuda);
		
		JButton btnConferir = new JButton("Conferir!");
		btnConferir.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnConferir.setForeground(Color.WHITE);
		btnConferir.setBackground(Color.BLACK);
		btnConferir.setBounds(335, 114, 89, 59);
		contentPane.add(btnConferir);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}
}
