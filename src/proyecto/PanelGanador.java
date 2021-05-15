//David Blanco, Sergi Pifarré y Daniel Romero
package proyecto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import proyecto.Jugadores.Imagen;

import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PanelGanador extends JPanel implements ActionListener {
	private JButton jugar;
	private JButton salir;
	private JLabel ganador;
	private JLabel noGanador;
	private Imagen imagenGanador;
	
	//************************************************************************************
	//** Nombre del método: PanelGanador
	//** Explicación de lo que hace el método: constructor del panel que muestra el
	//** ganador de la partida.
	//** Parámetros de entrada: -
	//** Parámetros de salida: -
	//************************************************************************************
	public PanelGanador() {
		this.setPreferredSize(new Dimension(1280, 720));
		this.setMinimumSize(new Dimension(1280, 720));
		this.setOpaque(false);

		jugar = new JButton("");
		jugar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		salir = new JButton("");
		salir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		ganador = new JLabel("");
		ganador.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		ganador.setHorizontalAlignment(SwingConstants.CENTER);
		ganador.setForeground(Color.white);

		noGanador = new JLabel("");
		noGanador.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		noGanador.setHorizontalAlignment(SwingConstants.CENTER);
		noGanador.setForeground(Color.white);

		jugar.setBounds(1069, 577, 169, 73);
		jugar.setIcon(new ImageIcon(PanelDecisionAD.class.getResource("/imagenes/jugar.png")));
		jugar.setContentAreaFilled(false);
		jugar.setBorder(null);
		jugar.setFocusable(false);

		salir.setBounds(34, 587, 165, 63);
		salir.setIcon(new ImageIcon(PanelDecisionAD.class.getResource("/imagenes/salir.png")));
		salir.setContentAreaFilled(false);
		salir.setBorder(null);
		salir.setFocusable(false);
		setLayout(null);

		imagenGanador = new Imagen();
		
		if (Partida.equipos.size() == 1) {
			ganador.setBounds(274, 169, 352, 46);
			ganador.setText("¡El ganador es " + Partida.equipos.get(0).getNombre_equipo() + "!");
			imagenGanador = Jugadores.imagenes.get(0);
		} else {
			noGanador.setText("<html><div style='text-align: center;'>Nadie ha ganado.<br/><br/>Bills sigue estando por encima de todos.</html>");
			noGanador.setBounds(161, 250, 537, 127);
			imagenGanador.setVisible(false);
		}
		
		jugar.addActionListener(this);
		salir.addActionListener(this);
		
		imagenGanador.setBounds(412,324,60,60);
		
		add(ganador);
		add(noGanador);
		add(jugar);
		add(salir);
		add(imagenGanador);
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
		if (e.getSource() == jugar) {
			MarcoGeneral.FondoPanel.picture = "/imagenes/fondo3.jpg";
			JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
			pantalla.remove(this);
			pantalla.setContentPane(MarcoGeneral.fondo);
			pantalla.getContentPane().add(new PanelInicio());
			pantalla.setVisible(true);
		} else if (e.getSource() == salir) {
			MarcoGeneral.FondoPanel.picture = "/imagenes/exit.jpg";
			JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
			pantalla.remove(this);
			pantalla.setContentPane(MarcoGeneral.fondo);
			pantalla.getContentPane().add(new PanelSalir());
			pantalla.setVisible(true);
		}
	}
}
