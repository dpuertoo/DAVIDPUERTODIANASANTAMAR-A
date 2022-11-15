package co.edu.unbosque.view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelResultados extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JLabel texto1;
	private JLabel resultado;
	private JLabel texto2;
	
	public PanelResultados(String pNombre, int pResultado) {
		this.texto1 = new JLabel(pNombre + " tienes una probabilidad del: ");
		this.resultado = new JLabel(pResultado + "%");
		this.texto2 = new JLabel(" de contraer Alzheimer en un futuro.");
	}

}
