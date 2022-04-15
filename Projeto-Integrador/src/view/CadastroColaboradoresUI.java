package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;

import Controller.ColaboradoresController;
import Modelo.Colaboradores;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroColaboradoresUI extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtDataNasc;
	private JTextField txtHabilitado;
	private Colaboradores colaboradores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					CadastroColaboradoresUI frame = new CadastroColaboradoresUI();
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
	public CadastroColaboradoresUI() {
		
		
		setTitle("Cadastro De Colaboradores");
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JPanel jpcolaboradores = new JPanel();
		jpcolaboradores.setBorder(new TitledBorder(null, "Colaboradores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton jbtnCancelar = new JButton("Cancelar");
		jbtnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JButton jbtnSalvar = new JButton("Salvar");
		jbtnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if(colaboradores != null && colaboradores.getId() >0 ) {
						colaboradores.setNome(txtNome.getName());
						colaboradores.setCpf(txtCpf.getCpf());
						colaboradores.setDataNasc(null);
						colaboradores.setHabilitado(txtHabilitado.getText());
						new ColaboradoresController().atualizar(colaboradores);
						JOptionPane.showMessageDialog(null, " Colaborador Atualizado");
					} else {
				Colaboradores colaboradores = new Colaboradores();
				colaboradores.setNome(txtNome.getText());
				colaboradores.setCpf(txtCpf.getText());
				colaboradores.setDataNasc(null);
				colaboradores.setHabilitado(txtHabilitado.getText());
				
				new ColaboradoresController().salvar(colaboradores);
				
				JOptionPane.showMessageDialog(null, " Colaborador Salvo");
				dispose(); 
				 catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Erro ao Salvar Colaborador");
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(jpcolaboradores, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(210, Short.MAX_VALUE)
					.addComponent(jbtnSalvar)
					.addGap(29)
					.addComponent(jbtnCancelar)
					.addGap(24))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(jpcolaboradores, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jbtnCancelar)
						.addComponent(jbtnSalvar))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		
		JButton jbtnNome = new JButton("Nome:");
		
		JButton jbtnCpf = new JButton("Cpf:");
		
		JButton JbtnDataNasc = new JButton("DataNasc");
		
		JButton jbtnHabilitado = new JButton("Habilitado:");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		
		txtDataNasc = new JTextField();
		txtDataNasc.setColumns(10);
		
		txtHabilitado = new JTextField();
		txtHabilitado.setColumns(10);
		GroupLayout gl_jpcolaboradores = new GroupLayout(jpcolaboradores);
		gl_jpcolaboradores.setHorizontalGroup(
			gl_jpcolaboradores.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpcolaboradores.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpcolaboradores.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpcolaboradores.createSequentialGroup()
							.addComponent(jbtnNome)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpcolaboradores.createSequentialGroup()
							.addComponent(jbtnCpf)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpcolaboradores.createSequentialGroup()
							.addComponent(JbtnDataNasc)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtDataNasc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpcolaboradores.createSequentialGroup()
							.addComponent(jbtnHabilitado)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtHabilitado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(218, Short.MAX_VALUE))
		);
		gl_jpcolaboradores.setVerticalGroup(
			gl_jpcolaboradores.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpcolaboradores.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpcolaboradores.createParallelGroup(Alignment.BASELINE)
						.addComponent(jbtnNome)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpcolaboradores.createParallelGroup(Alignment.BASELINE)
						.addComponent(jbtnCpf)
						.addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpcolaboradores.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpcolaboradores.createSequentialGroup()
							.addComponent(JbtnDataNasc)
							.addGap(18)
							.addGroup(gl_jpcolaboradores.createParallelGroup(Alignment.BASELINE)
								.addComponent(jbtnHabilitado)
								.addComponent(txtHabilitado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(txtDataNasc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(91, Short.MAX_VALUE))
		);
		jpcolaboradores.setLayout(gl_jpcolaboradores);
		getContentPane().setLayout(groupLayout);

	
	public void setColaboradoresEdicao( Colaboradores colaboradores) {


		this.colaboradores = colaboradores;
		preencheFormulario();
		
	}
	
	private void preencheFormulario() {
		if (colaboradores != null) {
			txtNome.setText(colaboradores.getNome());
			txtCpf.setText(colaboradores.getCpf());
			txtDataNasc.setText(colaboradores.getDataNasc().toString());
			txtHabilitado.setText(colaboradores.getHabilitado());
			
			
		}
	}
	}
}
}