package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class VentanaOpcionMultiple extends JFrame{

	private static final long serialVersionUID = 1L;
	public static final String CONT = "CONT";
	
	private JLabel uno;
	private JLabel dos;
	private JLabel tres;
	private JLabel cuatro;
	private JLabel cinco;
	private JLabel seis;
	private JLabel prg1;
	private JLabel prg2;
	private JLabel prg3;
	private JLabel prg4;
	private JLabel prg5;
	private JLabel prg6;
	private JRadioButton si1;
	private JRadioButton si2;
	private JRadioButton si3;
	private JRadioButton si4;
	private JRadioButton si5;
	private JRadioButton si6;
	private JRadioButton no1;
	private JRadioButton no2;
	private JRadioButton no3;
	private JRadioButton no4;
	private JRadioButton no5;
	private JRadioButton no6;
	private ButtonGroup grupo1;
	private ButtonGroup grupo2;
	private ButtonGroup grupo3;
	private ButtonGroup grupo4;
	private ButtonGroup grupo5;
	private ButtonGroup grupo6;
	private JButton cont;
	
	public VentanaOpcionMultiple() {
		setSize(400, 400);
		setTitle("Cuestionario");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		
		this.uno = new JLabel("1");
		this.prg1 = new JLabel("¿Alguno de sus familiares cercanos ha tenido Alzheimer?");
		this.si1 = new JRadioButton("Si", false);
		this.no1 = new JRadioButton("No", false);
		this.grupo1 = new ButtonGroup();
		this.grupo1.add(this.si1);
		this.grupo1.add(this.no1);
		
		this.dos = new JLabel("2");
		this.prg2 = new JLabel("¿Consume frecuentementre bebidas alcoholicas?");
		this.si2 = new JRadioButton("Si", false);
		this.no2 = new JRadioButton("No", false);
		this.grupo2 = new ButtonGroup();
		this.grupo2.add(this.si2);
		this.grupo2.add(this.no2);
		
		this.tres = new JLabel("3");
		this.prg3 = new JLabel("¿Presenta problemas para dormir o permanecer dormid@?");
		this.si3 = new JRadioButton("Si", false);
		this.no3 = new JRadioButton("No", false);
		this.grupo3 = new ButtonGroup();
		this.grupo3.add(this.si3);
		this.grupo3.add(this.no3);
		
		this.cuatro = new JLabel("4");
		this.prg4 = new JLabel("¿Realiza ejercicio fisico con frecuencia?");
		this.si4 = new JRadioButton("Si", false);
		this.no4 = new JRadioButton("No", false);
		this.grupo4 = new ButtonGroup();
		this.grupo4.add(this.si4);
		this.grupo4.add(this.no4);
		
		this.cinco = new JLabel("5");
		this.prg5 = new JLabel("¿Consume frecuentementre bebidas alcoholicas?");
		this.si5 = new JRadioButton("Si", false);
		this.no5 = new JRadioButton("No", false);
		this.grupo5 = new ButtonGroup();
		this.grupo5.add(this.si5);
		this.grupo5.add(this.no5);
		
		this.seis = new JLabel("6");
		this.prg6 = new JLabel("¿Presenta cambios de animo o de conducta frecuentes?");
		this.si6 = new JRadioButton("Si", false);
		this.no6 = new JRadioButton("No", false);
		this.grupo6 = new ButtonGroup();
		this.grupo6.add(this.si6);
		this.grupo6.add(this.no6);
		
		this.cont = new JButton("Continuar");
		this.cont.setActionCommand(CONT);
		
	}

	public JLabel getUno() {
		return uno;
	}

	public void setUno(JLabel uno) {
		this.uno = uno;
	}

	public JLabel getDos() {
		return dos;
	}

	public void setDos(JLabel dos) {
		this.dos = dos;
	}

	public JLabel getTres() {
		return tres;
	}

	public void setTres(JLabel tres) {
		this.tres = tres;
	}

	public JLabel getCuatro() {
		return cuatro;
	}

	public void setCuatro(JLabel cuatro) {
		this.cuatro = cuatro;
	}

	public JLabel getCinco() {
		return cinco;
	}

	public void setCinco(JLabel cinco) {
		this.cinco = cinco;
	}

	public JLabel getSeis() {
		return seis;
	}

	public void setSeis(JLabel seis) {
		this.seis = seis;
	}

	public JLabel getPrg1() {
		return prg1;
	}

	public void setPrg1(JLabel prg1) {
		this.prg1 = prg1;
	}

	public JLabel getPrg2() {
		return prg2;
	}

	public void setPrg2(JLabel prg2) {
		this.prg2 = prg2;
	}

	public JLabel getPrg3() {
		return prg3;
	}

	public void setPrg3(JLabel prg3) {
		this.prg3 = prg3;
	}

	public JLabel getPrg4() {
		return prg4;
	}

	public void setPrg4(JLabel prg4) {
		this.prg4 = prg4;
	}

	public JLabel getPrg5() {
		return prg5;
	}

	public void setPrg5(JLabel prg5) {
		this.prg5 = prg5;
	}

	public JLabel getPrg6() {
		return prg6;
	}

	public void setPrg6(JLabel prg6) {
		this.prg6 = prg6;
	}

	public JRadioButton getSi1() {
		return si1;
	}

	public void setSi1(JRadioButton si1) {
		this.si1 = si1;
	}

	public JRadioButton getSi2() {
		return si2;
	}

	public void setSi2(JRadioButton si2) {
		this.si2 = si2;
	}

	public JRadioButton getSi3() {
		return si3;
	}

	public void setSi3(JRadioButton si3) {
		this.si3 = si3;
	}

	public JRadioButton getSi4() {
		return si4;
	}

	public void setSi4(JRadioButton si4) {
		this.si4 = si4;
	}

	public JRadioButton getSi5() {
		return si5;
	}

	public void setSi5(JRadioButton si5) {
		this.si5 = si5;
	}

	public JRadioButton getSi6() {
		return si6;
	}

	public void setSi6(JRadioButton si6) {
		this.si6 = si6;
	}

	public JRadioButton getNo1() {
		return no1;
	}

	public void setNo1(JRadioButton no1) {
		this.no1 = no1;
	}

	public JRadioButton getNo2() {
		return no2;
	}

	public void setNo2(JRadioButton no2) {
		this.no2 = no2;
	}

	public JRadioButton getNo3() {
		return no3;
	}

	public void setNo3(JRadioButton no3) {
		this.no3 = no3;
	}

	public JRadioButton getNo4() {
		return no4;
	}

	public void setNo4(JRadioButton no4) {
		this.no4 = no4;
	}

	public JRadioButton getNo5() {
		return no5;
	}

	public void setNo5(JRadioButton no5) {
		this.no5 = no5;
	}

	public JRadioButton getNo6() {
		return no6;
	}

	public void setNo6(JRadioButton no6) {
		this.no6 = no6;
	}

	public ButtonGroup getGrupo1() {
		return grupo1;
	}

	public void setGrupo1(ButtonGroup grupo1) {
		this.grupo1 = grupo1;
	}

	public ButtonGroup getGrupo2() {
		return grupo2;
	}

	public void setGrupo2(ButtonGroup grupo2) {
		this.grupo2 = grupo2;
	}

	public ButtonGroup getGrupo3() {
		return grupo3;
	}

	public void setGrupo3(ButtonGroup grupo3) {
		this.grupo3 = grupo3;
	}

	public ButtonGroup getGrupo4() {
		return grupo4;
	}

	public void setGrupo4(ButtonGroup grupo4) {
		this.grupo4 = grupo4;
	}

	public ButtonGroup getGrupo5() {
		return grupo5;
	}

	public void setGrupo5(ButtonGroup grupo5) {
		this.grupo5 = grupo5;
	}

	public ButtonGroup getGrupo6() {
		return grupo6;
	}

	public void setGrupo6(ButtonGroup grupo6) {
		this.grupo6 = grupo6;
	}

	public JButton getCont() {
		return cont;
	}

	public void setCont(JButton cont) {
		this.cont = cont;
	}
}
