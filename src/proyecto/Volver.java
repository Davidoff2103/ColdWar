//David Blanco, Sergi Pifarré y Daniel Romero
package proyecto;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import java.awt.Cursor;

public class Volver extends JPanel implements ActionListener {

	// elementos swing java: los más importantes JLabel, JButton, JComboBox
	private JButton boton1;
	
	//************************************************************************************
	//** Nombre del método: Volver
	//** Explicación de lo que hace el método: constructor del panel volver
	//** Parámetros de entrada: -
	//** Parámetros de salida: -
	//************************************************************************************
	public Volver() {
		this.setPreferredSize(new Dimension(1280, 720));
		this.setMinimumSize(new Dimension(1280, 720));
		this.setOpaque(false);
		
		// inicializar los atributos
		boton1 = new JButton();
		boton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton1.setOpaque(false);
		boton1.setContentAreaFilled(false);
		boton1.setBorder(null);
		boton1.setIcon(new ImageIcon(PanelInicio.class.getResource("/imagenes/volver.png")));

		boton1.addActionListener(this);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(1018, Short.MAX_VALUE)
					.addComponent(boton1)
					.addGap(97))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(539, Short.MAX_VALUE)
					.addComponent(boton1)
					.addGap(118))
		);
		setLayout(groupLayout);
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
		if (e.getSource() == boton1) {
			MarcoGeneral.FondoPanel.picture = "/imagenes/fondo3.jpg";
			JFrame pantalla = (JFrame) SwingUtilities.getWindowAncestor(this);
			pantalla.remove(this);
			pantalla.setContentPane(MarcoGeneral.fondo);
			pantalla.getContentPane().add(new PanelInicio());
			pantalla.setVisible(true);
		}
	}
}
