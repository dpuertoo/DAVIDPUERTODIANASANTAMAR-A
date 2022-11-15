package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class VentanaResultados extends JFrame{

	private static final long serialVersionUID = 1L;
	public static final String FINALIZAR = "FINALIZAR";
	private PanelResultados pr;
	private JButton fin;
	
	public VentanaResultados(String pNombre, int pResultado) {
		pr = new PanelResultados(pNombre, pResultado);
		this.pr.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "Resultados", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
		
		this.fin = new JButton("Finalizar");
		this.fin.setActionCommand(FINALIZAR);
		
	}

	public PanelResultados getPr() {
		return pr;
	}

	public void setPr(PanelResultados pr) {
		this.pr = pr;
	}

	public JButton getFin() {
		return fin;
	}

	public void setFin(JButton fin) {
		this.fin = fin;
	}
	
}
