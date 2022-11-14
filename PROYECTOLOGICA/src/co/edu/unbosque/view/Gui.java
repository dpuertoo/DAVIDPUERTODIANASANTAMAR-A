package co.edu.unbosque.view;

import co.edu.unbosque.controller.Controller;

public class Gui {
	private VentanaInicio vi;
	private VentanaCuestionario vc;
	
	public Gui(Controller c) {
		this.vi = new VentanaInicio();
		this.vi.getContinuar().addActionListener(c);
		
		this.vc = new VentanaCuestionario();
//		this.vi.get
	}

	public VentanaInicio getVi() {
		return vi;
	}

	public void setVi(VentanaInicio vi) {
		this.vi = vi;
	}

	public VentanaCuestionario getVc() {
		return vc;
	}

	public void setVc(VentanaCuestionario vc) {
		this.vc = vc;
	}
	
	
}
