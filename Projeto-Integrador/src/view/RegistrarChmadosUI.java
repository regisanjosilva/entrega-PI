package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class RegistrarChmadosUI extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarChmadosUI frame = new RegistrarChmadosUI();
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
	public RegistrarChmadosUI() {
		setBounds(100, 100, 450, 300);

	}

}
