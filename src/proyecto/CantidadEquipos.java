//David Blanco, Sergi Pifarré y Daniel Romero
package proyecto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Cursor;

public class CantidadEquipos extends JPanel implements ActionListener {
	private JButton continuar;
	private JButton volver;
	private JLabel texto;
	public static JComboBox desplegable1;

	//************************************************************************************
	//** Nombre del método: CantidadEquipos
	//** Explicación de lo que hace el método: constructor del panel donde se elige
	//** la cantidad de equipos.
	//** Parámetros de entrada: -
	//** Parámetros de salida: -
	//************************************************************************************
	public CantidadEquipos() {
		setMinimumSize(new Dimension(1280, 720));
		setPreferredSize(new Dimension(1280, 720));
		this.setOpaque(false);

		// inicializar los atributos
		volver = new JButton();
		volver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		volver.setOpaque(false);
		volver.setContentAreaFilled(false);
		volver.setBorder(null);
		volver.setIcon(new ImageIcon(PanelInicio.class.getResource("/imagenes/volver.png")));

		desplegable1 = new JComboBox();
		desplegable1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		desplegable1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		desplegable1.setModel(new DefaultComboBoxModel(
				new String[] { "Selecciona número de jugadores", "3", "4", "5", "6", "7", "8", "9", "10" }));
		((JLabel) desplegable1.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

		texto = new JLabel();
		texto.setForeground(Color.WHITE);
		texto.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		texto.setText("¿Cuantos equipos van a jugar?");

		continuar = new JButton();
		continuar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		continuar.setIcon(new ImageIcon(CantidadEquipos.class.getResource("/imagenes/continuar.png")));
		continuar.setOpaque(false);
		continuar.setContentAreaFilled(false);
		continuar.setBorder(null);
		continuar.setFocusable(false);

		continuar.addActionListener(this);
		volver.addActionListener(this);
		desplegable1.addActionListener(this);

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup().addGap(48).addComponent(volver).addContainerGap(1067,
						Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup().addContainerGap(827, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addComponent(texto)
								.addGroup(groupLayout.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED, 36, GroupLayout.PREFERRED_SIZE)
										.addComponent(continuar, GroupLayout.PREFERRED_SIZE, 199,
												GroupLayout.PREFERRED_SIZE)
										.addGap(35))
								.addGroup(groupLayout.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED, 12, GroupLayout.PREFERRED_SIZE)
										.addComponent(desplegable1, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(11)))
						.addGap(183)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap(247, Short.MAX_VALUE).addComponent(texto)
						.addGap(43)
						.addComponent(desplegable1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addGap(48).addComponent(continuar).addGap(112).addComponent(volver).addGap(71)));
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
		if (e.getSource() == continuar && desplegable1.getSelectedItem() != "Selecciona número de jugadores") {
			MarcoGeneral.FondoPanel.picture = "/imagenes/fondito.jpg";
			JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
			marco.remove(this);
			marco.setContentPane(MarcoGeneral.fondo);
			marco.getContentPane().add(new Jugadores());
			marco.setVisible(true);
		} else if (e.getSource() == continuar && desplegable1.getSelectedItem() == "Selecciona número de jugadores") {
			JOptionPane.showMessageDialog(null, "No has seleccionado número de jugadores.", "Alerta",
					JOptionPane.ERROR_MESSAGE);
		} else if (e.getSource() == volver) {
			MarcoGeneral.FondoPanel.picture = "/imagenes/fondo3.jpg";
			JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
			marco.remove(this);
			marco.setContentPane(MarcoGeneral.fondo);
			marco.getContentPane().add(new PanelInicio());
			marco.setVisible(true);
		}

	}
}
