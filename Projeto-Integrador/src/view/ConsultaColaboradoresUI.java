package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import Controller.ColaboradoresController;
import Modelo.Colaboradores;
import view.tebles.ColaboradoresTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaColaboradoresUI extends JInternalFrame {
	private JTable jtColaboradores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaColaboradoresUI frame = new ConsultaColaboradoresUI();
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
	public ConsultaColaboradoresUI() {
		setClosable(true);
		setTitle("Consulta Colaboradores");
		setBounds(100, 100, 455, 247);
		
		JButton jbtnCancelar = new JButton("Cancelar");
		jbtnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JButton jbtnExcluir = new JButton("Excluir");
		jbtnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Colaboradores colaboradores = new ColaboradoresTableModel(new ColaboradoresController().listar()).get(jtColaboradores.getSelectedRow());
                try {
				new ColaboradoresController().excluir(colaboradores.getId());
				JOptionPane.showMessageDialog(null, "Colaborador Excluido");
				JOptionPane.showMessageDialog(new ColaboradoresTableModel(new ColaboradoresController().listar()));
                } catch (Exception e1) {
                	JOptionPane.showMessageDialog(null, "Erro ao Excluir colaborador");
                }
                
			}
			
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton jtbnEditar = new JButton("Editar");
		jtbnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Colaboradores colaboradores = new ColaboradoresTableMode(new colaboradoresControlooer().listar()).get(jtColaboradores.getSelectedRow());
				CadastroColaboradoresUI cadColaboradoresUI = new CadastroColaboradoresUI();
				cadColaboradoresUI.setColaboradoresEdicao(colaboradores);
				cadColaboradoresUI.setVisible(true);
				getParent().add(cadColaboradoresUI, 0);
				
			}
		});
		
		JButton jtbnAtualizar = new JButton("Atualizar Dados");
		jtbnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtColaboradores.setModel(new ColaboradoresTableModel(new ColaboradoresController().listar());
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(102, Short.MAX_VALUE)
					.addComponent(jtbnAtualizar)
					.addGap(18)
					.addComponent(jtbnEditar)
					.addGap(18)
					.addComponent(jbtnExcluir)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jbtnCancelar)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 422, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(36, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jbtnCancelar)
						.addComponent(jbtnExcluir)
						.addComponent(jtbnEditar)
						.addComponent(jtbnAtualizar))
					.addGap(27))
		);
		
		jtColaboradores = new JTable();
		jtColaboradores.setModel(new ColaboradoresTableModel(new ColaboradoresController()));
		scrollPane.setViewportView(jtColaboradores);
		getContentPane().setLayout(groupLayout);

	}
	
			
	}

