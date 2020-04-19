package tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Checkbox;
import java.awt.Label;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JTextPane;
import javax.swing.Box;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import java.awt.Canvas;
import java.awt.Panel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;

public class Form extends JFrame {

	private JPanel contentPane;
	private JTextField txtPaciente;
	private JTextField txtTel;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	
	private double total;
	private double novoTotal;
	private boolean ativado;
	private boolean sus;
	private boolean privado2;
	private double total3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
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
	public Form() {
		setTitle("Hospital");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 881, 564);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(UIManager.getBorder("TextPane.border"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblHospitalNossaSenhora = new JLabel("HOSPITAL NOSSA SENHORA DA LAPA");
		lblHospitalNossaSenhora.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblHospitalNossaSenhora.setBounds(217, 54, 438, 22);
		contentPane.add(lblHospitalNossaSenhora);
		

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 2), "Forma de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_4.setBounds(424, 216, 383, 212);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 2), "Forma de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_5.setBounds(12, 69, 349, 57);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JRadioButton rdbtnVista = new JRadioButton("\u00E0 vista");
		rdbtnVista.setBounds(19, 23, 82, 25);
		panel_5.add(rdbtnVista);
		rdbtnVista.setEnabled(false);
		buttonGroup_2.add(rdbtnVista);
		
		
		JLabel lblTotalFormaPG = new JLabel("");
		lblTotalFormaPG.setBounds(234, 32, 82, 16);
		panel_5.add(lblTotalFormaPG);
		rdbtnVista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnVista.isSelected()) {
					novoTotal = total-(total*0.15);
					lblTotalFormaPG.setText(""+novoTotal);
				}
			}
		});
		
		
		JRadioButton rdbtnPrazo = new JRadioButton("\u00E0 prazo");
		rdbtnPrazo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPrazo.isSelected()) {
					novoTotal = total+(total*0.15);
					lblTotalFormaPG.setText(""+novoTotal);
				}
			}
		});
		rdbtnPrazo.setBounds(132, 23, 82, 25);
		panel_5.add(rdbtnPrazo);
		rdbtnPrazo.setEnabled(false);
		buttonGroup_2.add(rdbtnPrazo);
		
		
		
		JLabel lblTotalServ = new JLabel("");
		lblTotalServ.setBounds(215, 36, 56, 16);
		panel_4.add(lblTotalServ);
		
		JLabel lblNewLabel = new JLabel("Paciente");
		lblNewLabel.setBounds(71, 136, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(71, 184, 56, 16);
		contentPane.add(lblTelefone);
		
		txtPaciente = new JTextField();
		txtPaciente.setBounds(162, 133, 394, 22);
		contentPane.add(txtPaciente);
		txtPaciente.setColumns(10);
		
		txtTel = new JTextField();
		txtTel.setColumns(10);
		txtTel.setBounds(162, 181, 394, 22);
		contentPane.add(txtTel);
		
		JRadioButton privado = new JRadioButton("Privado");
		buttonGroup.add(privado);
		privado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(privado.isSelected()) {
					rdbtnVista.setEnabled(false);
					rdbtnPrazo.setEnabled(false);
					privado2 = true;
				}
			}
		});
		privado.setBounds(278, 250, 82, 25);
		contentPane.add(privado);
		
		JLabel lblnternacao = new JLabel("R$510,00");
		lblnternacao.setVisible(false);
		lblnternacao.setBounds(224, 355, 56, 16);
		contentPane.add(lblnternacao);
		
		JCheckBox ckbInternacao = new JCheckBox("Interna\u00E7\u00E3o");
		ckbInternacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ckbInternacao.isSelected()) {
					lblnternacao.setVisible(true);
					total += 510;
				}else {
					lblnternacao.setVisible(false);
					total -= 510;
				}
				lblTotalServ.setText(""+total);
			}
		});
		ckbInternacao.setBounds(51, 351, 113, 25);
		contentPane.add(ckbInternacao);
		

		JLabel lblExames = new JLabel("R$150,00");
		lblExames.setVisible(false);
		lblExames.setBounds(227, 384, 56, 16);
		contentPane.add(lblExames);
		
		JCheckBox ckbExames = new JCheckBox("Exames Laboratoriais");
		ckbExames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ckbExames.isSelected()) {
					lblExames.setVisible(true);
					total += 150;
				}else {
					lblExames.setVisible(false);
					total -= 150;
				}
				lblTotalServ.setText(""+total);
			}
		});
		ckbExames.setBounds(51, 380, 170, 25);
		contentPane.add(ckbExames);
		
		JLabel lblCobrarDoGovernoplano = new JLabel("Cobrar do Governo/Plano de Saude");
		lblCobrarDoGovernoplano.setBounds(468, 382, 202, 21);
		contentPane.add(lblCobrarDoGovernoplano);
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar");
		lblTotalAPagar.setBounds(468, 351, 90, 18);
		contentPane.add(lblTotalAPagar);
		
		JLabel lblConsulta = new JLabel("R$75,00");
		lblConsulta.setVisible(false);
		lblConsulta.setBounds(227, 325, 68, 16);
		contentPane.add(lblConsulta);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Form.class.getResource("/imagens/HOSPITAL.PNG")));
		lblNewLabel_1.setBounds(51, 26, 63, 57);
		contentPane.add(lblNewLabel_1);
		
		
		
		
		JLabel lblTotPagar = new JLabel("");
		lblTotPagar.setBounds(715, 389, 56, 16);
		contentPane.add(lblTotPagar);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon(Form.class.getResource("/imagens/HOSPITAL.PNG")));
		label.setBounds(678, 26, 63, 57);
		contentPane.add(label);
		
		JLabel lblTotalPagar = new JLabel("");
		lblTotalPagar.setBounds(705, 384, 56, 16);
		contentPane.add(lblTotalPagar);
			
		
	
		
		
		JRadioButton radioSUS = new JRadioButton("SUS");
		buttonGroup.add(radioSUS);
		radioSUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnVista.setEnabled(false);
				rdbtnPrazo.setEnabled(false);
				sus = true;
			}
		});
		radioSUS.setBounds(71, 250, 53, 25);
		contentPane.add(radioSUS);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(193, 139, 56, 16);
		panel_4.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(255, 183, 56, 16);
		panel_4.add(label_2);
		
		JButton btnNewButton_1 = new JButton("Calcular - Alt+a");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ativado == true) {
					label_1.setText(""+novoTotal); 
				}
				if(sus == true) {
					label_1.setText("");
					total3 = (total*0.075)+total;
					label_2.setText(""+total3);
				}
				if(privado2 == true) {
					label_1.setText("");
					total3 = (total*0.375)+total;
					label_2.setText(""+total3);
				}
				
				lblTotalServ.setText("");
				
			}
		});
		btnNewButton_1.setMnemonic('A');
		btnNewButton_1.setBounds(240, 453, 143, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Calculadora - Alt+c");
		btnNewButton_2.setMnemonic('C');
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Runtime.getRuntime().exec("calc.exe");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBounds(437, 453, 174, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Encerrar - Alt + e");
		btnNewButton_3.setMnemonic('E');
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(664, 453, 143, 25);
		contentPane.add(btnNewButton_3);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 3), "Dados do Paciente", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel.setBounds(43, 93, 661, 123);
		contentPane.add(panel);
		
		
		
		
		
		
		
		//Verificar
		JRadioButton particular = new JRadioButton("Particular");
		buttonGroup.add(particular);
		particular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(particular.isSelected()) {	
					rdbtnVista.setEnabled(true);
					rdbtnPrazo.setEnabled(true);
					ativado = true;
				}else {
					ativado = false;
				}
			}
		});
		particular.setBounds(161, 250, 83, 25);
		contentPane.add(particular);
		
		
		
		
		
		JCheckBox ckbConsulta = new JCheckBox("Consulta");
		ckbConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ckbConsulta.isSelected()) {
					lblConsulta.setVisible(true);
					total += 75;
					
				}else {
					lblConsulta.setVisible(false);
					total -= 75;
				}
				lblTotalServ.setText(""+total);
			}
		});
		ckbConsulta.addMouseListener(new MouseAdapter() {
		});
		ckbConsulta.setBounds(51, 321, 113, 25);
		contentPane.add(ckbConsulta);
	
		
		
		
		JButton btnNewButton = new JButton("Limpar - Alt+L");
		btnNewButton.setMnemonic('L');
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPaciente.setText("");
				txtTel.setText(" ");
				radioSUS.setSelected(false);
				particular.setSelected(false);
				privado.setSelected(false);
				ckbConsulta.setSelected(false);
				ckbInternacao.setSelected(false);
				ckbExames.setSelected(false);
				particular.setSelected(false);
			}
		});
		btnNewButton.setBounds(51, 453, 143, 25);
		contentPane.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 3), "Plano de Saude", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_1.setBounds(51, 229, 340, 57);
		contentPane.add(panel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 2), "Opera\u00E7oes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_3.setBounds(25, 435, 811, 69);
		contentPane.add(panel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 2), "Servi\u00E7os", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_2.setBounds(42, 305, 318, 123);
		contentPane.add(panel_2);
		

		
		
		
		
		
		
		
		JLabel lblValorTotalDe = new JLabel("Valor total de Servi\u00E7os: ");
		lblValorTotalDe.setBounds(48, 31, 143, 21);
		panel_4.add(lblValorTotalDe);
		
		JLabel lblTotalAPagar_1 = new JLabel("Total a pagar:");
		lblTotalAPagar_1.setBounds(22, 139, 97, 16);
		panel_4.add(lblTotalAPagar_1);
		
		JLabel lblCobrarDoGovernoplano_1 = new JLabel("Cobrar do Governo/Plano");
		lblCobrarDoGovernoplano_1.setBounds(22, 183, 159, 16);
		panel_4.add(lblCobrarDoGovernoplano_1);
		
	
		
		
		
	}
}

