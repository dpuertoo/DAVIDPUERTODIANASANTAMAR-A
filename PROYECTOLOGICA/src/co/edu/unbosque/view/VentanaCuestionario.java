package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaCuestionario extends JFrame {

	private static final long serialVersionUID = 1L;
	public static final String SIGUIENTE = "SIGUIENTE";
	private JLabel texto;
	private JButton siguiente;
	private PanelCuestionario pc;

	public VentanaCuestionario() {
		this.pc = new PanelCuestionario();

		setSize(400, 400);
		setTitle("Cuestionario");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setBackground(Color.WHITE);
		setLocationRelativeTo(null);

		setLayout(new BorderLayout());
		this.texto = new JLabel("Por favor, diligencia el siguiente cuestionario.");
		this.texto.setFont(new Font("Arial", Font.BOLD, 15));
		this.texto.setBounds(38, 10, 325, 20);

		this.siguiente = new JButton("Siguiente");
		this.siguiente.setActionCommand(SIGUIENTE);

		add(this.texto);
		add(this.siguiente, BorderLayout.SOUTH);
		add(this.pc, BorderLayout.CENTER);
	}

	public JLabel getTexto() {
		return texto;
	}

	public void setTexto(JLabel texto) {
		this.texto = texto;
	}

	public JButton getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(JButton siguiente) {
		this.siguiente = siguiente;
	}

	public PanelCuestionario getPc() {
		return pc;
	}

	public void setPc(PanelCuestionario pc) {
		this.pc = pc;
	}

	public static String getSIGUIENTE() {
		return SIGUIENTE;
	}

}
