package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class ConsultaChamadoUI extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaChamadoUI frame = new ConsultaChamadoUI();
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
	public ConsultaChamadoUI() {
		setTitle("Consulta Chamado");
		setBounds(100, 100, 450, 300);

	}

}
