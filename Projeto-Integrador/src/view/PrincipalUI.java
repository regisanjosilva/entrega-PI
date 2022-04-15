package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalUI frame = new PrincipalUI();
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
	public PrincipalUI() {
		setFont(new Font("Times New Roman", Font.BOLD, 14));
		setBackground(new Color(0, 0, 0));
		setTitle("Pegada De Carbono");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar jbPrincipal = new JMenuBar();
		setJMenuBar(jbPrincipal);
		
		JMenu jmnCadastro = new JMenu("Cadastro");
		jbPrincipal.add(jmnCadastro);
		
		JMenuItem jntnColaboradores = new JMenuItem("Colaboradores");
		jntnColaboradores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroColaboradoresUI cadColaboradores = new CadastroColaboradoresUI();
				cadColaboradores.setVisible(true);
				contentPane.add(cadColaboradores, 0);
				
				
			}
		});
		jmnCadastro.add(jntnColaboradores);
		
		JMenuItem jntnVeiculo = new JMenuItem("Veiculo");
		jntnVeiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroVeiculoUI cadVeiculo = new CadastroVeiculoUI();
				cadVeiculo.setVisible(true);
				contentPane.add(cadVeiculo, 0);
				
				
			}
		});
		jmnCadastro.add(jntnVeiculo);
		
		JMenu jmnConsulta = new JMenu("Consulta");
		jbPrincipal.add(jmnConsulta);
		
		JMenuItem jntColaboradores = new JMenuItem("Colaboradores");
		jntColaboradores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaColaboradoresUI consultaColabUI = new ConsultaColaboradoresUI();
				consultaColabUI.setVisible(true);
				contentPane.add(consultaColabUI, 0);
				
			}
		});
		jmnConsulta.add(jntColaboradores);
		
		JMenuItem jntmVeiculo = new JMenuItem("Veiculo");
		jmnConsulta.add(jntmVeiculo);
		
		JMenu jmnChamado = new JMenu("Chamado");
		jbPrincipal.add(jmnChamado);
		
		JMenuItem jntmRegistrarChamado = new JMenuItem("Registrar Chamado");
		jmnChamado.add(jntmRegistrarChamado);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
