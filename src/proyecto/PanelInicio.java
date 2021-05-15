//David Blanco, Sergi Pifarré y Daniel Romero
package proyecto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import proyecto.Jugadores.Imagen;

import java.awt.Cursor;

public class PanelInicio extends JPanel implements ActionListener {
	private JButton jugar;
	private JButton reglas;
	private JButton info;
	private JButton cargar;
	private JButton salir;
	private Imagen imagen;

	//************************************************************************************
	//** Nombre del método: PanelInicio
	//** Explicación de lo que hace el método: constructor del panel de la pantalla
	//** principal
	//** Parámetros de entrada: -
	//** Parámetros de salida: -
	//************************************************************************************
	public PanelInicio() {
		this.setPreferredSize(new Dimension(1280, 720));
		this.setMinimumSize(new Dimension(1280, 720));
		this.setOpaque(false);
		
		jugar = new JButton();
		jugar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jugar.setOpaque(false);
		jugar.setContentAreaFilled(false);
		jugar.setBorder(null);
		jugar.setIcon(new ImageIcon(PanelInicio.class.getResource("/imagenes/jugar.png")));
		
		reglas = new JButton();
		reglas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		reglas.setOpaque(false);
		reglas.setContentAreaFilled(false);
		reglas.setBorder(null);
		reglas.setIcon(new ImageIcon(PanelInicio.class.getResource("/imagenes/reglas.png")));
		
		info = new JButton();
		info.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		info.setOpaque(false);
		info.setContentAreaFilled(false);
		info.setBorder(null);
		info.setIcon(new ImageIcon(PanelInicio.class.getResource("/imagenes/info.png")));
		
		cargar = new JButton();
		cargar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cargar.setOpaque(false);
		cargar.setContentAreaFilled(false);
		cargar.setBorder(null);
		cargar.setIcon(new ImageIcon(PanelInicio.class.getResource("/imagenes/cargar.png")));
		
		salir = new JButton();
		salir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		salir.setOpaque(false);
		salir.setContentAreaFilled(false);
		salir.setBorder(null);
		salir.setIcon(new ImageIcon(PanelInicio.class.getResource("/imagenes/salir.png")));

		imagen = new Imagen();
		imagen.picture = "/imagenes/titulo.png";
		imagen.setBounds(400, 20, 533, 130);
		
		add(imagen);

		salir.setBackground(Color.red);

		jugar.addActionListener(this);
		reglas.addActionListener(this);
		info.addActionListener(this);
		cargar.addActionListener(this);
		salir.addActionListener(this);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(556)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(jugar)
								.addGroup(groupLayout.createSequentialGroup().addGap(1).addComponent(salir))
								.addGroup(groupLayout.createSequentialGroup().addGap(2).addComponent(cargar))
								.addGroup(groupLayout.createSequentialGroup().addGap(3).addComponent(info))
								.addGroup(groupLayout.createSequentialGroup().addGap(4).addComponent(reglas)))
						.addContainerGap(555, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
				groupLayout.createSequentialGroup().addGap(174).addComponent(jugar)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(reglas)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(info)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(cargar)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(salir)
						.addContainerGap(195, Short.MAX_VALUE)));
		setLayout(groupLayout);
	}

	//************************************************************************************
	//** Nombre del método: actionPerformed
	//** Explicación de lo que hace el método: para detectar la pulsación en los botones
	//** Parámetros de entrada: ActionEvent e
	//** Parámetros de salida: -
	//************************************************************************************
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jugar) {
			PanelCargar.cargado = false;
			MarcoGeneral.FondoPanel.picture = "/imagenes/equipos.png";
			JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
			pantalla.remove(this);
			pantalla.setContentPane(MarcoGeneral.fondo);
			pantalla.getContentPane().add(new CantidadEquipos());
			pantalla.setVisible(true);
		} else if (e.getSource() == reglas) {
			MarcoGeneral.FondoPanel.picture = "/imagenes/panel reglas.png";
			JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
			pantalla.remove(this);
			pantalla.setContentPane(MarcoGeneral.fondo);
			pantalla.getContentPane().add(new Volver());
			pantalla.setVisible(true);
		} else if (e.getSource() == info) {
			MarcoGeneral.FondoPanel.picture = "/imagenes/informacion.png";
			JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
			pantalla.remove(this);
			pantalla.setContentPane(MarcoGeneral.fondo);
			pantalla.getContentPane().add(new Volver());
			pantalla.setVisible(true);
		} else if (e.getSource() == cargar) {
			try {
				Main.selectWithStatement(Main.con);
				MarcoGeneral.FondoPanel.picture = "/imagenes/cargar partida.png";
				JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
				pantalla.remove(this);
				pantalla.setContentPane(MarcoGeneral.fondo);
				pantalla.getContentPane().add(new PanelCargar());
				Main.selectPartidas(Main.con);
				pantalla.setVisible(true);
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Conectando a la base de datos. Por favor, espere", "Alerta",
						JOptionPane.INFORMATION_MESSAGE);
			}
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
