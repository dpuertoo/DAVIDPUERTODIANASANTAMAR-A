package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaInicio extends JFrame{

	private static final long serialVersionUID = 1L;
	public static final String CONTINUAR = "CONTINUAR";
	private JLabel portada;
	private JButton continuar;
	
	public VentanaInicio() {
		setSize(400, 400);
		setTitle("Inicio");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.WHITE);
		
		setLayout(new BorderLayout());
		this.portada = new JLabel();
		this.portada.setSize(395, 395);
		this.portada.setFont(new Font("Arial", Font.BOLD, 20));
		insertarImagen(this.portada, "src/data/portada.png");
		this.portada.setBackground(Color.WHITE);
		
		this.continuar = new JButton("Continuar");
		this.continuar.setActionCommand(this.CONTINUAR);
		
		
		add(this.portada, BorderLayout.CENTER);
		add(this.continuar, BorderLayout.SOUTH);

	}
	
	public void insertarImagen(JLabel pLabel, String url) {
		ImageIcon imagen = new ImageIcon(url);
		Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(pLabel.getWidth(), pLabel.getHeight(), Image.SCALE_DEFAULT));
		pLabel.setIcon(icono);
		pLabel.repaint();
	}

	public JLabel getPortada() {
		return portada;
	}

	public void setPortada(JLabel portada) {
		this.portada = portada;
	}

	public JButton getContinuar() {
		return continuar;
	}

	public void setContinuar(JButton continuar) {
		this.continuar = continuar;
	}
	
	
	
	
}
