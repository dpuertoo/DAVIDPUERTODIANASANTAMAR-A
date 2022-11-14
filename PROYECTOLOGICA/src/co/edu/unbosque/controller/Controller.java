package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.Gui;

	public class Controller implements ActionListener{
	private Gui g;

	public Controller() {
		this.g = new Gui(this);
		g.getVi().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(g.getVi().CONTINUAR)) {
			g.getVc().setVisible(true);
			g.getVi().dispose();
		}if (e.getActionCommand().equals(g.getVc().SIGUIENTE)) {
			g.getVopc().setVisible(true);
			g.getVc().dispose();
		}
		
	}
}
