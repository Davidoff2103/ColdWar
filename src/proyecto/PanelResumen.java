//David Blanco, Sergi Pifarré y Daniel Romero
package proyecto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import proyecto.Jugadores.Imagen;

import java.awt.Font;
import java.awt.Cursor;

public class PanelResumen extends JPanel implements ActionListener {
	private JTextArea texto;
	private JScrollPane scroll;
	private JButton continuar;
	private JButton guardar;
	private JButton salir;
	private Imagen resumen;

	//************************************************************************************
	//** Nombre del método: PanelResumen
	//** Explicación de lo que hace el método: constructor del panel que muestra
	//** el resumen de cada ronda al final de cada una.
	//** Parámetros de entrada: -
	//** Parámetros de salida: -
	//************************************************************************************
	public PanelResumen() {
		this.setPreferredSize(new Dimension(1280, 720));
		this.setMinimumSize(new Dimension(1280, 720));
		this.setOpaque(false);

		texto = new JTextArea();
		texto.setFont(new Font("Bahnschrift", Font.PLAIN, 17));

		scroll = new JScrollPane(texto);
		scroll.setBounds(74, 214, 608, 291);
		scroll.setOpaque(false);
		scroll.getViewport().setOpaque(false);
		scroll.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		texto.setBounds(74, 210, 608, 291);
		texto.setEditable(false);
		texto.setForeground(Color.black);
		texto.setLineWrap(true);
		texto.setWrapStyleWord(true);
		texto.setOpaque(false);
		texto.setHighlighter(null);

		continuar = new JButton();
		continuar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		continuar.setBounds(1079, 591, 169, 73);
		continuar.setIcon(new ImageIcon(PanelDecisionAD.class.getResource("/imagenes/continuar.png")));
		continuar.setContentAreaFilled(false);
		continuar.setBorder(null);
		continuar.setFocusable(false);

		guardar = new JButton();
		guardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		guardar.setBounds(1089, 11, 169, 73);
		guardar.setIcon(new ImageIcon(PanelDecisionAD.class.getResource("/imagenes/guardar.png")));
		guardar.setContentAreaFilled(false);
		guardar.setBorder(null);
		guardar.setFocusable(false);

		continuar.addActionListener(this);
		guardar.addActionListener(this);

		for (int i = 0; i < Partida.frases.size(); i++) {
			texto.append(Partida.frases.get(i) + "\n\n");
		}

		salir = new JButton();
		salir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		salir.setBounds(26, 11, 169, 73);
		salir.setIcon(new ImageIcon(PanelDecisionAD.class.getResource("/imagenes/salir.png")));
		salir.setContentAreaFilled(false);
		salir.setBorder(null);
		salir.setFocusable(false);
		salir.addActionListener(this);

		resumen = new Imagen();
		resumen.picture = "/imagenes/resumen.png";
		resumen.setSize(646, 337);
		resumen.setLocation(55, 191);

		add(salir);
		add(scroll);
		add(resumen);
		add(continuar);
		add(guardar);

		setLayout(null);

		setVisible(true);
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
		if (e.getSource() == continuar) {
			if (Partida.equipos.size() > 1) {
				Partida.ronda++;
				MarcoGeneral.FondoPanel.picture = Partida.fondos.get(Partida.i);
				JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
				pantalla.remove(this);
				pantalla.setContentPane(MarcoGeneral.fondo);
				pantalla.getContentPane().add(new PanelDecisionAD());
				pantalla.setVisible(true);
			} else if(Partida.equipos.size() == 1){
				MarcoGeneral.FondoPanel.picture = "/imagenes/fondo bills 2.jpg";
				JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
				pantalla.remove(this);
				pantalla.setContentPane(MarcoGeneral.fondo);
				pantalla.getContentPane().add(new PanelGanador());
				pantalla.setVisible(true);
			} else {
				MarcoGeneral.FondoPanel.picture = "/imagenes/fondo bills.jpg";
				JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
				pantalla.remove(this);
				pantalla.setContentPane(MarcoGeneral.fondo);
				pantalla.getContentPane().add(new PanelGanador());
				pantalla.setVisible(true);
			}

		} else if (e.getSource() == guardar) {
			Main.createStatement(Main.con);
			if (Main.guardado == true) {
				guardar.setEnabled(false);
				JOptionPane.showMessageDialog(null, "Partida guardada", "Alerta", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "No se ha podido guardar. Vuelve a intentarlo", "Alerta",
						JOptionPane.ERROR_MESSAGE);
			}

		} else if (e.getSource() == salir) {
			Partida.ronda = 1;
			MarcoGeneral.FondoPanel.picture = "/imagenes/fondo3.jpg";
			JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
			pantalla.remove(this);
			pantalla.setContentPane(MarcoGeneral.fondo);
			pantalla.getContentPane().add(new PanelInicio());
			pantalla.setVisible(true);
		}
	}
}
