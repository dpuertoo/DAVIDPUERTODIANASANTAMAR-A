package co.edu.unbosque.view;

import java.awt.Color;
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
		setLayout(null);
		
		this.nombre = new JLabel("Nombre:");
		this.nombre.setFont(new Font("Arial", Font.BOLD, 20));
		this.nombre.setBounds(80, 60, 150, 20);
		
		this.nombreTexto = new JTextField();
		this.nombreTexto.setBounds(170, 55, 150, 30);

		
		this.edad = new JLabel("Edad:");
		this.edad.setFont(new Font("Arial", Font.BOLD, 20));
		this.edad.setBounds(80, 120, 150, 20);
		
		this.edadTexto = new JTextField();
		this.edadTexto.setBounds(170, 115, 150, 30);

		this.sexo = new JLabel("Sexo:");
		this.sexo.setFont(new Font("Arial", Font.BOLD, 20));
		this.sexo.setBounds(80, 180, 150, 20);

		this.lista = new JComboBox();
		this.lista.addItem("Masculino");
		this.lista.addItem("Femenino");
		this.lista.setBackground(Color.GRAY);
		this.lista.setBounds(170, 175, 150, 30);

		add(this.nombre);
		add(this.nombreTexto);
		add(this.edad);
		add(this.edadTexto);
		add(this.sexo);
		add(this.lista);
		
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getEdad() {
		return edad;
	}

	public void setEdad(JLabel edad) {
		this.edad = edad;
	}

	public JLabel getSexo() {
		return sexo;
	}

	public void setSexo(JLabel sexo) {
		this.sexo = sexo;
	}

	public JTextField getNombreTexto() {
		return nombreTexto;
	}

	public void setNombreTexto(JTextField nombreTexto) {
		this.nombreTexto = nombreTexto;
	}

	public JTextField getEdadTexto() {
		return edadTexto;
	}

	public void setEdadTexto(JTextField edadTexto) {
		this.edadTexto = edadTexto;
	}

	public JComboBox getLista() {
		return lista;
	}

	public void setLista(JComboBox lista) {
		this.lista = lista;
	}

}
