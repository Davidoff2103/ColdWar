//David Blanco, Sergi Pifarré y Daniel Romero
package proyecto;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.text.NumberFormatter;

import proyecto.Jugadores.Imagen;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JTextArea;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.Cursor;

public class PanelDecisionAD extends JPanel implements ActionListener {
	private JLabel elegir;
	private JLabel explicacion;
	private JLabel misilesA;
	private JLabel objetivo;
	private JLabel misilesD;

	private JButton atacar;
	private JButton defender;
	private JButton continuar;

	public static JComboBox objetivoMisiles;

	public static JSpinner cantidadA;
	public static JSpinner cantidadD;

	private Imagen imagen;
	private Imagen visor;
	
	private JLabel ronda;
	private JLabel vidas;
	
	//************************************************************************************
	//** Nombre del método: PanelDecisionAD
	//** Explicación de lo que hace el método: constructor para el panel donde cada
	//** jugador elige lo que quiere hacer.
	//** Parámetros de entrada: -
	//** Parámetros de salida: -
	//************************************************************************************
	public PanelDecisionAD() {
		this.setPreferredSize(new Dimension(1280, 720));
		this.setMinimumSize(new Dimension(1280, 720));
		this.setOpaque(false);
		objetivoMisiles = new JComboBox();
		objetivoMisiles.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		objetivoMisiles.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		objetivoMisiles.setBounds(246, 428, 149, 25);

		elegir = new JLabel();
		elegir.setBounds(276, 237, 352, 25);
		elegir.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		elegir.setText(Partida.equipos.get(Partida.i).getNombre_equipo() + ", elige lo que quieras hacer.");
		elegir.setForeground(Color.black);

		explicacion = new JLabel();
		explicacion.setBounds(172, 475, 469, 73);
		explicacion.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		explicacion.setHorizontalAlignment(SwingConstants.CENTER);
		explicacion.setText("<html><div style='text-align: center;'>Este jugador, al tener a "
				+ Partida.desplegables2.get(Partida.i)
				+ " como compañero,<br/>tiene un total de " + Partida.equipos.get(Partida.i).getMisiles_x_ronda()
				+ " misiles,<br/>sabiendo que los de defensa cuestan el doble.</html>");
		explicacion.setForeground(Color.black);

		ronda = new JLabel();
		ronda.setBounds(289, 143, 199, 49);
		ronda.setFont(new Font("Bahnschrift", Font.PLAIN, 40));
		ronda.setHorizontalAlignment(SwingConstants.CENTER);
		ronda.setText("Ronda "+Partida.ronda);
		ronda.setForeground(Color.black);
		
		vidas = new JLabel();
		vidas.setBounds(314, 273, 169, 25);
		vidas.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		vidas.setHorizontalAlignment(SwingConstants.CENTER);
		vidas.setText("Tienes "+Partida.equipos.get(Partida.i).getVidas()+" vidas.");
		vidas.setForeground(Color.black);
		add(ronda);
		add(vidas);
		objetivoMisiles.addItem("Seleccionar");

		for (int j = 0; j < Partida.equipos.size(); j++) {
			if (Partida.equipos.get(j).getNombre_equipo() != Partida.equipos.get(Partida.i).getNombre_equipo()) {
				objetivoMisiles.addItem(Partida.equipos.get(j).getNombre_equipo());
			}
		}

		atacar = new JButton("");
		atacar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		atacar.setBounds(246, 320, 149, 61);
		atacar.setIcon(new ImageIcon(PanelDecisionAD.class.getResource("/imagenes/atacar.png")));
		atacar.setContentAreaFilled(false);
		atacar.setBorder(null);
		atacar.setFocusable(false);

		defender = new JButton("");
		defender.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		defender.setBounds(400, 320, 149, 61);
		defender.setIcon(new ImageIcon(PanelDecisionAD.class.getResource("/imagenes/defender.png")));
		defender.setContentAreaFilled(false);
		defender.setBorder(null);
		defender.setFocusable(false);

		continuar = new JButton("");
		continuar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		continuar.setBounds(303, 559, 169, 73);
		continuar.setIcon(new ImageIcon(PanelDecisionAD.class.getResource("/imagenes/continuar.png")));
		continuar.setContentAreaFilled(false);
		continuar.setBorder(null);
		continuar.setFocusable(false);

		cantidadA = new JSpinner();
		JFormattedTextField txt = ((JSpinner.NumberEditor) cantidadA.getEditor()).getTextField();
		((NumberFormatter) txt.getFormatter()).setAllowsInvalid(false);
		
		cantidadA.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		cantidadA.setBounds(246, 387, 149, 25);
		
		cantidadD = new JSpinner();
		JFormattedTextField txt2 = ((JSpinner.NumberEditor) cantidadD.getEditor()).getTextField();
		((NumberFormatter) txt2.getFormatter()).setAllowsInvalid(false);
		
		cantidadD.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		cantidadD.setBounds(405, 387, 144, 25);

		JTextArea text = new JTextArea();
		text.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
		text.setOpaque(false);
		JScrollPane js = new JScrollPane(text);
		js.setBounds(30, 22, 237, 61);
		js.setOpaque(false);
		js.getViewport().setOpaque(false);
		js.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		text.setForeground(Color.white);
		text.setEditable(false);
        text.setHighlighter(null);
        
		visor = new Imagen();
		visor.picture = "/imagenes/visor.png";
		visor.setSize(305,100);
		visor.setLocation(20,5);
		
		misilesA = new JLabel("Misiles de ataque");
		misilesA.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		misilesA.setBounds(140, 392, 108, 14);
		add(misilesA);
		
		misilesD = new JLabel("Misiles de defensa");
		misilesD.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		misilesD.setBounds(559, 394, 108, 14);
		add(misilesD);
		
		objetivo = new JLabel("Objetivo");
		objetivo.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		objetivo.setBounds(195, 434, 46, 14);
		add(objetivo);
		
		cantidadA.addChangeListener(null);
		cantidadD.addChangeListener(null);

		atacar.addActionListener(this);
		defender.addActionListener(this);
		continuar.addActionListener(this);

		imagen = Jugadores.imagenes.get(Partida.i);
		imagen.setBounds(170, 200, 100, 100);
		
		add(imagen);

			
		
		for (int j = 0; j < Partida.equipos.size(); j++) {
			if (Partida.equipos.get(j).getNombre_equipo() != Partida.equipos.get(Partida.i).getNombre_equipo()) {
				text.append(Partida.equipos.get(j).getNombre_equipo()+" tiene "+String.valueOf(Partida.equipos.get(j).getVidas())+" vidas.\n");
			}
		}
		setLayout(null);
		add(objetivoMisiles);
		add(atacar);
		add(cantidadA);
		add(defender);
		add(cantidadD);
		add(js);
		add(elegir);
		add(continuar);
		add(explicacion);
		add(visor);
		
		objetivoMisiles.setVisible(false);
		cantidadA.setVisible(false);
		cantidadD.setVisible(false);
		misilesA.setVisible(false);
		objetivo.setVisible(false);
		misilesD.setVisible(false);

	}

	//************************************************************************************
	//** Nombre del método: actionPerformed
	//** Explicación de lo que hace el método: para detectar la pulsación en los botones
	//** Parámetros de entrada: ActionEvent e
	//** Parámetros de salida: -
	//************************************************************************************
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == atacar) {
			objetivoMisiles.setVisible(true);
			cantidadA.setVisible(true);
			misilesA.setVisible(true);
			objetivo.setVisible(true);
			JFrame m = (JFrame) SwingUtilities.getWindowAncestor(this);
			m.setVisible(true);
		}
		if (e.getSource() == defender) {
			cantidadD.setVisible(true);
			misilesD.setVisible(true);
			JFrame m = (JFrame) SwingUtilities.getWindowAncestor(this);
			m.setVisible(true);
		}
		if (e.getSource() == continuar) {
			try {
				cantidadA.commitEdit();
				cantidadD.commitEdit();

			} catch (ParseException e1) {
				int value1 = (Integer) cantidadA.getValue();
				int value2 = (Integer) cantidadD.getValue();
			}
			if (comprobarMisiles()) {
				if ((Partida.i + 1) < Partida.equipos.size()) {
					Partida.equipos.get(Partida.i).atacar();
					Partida.equipos.get(Partida.i).setAtacar(objetivoMisiles.getSelectedItem().toString());
					Partida.equipos.get(Partida.i).defender();
					Partida.i++;
					MarcoGeneral.FondoPanel.picture = Partida.fondos.get(Partida.i);
					JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
					pantalla.remove(this);
					pantalla.setContentPane(MarcoGeneral.fondo);
					pantalla.getContentPane().add(new PanelDecisionAD());
					pantalla.setVisible(true);
				} else {
					Partida.equipos.get(Partida.i).atacar();
					Partida.equipos.get(Partida.i).setAtacar(objetivoMisiles.getSelectedItem().toString());
					Partida.equipos.get(Partida.i).defender();
					try {
						Jugadores.partida.finRonda();

					}catch(Exception e2) {
						Main.partida.finRonda();
					}
					Partida.i = 0;
					MarcoGeneral.FondoPanel.picture = "/imagenes/fondo resumen.jpg";
					JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
					pantalla.remove(this);
					pantalla.setContentPane(MarcoGeneral.fondo);
					pantalla.getContentPane().add(new PanelResumen());
					pantalla.setVisible(true);
				}
			}

		}
	}

	//************************************************************************************
	//** Nombre del método: comprobarMisiles
	//** Explicación de lo que hace el método: comprueba que la cantidad de misiles
	//** introduidos sea correcta.
	//** Parámetros de entrada: -
	//** Parámetros de salida: -
	//************************************************************************************
	public boolean comprobarMisiles() {
		if (objetivoMisiles.getSelectedItem() != "Seleccionar" && ((Integer) cantidadA.getValue() > 0
				&& ((Integer) cantidadA.getValue() + 2 * (Integer) cantidadD.getValue()) > 0
				&& ((Integer) cantidadA.getValue() + 2 * (Integer) cantidadD.getValue()) == Partida.equipos
						.get(Partida.i).getMisiles_x_ronda())) {
			return true;
		} else if (((Integer) cantidadA.getValue() + 2 * (Integer) cantidadD.getValue()) > 0
				&& ((Integer) cantidadA.getValue() + 2 * (Integer) cantidadD.getValue()) > Partida.equipos
						.get(Partida.i).getMisiles_x_ronda()) {
			JOptionPane.showMessageDialog(null, "Total de misiles superior al máximo.", "Alerta",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}else if((Integer) cantidadA.getValue() < 0 || (Integer) cantidadD.getValue()<0) {
			JOptionPane.showMessageDialog(null, "No puedes utilizar misiles negativos.", "Alerta",
					JOptionPane.ERROR_MESSAGE);
			return false;
		} else if ((Integer) cantidadA.getValue() == 0 && (Integer) cantidadD.getValue() > 0
				&& 2 * (Integer) cantidadD.getValue() > 0
				&& 2 * (Integer) cantidadD.getValue() == Partida.equipos
						.get(Partida.i).getMisiles_x_ronda()) {
			return true;

		} else if ((Integer) cantidadA.getValue() > 0 && objetivoMisiles.getSelectedItem() == "Seleccionar") {
			JOptionPane.showMessageDialog(null, "No has seleccionado a quien quieres atacar.", "Alerta",
					JOptionPane.ERROR_MESSAGE);
			return false;
		} else if ((Integer) cantidadA.getValue() == 0 && (Integer) cantidadD.getValue() == 0) {
			JOptionPane.showMessageDialog(null, "Has introducido valores incorrectos.", "Alerta", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		else {
			JOptionPane.showMessageDialog(null, "No has utilizado todos tus misiles.", "Alerta",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
}
