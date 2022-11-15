package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.Gui;

public class Controller implements ActionListener {
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
		}if (e.getActionCommand().equals(g.getVopc().CONT)) {
			g.getVc().setVisible(true);
			g.getVc().dispose();
		}if (e.getActionCommand().equals(g.getVr().FINALIZAR)) {
			g.getVi().setVisible(true);
			g.getVr().dispose();
		}

	}

	public void realizarDiagnostico() {
		int edad = Integer.parseInt(g.getVc().getPc().getEdadTexto().getText());
		String nombre = g.getVc().getPc().getNombreTexto().getText();
		String sexo = g.getVc().getPc().getLista().getActionCommand();
		String genetica = "";
		String fuma = "";
		String alcohol = "";
		int cont = 0;

		if (nombre.equals(null) || edad == 0 | sexo.equals(null)) {
			System.out.println("Los campos son obligatorios");
		}

		if (14 < edad && edad < 26) {
			cont += 0.1;
			System.out.println("18");
		} else if (27 < edad && edad < 59) {
			cont += 0.3;
		} else if (60 < edad) {
			cont += 0.6;
		}

		if (sexo.equals("Femenino")) {
			cont += 0.7;
			System.out.println("fem");
		} else if (sexo.equals("Masculino")) {
			cont += 0.3;
		}

		if (genetica.equals("si")) {
			cont += 0.75;
		} else if (genetica.equals("no")) {
			cont += 0.25;
		}
	}
}
