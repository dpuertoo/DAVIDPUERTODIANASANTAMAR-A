package co.edu.unbosque.view;

import co.edu.unbosque.controller.Controller;

public class Gui {
	private VentanaInicio vi;
	private VentanaCuestionario vc;
	private VentanaOpcionMultiple vopc;
	
	public Gui(Controller c) {
		this.vi = new VentanaInicio();
		this.vi.getContinuar().addActionListener(c);
		
		this.vc = new VentanaCuestionario();
		this.vc.getSiguiente().addActionListener(c);
		
		this.vopc = new VentanaOpcionMultiple();
		this.vopc.getCont().addActionListener(c);
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

	public VentanaOpcionMultiple getVopc() {
		return vopc;
	}

	public void setVopc(VentanaOpcionMultiple vopc) {
		this.vopc = vopc;
	}
	
	
	
	
}
