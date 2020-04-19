package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewPrimeiraTela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrimeiraTela frame = new ViewPrimeiraTela();
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
	public ViewPrimeiraTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAcao = new JButton("Acao");
		btnAcao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null,"Nome: "+txtNome.getText());
				
			}
		});
		btnAcao.setBounds(165, 133, 97, 25);
		contentPane.add(btnAcao);
		
		txtNome = new JTextField();
		txtNome.setBounds(155, 98, 116, 22);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(87, 101, 56, 16);
		contentPane.add(lblNome);
	}
}
