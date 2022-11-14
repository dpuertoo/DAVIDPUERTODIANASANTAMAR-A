package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaCuestionario extends JFrame{

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
		this.texto = new JLabel("Por favor, diligencia el siguiente cuestionario para obtener tus resultados.");
		this.texto.setFont(new Font("Arial", Font.BOLD, 15));
		
		this.siguiente = new JButton("Siguiente");
		this.siguiente.setActionCommand(SIGUIENTE);
		
		add(this.texto, BorderLayout.NORTH);
		add(this.siguiente, BorderLayout.SOUTH);
		add(this.pc, BorderLayout.CENTER);
	}

}
