package co.edu.unbosque.view;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCuestionario extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel nombre;
	private JLabel edad;
	private JLabel sexo;
	private JTextField nombreTexto;
	private JTextField edadTexto;
	private JComboBox lista;
	
	public PanelCuestionario() {
		setLayout(new GridLayout(3, 2));
		
		this.nombre = new JLabel("	Nombre: ");
		this.nombre.setFont(new Font("Arial", Font.BOLD, 20));
		
		this.nombreTexto = new JTextField();
		
		this.edad = new JLabel("	Edad: ");
		this.edad.setFont(new Font("Arial", Font.BOLD, 20));
		
		this.edadTexto = new JTextField();
		
		this.sexo = new JLabel("	Sexo: ");
		this.sexo.setFont(new Font("Arial", Font.BOLD, 20));
		
		this.lista = new JComboBox();
		this.lista.addItem("Masculino");
		this.lista.addItem("Femenino");
		
		add(this.nombre);
		add(this.nombreTexto);
		add(this.edad);
		add(this.edadTexto);
		add(this.sexo);
		add(this.lista);
		
	}

}
