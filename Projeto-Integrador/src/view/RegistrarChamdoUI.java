package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;

import Controller.ColaboradoresController;
import Controller.VeiculosController;
import Modelo.Colaboradores;
import Modelo.Veiculos;

import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrarChamdoUI extends JInternalFrame {
	private JTextField txtCpf;
	private JTextField txtPlaca;
	private JTable table;
JComboBox<Colaboradores> cbColaboradores = new JComboBox();
JComboBox<Veiculos> cbVeiculo = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarChamdoUI frame = new RegistrarChamdoUI();
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
	public RegistrarChamdoUI() {
		setTitle("Registrar Chamdo");
		setBounds(100, 100, 712, 403);
		
		DefaultComboBoxModel<Colaboradores> modelColaboradores = new DefaultComboBoxModel<Colaboradores>();
		for(Colaboradores colaboradores : new ColaboradoresController().listar()) {
			modelColaboradores.addElement(colaboradores);
		}
		cbColaboradores.setModel(modelColaboradores);
		
		DefaultComboBoxModel<Veiculos> modelVeiculos = new DefaultComboBoxModel<Veiculo>();
		for(Veiculos veiculos : new VeiculosController().listar()) {
			modelVeiculos.addElement(veiculos);
		}
		cbVeiculos.setModel(modelVeiculos);
			
		
		JButton btnColaborador = new JButton("Colaborador:"); 	
		btnColaborador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton jbtnVeiculo = new JButton("Veiculo:");
				
		JButton jbtnCpf = new JButton("Cpf:");
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		
		JButton jbtnPlaca = new JButton("Placa:");
		jbtnPlaca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		txtPlaca = new JTextField();
		txtPlaca.setColumns(10);
		
		JButton jbtnAdicionar = new JButton("Adicionar");
		jbtnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		table = new JTable();
		
		JButton jbtnCancelar = new JButton("New button");
		
		JButton jbtnSalvar = new JButton("Salvar");
		jbtnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(jbtnSalvar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jbtnCancelar))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(btnColaborador)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(cbColaboradores, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(jbtnVeiculo)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(cbVeiculo, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(jbtnCpf)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(jbtnPlaca)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(jbtnAdicionar))))
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnColaborador)
						.addComponent(cbColaboradores, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jbtnCpf)
						.addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jbtnVeiculo)
						.addComponent(cbVeiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jbtnPlaca)
						.addComponent(txtPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jbtnAdicionar))
					.addGap(32)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jbtnCancelar)
						.addComponent(jbtnSalvar))
					.addGap(24))
		);
		getContentPane().setLayout(groupLayout);

	}

}
