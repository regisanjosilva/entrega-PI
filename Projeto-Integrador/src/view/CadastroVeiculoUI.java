package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;

import Controller.ColaboradoresController;
import Controller.VeiculosController;
import Modelo.Colaboradores;
import Modelo.Veiculos;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroVeiculoUI extends JInternalFrame {
	private JTextField txtPlaca;
	private JTextField txtModelo;
	private JTextField txtAno;
	private JTextField txtCor;
	private JTextField txtKmPorLitro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroVeiculoUI frame = new CadastroVeiculoUI();
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
	public CadastroVeiculoUI() {
		setTitle("Cadastro Veiculo");
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Veiculo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setClosable(true);
		setBounds(100, 100, 450, 321);
		
		JPanel jpVeiculo = new JPanel();
		jpVeiculo.setBorder(new TitledBorder(null, "Veiculo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton jbtnCancelar = new JButton("Cancelar");
		jbtnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JButton JbtnSalvar = new JButton("Salvar");
		JbtnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {	
					Veiculos veiculo = new Veiculos();
					veiculo.setPlaca(txtPlaca.getText());
					veiculo.setModelo(txtModelo.getText());
					veiculo.setAno(txtAno.getText());
					veiculo.setCor(txtCor.getText());
					veiculo.setKmPorLitro(txtKmPorLitro.getText());
					
		
					
					new VeiculosController().salvar(veiculo);
					JOptionPane.showMessageDialog(null, " Veiculo Salvo");
					dispose();
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro ao Salvar Veiculo");
				}
				}
			
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpVeiculo, GroupLayout.PREFERRED_SIZE, 418, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(204, Short.MAX_VALUE)
					.addComponent(JbtnSalvar)
					.addGap(34)
					.addComponent(jbtnCancelar)
					.addGap(22))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpVeiculo, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jbtnCancelar)
						.addComponent(JbtnSalvar))
					.addContainerGap())
		);
		
		JLabel jlbPlaca = new JLabel("Placa");
		
		JLabel jlbModelo = new JLabel("Modelo");
		
		JLabel jlbAno = new JLabel("Ano");
		
		JLabel jlbCor = new JLabel("Cor");
		
		JLabel jlbKmPorLitro = new JLabel("KmPorLitro");
		
		txtPlaca = new JTextField();
		txtPlaca.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		
		txtAno = new JTextField();
		txtAno.setColumns(10);
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		
		txtKmPorLitro = new JTextField();
		txtKmPorLitro.setColumns(10);
		GroupLayout gl_jpVeiculo = new GroupLayout(jpVeiculo);
		gl_jpVeiculo.setHorizontalGroup(
			gl_jpVeiculo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpVeiculo.createSequentialGroup()
					.addGroup(gl_jpVeiculo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpVeiculo.createSequentialGroup()
							.addComponent(jlbPlaca)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpVeiculo.createSequentialGroup()
							.addComponent(jlbModelo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpVeiculo.createSequentialGroup()
							.addComponent(jlbAno)
							.addGap(18)
							.addComponent(txtAno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpVeiculo.createSequentialGroup()
							.addComponent(jlbCor)
							.addGap(18)
							.addComponent(txtCor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpVeiculo.createSequentialGroup()
							.addComponent(jlbKmPorLitro)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtKmPorLitro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(255, Short.MAX_VALUE))
		);
		gl_jpVeiculo.setVerticalGroup(
			gl_jpVeiculo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpVeiculo.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpVeiculo.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlbPlaca)
						.addComponent(txtPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpVeiculo.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlbModelo)
						.addComponent(txtModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpVeiculo.createParallelGroup(Alignment.TRAILING)
						.addComponent(jlbAno)
						.addComponent(txtAno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_jpVeiculo.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlbCor)
						.addComponent(txtCor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_jpVeiculo.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlbKmPorLitro)
						.addComponent(txtKmPorLitro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		jpVeiculo.setLayout(gl_jpVeiculo);
		getContentPane().setLayout(groupLayout);

	}
}
